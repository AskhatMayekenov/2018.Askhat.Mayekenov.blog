package kz.greetgo.blog.server.app;
public final class ApplicationBeanContainerAutomaticallyGeneratedImplementation implements kz.greetgo.blog.server.app.ApplicationBeanContainer{

  private final java.lang.Object forSynchronizedBlocks = new java.lang.Object();

  //
  // Bean container methods
  //

  @java.lang.Override
  public kz.greetgo.blog.server.beans.AppInitializer appInitializer() {
    return getter_native_AppInitializer_9.get();
  }

  //
  // Bean creations
  //

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.controller.controller.TestController> cachedValue_native_TestController_1 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.controller.controller.TestController> getter_native_TestController_1 = this::get_native_TestController_1;
  private kz.greetgo.blog.controller.controller.TestController get_native_TestController_1 () {
    {
      kz.greetgo.blog.controller.controller.TestController x = cachedValue_native_TestController_1.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.controller.controller.TestController x = cachedValue_native_TestController_1.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.controller.controller.TestController localValue = new kz.greetgo.blog.controller.controller.TestController();
        localValue.testRegisterBean = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.controller.register.TestRegister>)(java.lang.Object)getter_native_TestRegisterImpl_8;
        cachedValue_native_TestController_1.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.beans.postgres.AllConfigFactory> cachedValue_native_AllConfigFactory_2 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.beans.postgres.AllConfigFactory> getter_native_AllConfigFactory_2 = this::get_native_AllConfigFactory_2;
  private kz.greetgo.blog.register.beans.postgres.AllConfigFactory get_native_AllConfigFactory_2 () {
    {
      kz.greetgo.blog.register.beans.postgres.AllConfigFactory x = cachedValue_native_AllConfigFactory_2.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.beans.postgres.AllConfigFactory x = cachedValue_native_AllConfigFactory_2.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.beans.postgres.AllConfigFactory localValue = new kz.greetgo.blog.register.beans.postgres.AllConfigFactory();
        cachedValue_native_AllConfigFactory_2.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.beans.postgres.DaoImplFactory> cachedValue_native_DaoImplFactory_3 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.beans.postgres.DaoImplFactory> getter_native_DaoImplFactory_3 = this::get_native_DaoImplFactory_3;
  private kz.greetgo.blog.register.beans.postgres.DaoImplFactory get_native_DaoImplFactory_3 () {
    {
      kz.greetgo.blog.register.beans.postgres.DaoImplFactory x = cachedValue_native_DaoImplFactory_3.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.beans.postgres.DaoImplFactory x = cachedValue_native_DaoImplFactory_3.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.beans.postgres.DaoImplFactory localValue = new kz.greetgo.blog.register.beans.postgres.DaoImplFactory();
        localValue.dbSessionFactory = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.beans.postgres.DbSessionFactory>)(java.lang.Object)getter_native_DbSessionFactory_4;
        cachedValue_native_DaoImplFactory_3.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.beans.postgres.DbSessionFactory> cachedValue_native_DbSessionFactory_4 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.beans.postgres.DbSessionFactory> getter_native_DbSessionFactory_4 = this::get_native_DbSessionFactory_4;
  private kz.greetgo.blog.register.beans.postgres.DbSessionFactory get_native_DbSessionFactory_4 () {
    {
      kz.greetgo.blog.register.beans.postgres.DbSessionFactory x = cachedValue_native_DbSessionFactory_4.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.beans.postgres.DbSessionFactory x = cachedValue_native_DbSessionFactory_4.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.beans.postgres.DbSessionFactory localValue = new kz.greetgo.blog.register.beans.postgres.DbSessionFactory();
        localValue.dbConfig = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.config.DbConfig>)(java.lang.Object)getter_native_DbConfig_6;
        localValue.afterInject();
        cachedValue_native_DbSessionFactory_4.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl> cachedValue_native_LiquibaseManagerImpl_5 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl> getter_native_LiquibaseManagerImpl_5 = this::get_native_LiquibaseManagerImpl_5;
  private kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl get_native_LiquibaseManagerImpl_5 () {
    {
      kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl x = cachedValue_native_LiquibaseManagerImpl_5.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl x = cachedValue_native_LiquibaseManagerImpl_5.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl localValue = new kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl();
        localValue.dbConfig = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.config.DbConfig>)(java.lang.Object)getter_native_DbConfig_6;
        cachedValue_native_LiquibaseManagerImpl_5.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.config.DbConfig> cachedValue_native_DbConfig_6 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.config.DbConfig> getter_native_DbConfig_6 = this::get_native_DbConfig_6;
  private kz.greetgo.blog.register.config.DbConfig get_native_DbConfig_6 () {
    {
      kz.greetgo.blog.register.config.DbConfig x = cachedValue_native_DbConfig_6.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.config.DbConfig x = cachedValue_native_DbConfig_6.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.config.DbConfig localValue = getter_native_AllConfigFactory_2.get().createDbConfig();
        cachedValue_native_DbConfig_6.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.dao.postgres.TestDaoPostgres> cachedValue_native_TestDaoPostgres_7 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.dao.postgres.TestDaoPostgres> getter_native_TestDaoPostgres_7 = this::get_native_TestDaoPostgres_7;
  private kz.greetgo.blog.register.dao.postgres.TestDaoPostgres get_native_TestDaoPostgres_7 () {
    {
      kz.greetgo.blog.register.dao.postgres.TestDaoPostgres x = cachedValue_native_TestDaoPostgres_7.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.dao.postgres.TestDaoPostgres x = cachedValue_native_TestDaoPostgres_7.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.dao.postgres.TestDaoPostgres localValue = (kz.greetgo.blog.register.dao.postgres.TestDaoPostgres) getter_native_DaoImplFactory_3.get().createBean(kz.greetgo.blog.register.dao.postgres.TestDaoPostgres.class);
        cachedValue_native_TestDaoPostgres_7.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.impl.TestRegisterImpl> cachedValue_native_TestRegisterImpl_8 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.impl.TestRegisterImpl> getter_native_TestRegisterImpl_8 = this::get_native_TestRegisterImpl_8;
  private kz.greetgo.blog.register.impl.TestRegisterImpl get_native_TestRegisterImpl_8 () {
    {
      kz.greetgo.blog.register.impl.TestRegisterImpl x = cachedValue_native_TestRegisterImpl_8.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.impl.TestRegisterImpl x = cachedValue_native_TestRegisterImpl_8.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.impl.TestRegisterImpl localValue = new kz.greetgo.blog.register.impl.TestRegisterImpl();
        localValue.testDao = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.dao.TestDao>)(java.lang.Object)getter_native_TestDaoPostgres_7;
        cachedValue_native_TestRegisterImpl_8.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.server.beans.AppInitializer> cachedValue_native_AppInitializer_9 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.server.beans.AppInitializer> getter_native_AppInitializer_9 = this::get_native_AppInitializer_9;
  private kz.greetgo.blog.server.beans.AppInitializer get_native_AppInitializer_9 () {
    {
      kz.greetgo.blog.server.beans.AppInitializer x = cachedValue_native_AppInitializer_9.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.server.beans.AppInitializer x = cachedValue_native_AppInitializer_9.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.server.beans.AppInitializer localValue = new kz.greetgo.blog.server.beans.AppInitializer();
        localValue.controllerServlet = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.server.beans.ControllerServlet>)(java.lang.Object)getter_native_ControllerServlet_10;
        localValue.liquibaseManager = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.util.LiquibaseManager>)(java.lang.Object)getter_native_LiquibaseManagerImpl_5;
        localValue.utf8AndTraceResetFilter = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter>)(java.lang.Object)getter_native_Utf8AndTraceResetFilter_11;
        cachedValue_native_AppInitializer_9.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.server.beans.ControllerServlet> cachedValue_native_ControllerServlet_10 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.server.beans.ControllerServlet> getter_native_ControllerServlet_10 = this::get_native_ControllerServlet_10;
  private kz.greetgo.blog.server.beans.ControllerServlet get_native_ControllerServlet_10 () {
    {
      kz.greetgo.blog.server.beans.ControllerServlet x = cachedValue_native_ControllerServlet_10.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.server.beans.ControllerServlet x = cachedValue_native_ControllerServlet_10.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.server.beans.ControllerServlet localValue = new kz.greetgo.blog.server.beans.ControllerServlet();
        localValue.controllerList = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.blog.controller.utils.Controller>>)(java.lang.Object)getter_ref_list_Controller_13;
        localValue.views = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.mvc.interfaces.Views>)(java.lang.Object)getter_native_WarEducationViews_12;
        cachedValue_native_ControllerServlet_10.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter> cachedValue_native_Utf8AndTraceResetFilter_11 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter> getter_native_Utf8AndTraceResetFilter_11 = this::get_native_Utf8AndTraceResetFilter_11;
  private kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter get_native_Utf8AndTraceResetFilter_11 () {
    {
      kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter x = cachedValue_native_Utf8AndTraceResetFilter_11.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter x = cachedValue_native_Utf8AndTraceResetFilter_11.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter localValue = new kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter();
        cachedValue_native_Utf8AndTraceResetFilter_11.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.server.beans.WarEducationViews> cachedValue_native_WarEducationViews_12 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.server.beans.WarEducationViews> getter_native_WarEducationViews_12 = this::get_native_WarEducationViews_12;
  private kz.greetgo.blog.server.beans.WarEducationViews get_native_WarEducationViews_12 () {
    {
      kz.greetgo.blog.server.beans.WarEducationViews x = cachedValue_native_WarEducationViews_12.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.server.beans.WarEducationViews x = cachedValue_native_WarEducationViews_12.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.server.beans.WarEducationViews localValue = new kz.greetgo.blog.server.beans.WarEducationViews();
        cachedValue_native_WarEducationViews_12.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  //
  // Bean references
  //

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.blog.controller.utils.Controller>> getter_ref_list_Controller_13 = this::get_ref_list_Controller_13;
  private java.util.List<kz.greetgo.blog.controller.utils.Controller> get_ref_list_Controller_13() {
    java.util.List<kz.greetgo.blog.controller.utils.Controller> list = new java.util.ArrayList<>();
    list.add(getter_native_TestController_1.get());
    return list;
  }
  
  //
  // Getter creations
  //
}
