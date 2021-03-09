package com.pindex.main.home;

import androidx.test.core.app.ApplicationProvider;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.testing.TestComponentData;
import dagger.hilt.android.internal.testing.TestInjector;
import dagger.hilt.internal.GeneratedComponentManager;
import java.lang.SuppressWarnings;
import java.util.Collections;

public final class HomeActivityInstrumentedTest_ComponentDataHolder {
  private HomeActivityInstrumentedTest_ComponentDataHolder() {
  }

  public static TestComponentData get() {
    return new TestComponentData(false, testInstance -> injectInternal((HomeActivityInstrumentedTest) testInstance), Collections.emptySet(), Collections.emptySet(), (modules, testInstance, autoAddModuleEnabled) -> DaggerHomeActivityInstrumentedTest_HiltComponents_SingletonC.builder()
        .applicationContextModule(new ApplicationContextModule(ApplicationProvider.getApplicationContext()))
        .build());
  }

  @SuppressWarnings("unchecked")
  private static void injectInternal(HomeActivityInstrumentedTest testInstance) {
    ((TestInjector) ((GeneratedComponentManager) ApplicationProvider.getApplicationContext()).generatedComponent()).injectTest(testInstance);
  }
}
