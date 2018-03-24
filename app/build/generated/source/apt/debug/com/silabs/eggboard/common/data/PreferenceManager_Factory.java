package com.silabs.eggboard.common.data;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class PreferenceManager_Factory implements Factory<PreferenceManager> {
  private final Provider<Context> contextProvider;

  public PreferenceManager_Factory(Provider<Context> contextProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public PreferenceManager get() {  
    return new PreferenceManager(contextProvider.get());
  }

  public static Factory<PreferenceManager> create(Provider<Context> contextProvider) {  
    return new PreferenceManager_Factory(contextProvider);
  }
}

