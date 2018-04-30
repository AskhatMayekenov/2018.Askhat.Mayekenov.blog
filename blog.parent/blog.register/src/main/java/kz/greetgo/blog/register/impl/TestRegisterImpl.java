package kz.greetgo.blog.register.impl;

import kz.greetgo.blog.controller.register.TestRegister;
import kz.greetgo.blog.register.dao.TestDao;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;

@Bean
public class TestRegisterImpl implements TestRegister{

  public BeanGetter<TestDao> testDao;

  @Override
  public String getText() {
    return testDao.get().getTestText();
  }
}
