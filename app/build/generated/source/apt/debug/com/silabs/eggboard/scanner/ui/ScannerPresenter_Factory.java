package com.silabs.eggboard.scanner.ui;

import com.silabs.eggboard.ble.BleManager;
import com.silabs.eggboard.common.data.PreferenceManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ScannerPresenter_Factory implements Factory<ScannerPresenter> {
  private final Provider<BleManager> bleManagerProvider;
  private final Provider<PreferenceManager> prefsManagerProvider;

  public ScannerPresenter_Factory(Provider<BleManager> bleManagerProvider, Provider<PreferenceManager> prefsManagerProvider) {  
    assert bleManagerProvider != null;
    this.bleManagerProvider = bleManagerProvider;
    assert prefsManagerProvider != null;
    this.prefsManagerProvider = prefsManagerProvider;
  }

  @Override
  public ScannerPresenter get() {  
    return new ScannerPresenter(bleManagerProvider.get(), prefsManagerProvider.get());
  }

  public static Factory<ScannerPresenter> create(Provider<BleManager> bleManagerProvider, Provider<PreferenceManager> prefsManagerProvider) {  
    return new ScannerPresenter_Factory(bleManagerProvider, prefsManagerProvider);
  }
}

