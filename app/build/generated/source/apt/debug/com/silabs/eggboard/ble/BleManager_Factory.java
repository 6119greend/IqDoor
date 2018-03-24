package com.silabs.eggboard.ble;

import android.content.Context;
import com.silabs.eggboard.common.data.PreferenceManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BleManager_Factory implements Factory<BleManager> {
  private final Provider<Context> contextProvider;
  private final Provider<PreferenceManager> prefsManagerProvider;

  public BleManager_Factory(Provider<Context> contextProvider, Provider<PreferenceManager> prefsManagerProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert prefsManagerProvider != null;
    this.prefsManagerProvider = prefsManagerProvider;
  }

  @Override
  public BleManager get() {  
    return new BleManager(contextProvider.get(), prefsManagerProvider.get());
  }

  public static Factory<BleManager> create(Provider<Context> contextProvider, Provider<PreferenceManager> prefsManagerProvider) {  
    return new BleManager_Factory(contextProvider, prefsManagerProvider);
  }
}

