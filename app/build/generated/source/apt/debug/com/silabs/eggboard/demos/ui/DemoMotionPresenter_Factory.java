package com.silabs.eggboard.demos.ui;

import com.silabs.eggboard.ble.BleManager;
import com.silabs.eggboard.web.CloudManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DemoMotionPresenter_Factory implements Factory<DemoMotionPresenter> {
  private final MembersInjector<DemoMotionPresenter> membersInjector;
  private final Provider<BleManager> bleManagerProvider;
  private final Provider<CloudManager> cloudManagerProvider;

  public DemoMotionPresenter_Factory(MembersInjector<DemoMotionPresenter> membersInjector, Provider<BleManager> bleManagerProvider, Provider<CloudManager> cloudManagerProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert bleManagerProvider != null;
    this.bleManagerProvider = bleManagerProvider;
    assert cloudManagerProvider != null;
    this.cloudManagerProvider = cloudManagerProvider;
  }

  @Override
  public DemoMotionPresenter get() {  
    DemoMotionPresenter instance = new DemoMotionPresenter(bleManagerProvider.get(), cloudManagerProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<DemoMotionPresenter> create(MembersInjector<DemoMotionPresenter> membersInjector, Provider<BleManager> bleManagerProvider, Provider<CloudManager> cloudManagerProvider) {  
    return new DemoMotionPresenter_Factory(membersInjector, bleManagerProvider, cloudManagerProvider);
  }
}

