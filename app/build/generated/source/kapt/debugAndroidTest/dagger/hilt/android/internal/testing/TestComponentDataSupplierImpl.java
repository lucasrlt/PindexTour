package dagger.hilt.android.internal.testing;

import com.pindex.main.home.HomeActivityInstrumentedTest;
import com.pindex.main.home.HomeActivityInstrumentedTest_ComponentDataHolder;
import java.lang.Class;
import java.lang.Override;
import java.util.HashMap;
import java.util.Map;

public final class TestComponentDataSupplierImpl extends TestComponentDataSupplier {
  private final Map<Class<?>, TestComponentData> testComponentDataMap = new HashMap<>(1);

  TestComponentDataSupplierImpl() {
    testComponentDataMap.put(HomeActivityInstrumentedTest.class, HomeActivityInstrumentedTest_ComponentDataHolder.get());
  }

  @Override
  protected Map<Class<?>, TestComponentData> get() {
    return testComponentDataMap;
  }
}
