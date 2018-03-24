package com.silabs.eggboard.common.app;

import android.app.Application;
import com.silabs.eggboard.ble.BleManager;
import com.silabs.eggboard.web.CloudManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ThunderBoardApplication_MembersInjector implements MembersInjector<ThunderBoardApplication> {
  private final MembersInjector<Application> supertypeInjector;
  private final Provider<CloudManager> cloudManagerProvider;
  private final Provider<BleManager> bleManagerProvider;

  public ThunderBoardApplication_MembersInjector(MembersInjector<Application> supertypeInjector, Provider<CloudManager> cloudManagerProvider, Provider<BleManager> bleManagerProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert cloudManagerProvider != null;
    this.cloudManagerProvider = cloudManagerProvider;
    assert bleManagerProvider != null;
    this.bleManagerProvider = bleManagerProvider;
  }

  @Override
  public void injectMembers(ThunderBoardApplication instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.cloudManager = cloudManagerProvider.get();
    instance.bleManager = bleManagerProvider.get();
  }

  public static MembersInjector<ThunderBoardApplication> create(MembersInjector<Application> supertypeInjector, Provider<CloudManager> cloudManagerProvider, Provider<BleManager> bleManagerProvider) {  
      return new ThunderBoardApplication_MembersInjector(supertypeInjector, cloudManagerProvider, bleManagerProvider);
  }
}

