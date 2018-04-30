package kz.greetgo.blog.register.test.util;

import kz.greetgo.blog.register.beans.postgres.AllBeanConfig;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;

@BeanConfig
@Include({AllBeanConfig.class})
public class BeanContainerForTest {
}
