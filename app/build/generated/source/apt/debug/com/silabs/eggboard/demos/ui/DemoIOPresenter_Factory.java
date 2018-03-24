package com.silabs.eggboard.demos.ui;

import com.silabs.eggboard.ble.BleManager;
import com.silabs.eggboard.web.CloudManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DemoIOPresenter_Factory implements Factory<DemoIOPresenter> {
  private final MembersInjector<DemoIOPresenter> membersInjector;
  private final Provider<BleManager> bleManagerProvider;
  private final Provider<CloudManager> cloudManagerProvider;

  public DemoIOPresenter_Factory(MembersInjector<DemoIOPresenter> membersInjector, Provider<BleManager> bleManagerProvider, Provider<CloudManager> cloudManagerProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert bleManagerProvider != null;
    this.bleManagerProvider = bleManagerProvider;
    assert cloudManagerProvider != null;
    this.cloudManagerProvider = cloudManagerProvider;
  }

  @Override
  public DemoIOPresenter get() {  
    DemoIOPresenter instance = new DemoIOPresenter(bleManagerProvider.get(), cloudManagerProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<DemoIOPresenter> create(MembersInjector<DemoIOPresenter> membersInjector, Provider<BleManager> bleManagerProvider, Provider<CloudManager> cloudManagerProvider) {  
    return new DemoIOPresenter_Factory(membersInjector, bleManagerProvider, cloudManagerProvider);
  }
}

