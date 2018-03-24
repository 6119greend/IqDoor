package com.silabs.eggboard.common.ui;

import com.silabs.eggboard.ble.BleManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class StatusPresenter_Factory implements Factory<StatusPresenter> {
  private final Provider<BleManager> bleManagerProvider;

  public StatusPresenter_Factory(Provider<BleManager> bleManagerProvider) {  
    assert bleManagerProvider != null;
    this.bleManagerProvider = bleManagerProvider;
  }

  @Override
  public StatusPresenter get() {  
    return new StatusPresenter(bleManagerProvider.get());
  }

  public static Factory<StatusPresenter> create(Provider<BleManager> bleManagerProvider) {  
    return new StatusPresenter_Factory(bleManagerProvider);
  }
}

