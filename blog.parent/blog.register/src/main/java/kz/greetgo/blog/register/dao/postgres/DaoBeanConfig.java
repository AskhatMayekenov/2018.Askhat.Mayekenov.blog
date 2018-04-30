package kz.greetgo.blog.register.dao.postgres;

import kz.greetgo.blog.register.beans.postgres.DaoImplFactory;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;

@BeanConfig(defaultFactoryClass = DaoImplFactory.class)
@BeanScanner
public class DaoBeanConfig {
}
