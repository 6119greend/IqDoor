package com.silabs.eggboard.web;

import android.content.Context;
import com.silabs.eggboard.common.data.PreferenceManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CloudManager_Factory implements Factory<CloudManager> {
  private final Provider<Context> contextProvider;
  private final Provider<String> baseDataUrlProvider;
  private final Provider<String> baseDemoUrlProvider;
  private final Provider<String> keyFirebaseProvider;
  private final Provider<PreferenceManager> prefsManagerProvider;

  public CloudManager_Factory(Provider<Context> contextProvider, Provider<String> baseDataUrlProvider, Provider<String> baseDemoUrlProvider, Provider<String> keyFirebaseProvider, Provider<PreferenceManager> prefsManagerProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert baseDataUrlProvider != null;
    this.baseDataUrlProvider = baseDataUrlProvider;
    assert baseDemoUrlProvider != null;
    this.baseDemoUrlProvider = baseDemoUrlProvider;
    assert keyFirebaseProvider != null;
    this.keyFirebaseProvider = keyFirebaseProvider;
    assert prefsManagerProvider != null;
    this.prefsManagerProvider = prefsManagerProvider;
  }

  @Override
  public CloudManager get() {  
    return new CloudManager(contextProvider.get(), baseDataUrlProvider.get(), baseDemoUrlProvider.get(), keyFirebaseProvider.get(), prefsManagerProvider.get());
  }

  public static Factory<CloudManager> create(Provider<Context> contextProvider, Provider<String> baseDataUrlProvider, Provider<String> baseDemoUrlProvider, Provider<String> keyFirebaseProvider, Provider<PreferenceManager> prefsManagerProvider) {  
    return new CloudManager_Factory(contextProvider, baseDataUrlProvider, baseDemoUrlProvider, keyFirebaseProvider, prefsManagerProvider);
  }
}

