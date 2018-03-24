package com.silabs.eggboard.demos.ui;

import com.silabs.eggboard.ble.BleManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DemosPresenter_Factory implements Factory<DemosPresenter> {
  private final Provider<BleManager> bleManagerProvider;

  public DemosPresenter_Factory(Provider<BleManager> bleManagerProvider) {  
    assert bleManagerProvider != null;
    this.bleManagerProvider = bleManagerProvider;
  }

  @Override
  public DemosPresenter get() {  
    return new DemosPresenter(bleManagerProvider.get());
  }

  public static Factory<DemosPresenter> create(Provider<BleManager> bleManagerProvider) {  
    return new DemosPresenter_Factory(bleManagerProvider);
  }
}

