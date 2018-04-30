'use strict';

const gulp = require('gulp');
const ser = gulp.series;
const par = gulp.parallel;
const task = gulp.task;
const del = require('del');
const less = require('gulp-less');
const path = require('path');
const pug = require('gulp-pug');
const browserSync = require('browser-sync').create();
const webpack = require('webpack');
const gulpLog = require('gulplog');
const notifier = require('node-notifier');
const rename = require('gulp-rename');

let isWatch = true;

function outDir() {
  return path.resolve(__dirname, 'build', 'public', 'blog');
}

task('clean', function () {
  return del(['build']);
});

task('copy', function () {
  return gulp.src([
    "node_modules/zone.js/dist/zone.min.js",
    "node_modules/core-js/client/shim.min.js"
  ]).pipe(gulp.dest(path.resolve(outDir(), 'js')));
});

task('less', function () {
  return gulp.src("front/less/main.less").pipe(less()).
  pipe(gulp.dest(path.resolve(outDir(), 'css')));
});

task('pug', function () {
  return gulp.src("front/pug/index.pug").pipe(pug({pretty: true}))
    .on("error", console.log)
    .pipe(gulp.dest(outDir()));
});

task('pug_main', function () {
  return gulp.src("front/pug/index_main.pug").pipe(pug({pretty: true}))
    .on("error", console.log)
    .pipe(rename(function (path) {
      ['_main'].forEach(e => {
        if (path.basename.endsWith(e)) {
          path.basename = path.basename.slice(0, -e.length);
        }
      });
    }))
    .pipe(gulp.dest(outDir()));
});


task('assets', ser('less', 'pug'));

task('assets_main', ser('less', 'pug_main'));

task('webpack', function (callback) {

  let options = {
    entry: [path.resolve('.', 'front', 'ts', 'main.ts')],
    output: {
      path: path.resolve(outDir(), 'js'),
      publicPath: '/',
      filename: '[name].js',
      sourceMapFilename: '[name].js.map',
    },
    watch: isWatch,
    devtool: 'cheap-module-inline-source-map',
    module: {
      loaders: [{
        test: /\.ts$/,
        include: path.resolve(__dirname, 'front', 'ts'),
        loader: ['ts-loader'],
      },{
        test:/\.(html|css)$/,
        loader: 'raw-loader'
      }],
    },
    resolve: {
      extensions: [".ts", ".js"]
    },
    plugins: [
      new webpack.NoEmitOnErrorsPlugin() // otherwise error still gives a file
    ]
  };

  webpack(options, function (err, stats) {
    if (!err) { // no hard error
      // try to get a soft error from stats
      err = stats.toJson().errors[0];
    }

    if (err) {
      notifier.notify({
        title: 'Webpack',
        message: err
      });

      gulpLog.error(err);
    } else {
      gulpLog.info(stats.toString({
        colors: true
      }));
    }

    // task never errs in watch mode, it waits and recompile
    if (!options.watch && err) {
      callback(err);
    } else {
      callback();
    }

  });
});

task('build', ser(
  'clean', 'copy', function (callback) {
    isWatch = false;
    callback();
  }, "webpack", "assets_main"
));

task('server', function (back) {
  browserSync.init({server: path.resolve('build', 'public', 'blog')});

  browserSync.watch('build/public/**/*.*').on('change', browserSync.reload);

  back();
});

task('start', ser(
  'clean', 'assets', 'copy', function (callback) {
    isWatch = true;
    callback();
  }, 'webpack', 'server',
  function () {
    gulp.watch('front/pug/**/*.pug', ser('pug'));
    gulp.watch('front/less/**/*.less', ser('less'));
  }
));


