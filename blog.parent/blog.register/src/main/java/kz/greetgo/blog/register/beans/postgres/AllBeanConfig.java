package kz.greetgo.blog.register.beans.postgres;

import kz.greetgo.blog.controller.controller.BeanConfigForPackageController;
import kz.greetgo.blog.register.dao.postgres.DaoBeanConfig;
import kz.greetgo.blog.register.impl.BeanScannerForImpl;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import kz.greetgo.depinject.core.Include;

@BeanConfig
@BeanScanner
@Include({DaoBeanConfig.class, BeanScannerForImpl.class, BeanConfigForPackageController.class})
public class AllBeanConfig {
}
