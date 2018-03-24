package com.silabs.eggboard.common.injection.component;

import android.content.Context;
import com.silabs.eggboard.ble.BleManager;
import com.silabs.eggboard.ble.BleManager_Factory;
import com.silabs.eggboard.common.app.ThunderBoardApplication;
import com.silabs.eggboard.common.app.ThunderBoardApplication_MembersInjector;
import com.silabs.eggboard.common.data.PreferenceManager;
import com.silabs.eggboard.common.data.PreferenceManager_Factory;
import com.silabs.eggboard.common.injection.module.ThunderBoardModule;
import com.silabs.eggboard.common.injection.module.ThunderBoardModule_ProvideCloudDataUrlFactory;
import com.silabs.eggboard.common.injection.module.ThunderBoardModule_ProvideCloudDemoUrlFactory;
import com.silabs.eggboard.common.injection.module.ThunderBoardModule_ProvideContextFactory;
import com.silabs.eggboard.common.injection.module.ThunderBoardModule_ProvideKeyFirebaseFactory;
import com.silabs.eggboard.web.CloudManager;
import com.silabs.eggboard.web.CloudManager_Factory;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerThunderBoardComponent implements ThunderBoardComponent {
  private Provider<Context> provideContextProvider;
  private Provider<PreferenceManager> preferenceManagerProvider;
  private Provider<BleManager> bleManagerProvider;
  private Provider<String> provideCloudDataUrlProvider;
  private Provider<String> provideCloudDemoUrlProvider;
  private Provider<String> provideKeyFirebaseProvider;
  private Provider<CloudManager> cloudManagerProvider;
  private MembersInjector<ThunderBoardApplication> thunderBoardApplicationMembersInjector;

  private DaggerThunderBoardComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideContextProvider = ScopedProvider.create(ThunderBoardModule_ProvideContextFactory.create(builder.thunderBoardModule));
    this.preferenceManagerProvider = ScopedProvider.create(PreferenceManager_Factory.create(provideContextProvider));
    this.bleManagerProvider = ScopedProvider.create(BleManager_Factory.create(provideContextProvider, preferenceManagerProvider));
    this.provideCloudDataUrlProvider = ScopedProvider.create(ThunderBoardModule_ProvideCloudDataUrlFactory.create(builder.thunderBoardModule));
    this.provideCloudDemoUrlProvider = ScopedProvider.create(ThunderBoardModule_ProvideCloudDemoUrlFactory.create(builder.thunderBoardModule));
    this.provideKeyFirebaseProvider = ScopedProvider.create(ThunderBoardModule_ProvideKeyFirebaseFactory.create(builder.thunderBoardModule));
    this.cloudManagerProvider = ScopedProvider.create(CloudManager_Factory.create(provideContextProvider, provideCloudDataUrlProvider, provideCloudDemoUrlProvider, provideKeyFirebaseProvider, preferenceManagerProvider));
    this.thunderBoardApplicationMembersInjector = ThunderBoardApplication_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), cloudManagerProvider, bleManagerProvider);
  }

  @Override
  public BleManager provideBleManager() {  
    return bleManagerProvider.get();
  }

  @Override
  public PreferenceManager providePreferenceManager() {  
    return preferenceManagerProvider.get();
  }

  @Override
  public CloudManager provideCloudManager() {  
    return cloudManagerProvider.get();
  }

  @Override
  public void inject(ThunderBoardApplication o) {  
    thunderBoardApplicationMembersInjector.injectMembers(o);
  }

  public static final class Builder {
    private ThunderBoardModule thunderBoardModule;
  
    private Builder() {  
    }
  
    public ThunderBoardComponent build() {  
      if (thunderBoardModule == null) {
        throw new IllegalStateException("thunderBoardModule must be set");
      }
      return new DaggerThunderBoardComponent(this);
    }
  
    public Builder thunderBoardModule(ThunderBoardModule thunderBoardModule) {  
      if (thunderBoardModule == null) {
        throw new NullPointerException("thunderBoardModule");
      }
      this.thunderBoardModule = thunderBoardModule;
      return this;
    }
  }
}

