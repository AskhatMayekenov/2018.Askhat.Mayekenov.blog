package kz.greetgo.blog.register.util;

import kz.greetgo.db.AbstractJdbcWithDataSource;
import kz.greetgo.db.TransactionManager;

import javax.sql.DataSource;

public class JdbcBlog  extends AbstractJdbcWithDataSource {

  DataSource dataSource;
  TransactionManager transactionManager;

  public  JdbcBlog(DataSource dataSource, TransactionManager transactionManager){
    this.dataSource = dataSource;
    this.transactionManager = transactionManager;
  }

  @Override
  protected DataSource getDataSource() {
    return dataSource;
  }

  @Override
  protected TransactionManager getTransactionManager() {
    return transactionManager;
  }
}
