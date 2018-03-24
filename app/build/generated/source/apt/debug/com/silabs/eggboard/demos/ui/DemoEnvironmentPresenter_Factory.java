package com.silabs.eggboard.demos.ui;

import com.silabs.eggboard.ble.BleManager;
import com.silabs.eggboard.common.data.PreferenceManager;
import com.silabs.eggboard.web.CloudManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DemoEnvironmentPresenter_Factory implements Factory<DemoEnvironmentPresenter> {
  private final MembersInjector<DemoEnvironmentPresenter> membersInjector;
  private final Provider<BleManager> bleManagerProvider;
  private final Provider<CloudManager> cloudManagerProvider;
  private final Provider<PreferenceManager> preferenceManagerProvider;

  public DemoEnvironmentPresenter_Factory(MembersInjector<DemoEnvironmentPresenter> membersInjector, Provider<BleManager> bleManagerProvider, Provider<CloudManager> cloudManagerProvider, Provider<PreferenceManager> preferenceManagerProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert bleManagerProvider != null;
    this.bleManagerProvider = bleManagerProvider;
    assert cloudManagerProvider != null;
    this.cloudManagerProvider = cloudManagerProvider;
    assert preferenceManagerProvider != null;
    this.preferenceManagerProvider = preferenceManagerProvider;
  }

  @Override
  public DemoEnvironmentPresenter get() {  
    DemoEnvironmentPresenter instance = new DemoEnvironmentPresenter(bleManagerProvider.get(), cloudManagerProvider.get(), preferenceManagerProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<DemoEnvironmentPresenter> create(MembersInjector<DemoEnvironmentPresenter> membersInjector, Provider<BleManager> bleManagerProvider, Provider<CloudManager> cloudManagerProvider, Provider<PreferenceManager> preferenceManagerProvider) {  
    return new DemoEnvironmentPresenter_Factory(membersInjector, bleManagerProvider, cloudManagerProvider, preferenceManagerProvider);
  }
}

