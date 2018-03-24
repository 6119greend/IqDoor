package com.silabs.eggboard.common.injection.component;

import com.silabs.eggboard.ble.BleManager;
import com.silabs.eggboard.common.data.PreferenceManager;
import com.silabs.eggboard.common.ui.StatusPresenter;
import com.silabs.eggboard.common.ui.StatusPresenter_Factory;
import com.silabs.eggboard.common.ui.ThunderBoardStatusFragment;
import com.silabs.eggboard.common.ui.ThunderBoardStatusFragment_MembersInjector;
import com.silabs.eggboard.demos.ui.BaseDemoActivity;
import com.silabs.eggboard.demos.ui.BaseDemoActivity_MembersInjector;
import com.silabs.eggboard.demos.ui.DemoEnvironmentActivity;
import com.silabs.eggboard.demos.ui.DemoEnvironmentActivity_MembersInjector;
import com.silabs.eggboard.demos.ui.DemoEnvironmentPresenter;
import com.silabs.eggboard.demos.ui.DemoEnvironmentPresenter_Factory;
import com.silabs.eggboard.demos.ui.DemoIOActivity;
import com.silabs.eggboard.demos.ui.DemoIOActivity_MembersInjector;
import com.silabs.eggboard.demos.ui.DemoIOPresenter;
import com.silabs.eggboard.demos.ui.DemoIOPresenter_Factory;
import com.silabs.eggboard.demos.ui.DemoMotionActivity;
import com.silabs.eggboard.demos.ui.DemoMotionActivity_MembersInjector;
import com.silabs.eggboard.demos.ui.DemoMotionPresenter;
import com.silabs.eggboard.demos.ui.DemoMotionPresenter_Factory;
import com.silabs.eggboard.demos.ui.DemosPresenter;
import com.silabs.eggboard.demos.ui.DemosPresenter_Factory;
import com.silabs.eggboard.demos.ui.DemosSelectionActivity;
import com.silabs.eggboard.demos.ui.DemosSelectionActivity_MembersInjector;
import com.silabs.eggboard.demos.ui.GdxDemoActivity;
import com.silabs.eggboard.scanner.ui.ScannerActivity;
import com.silabs.eggboard.scanner.ui.ScannerActivity_MembersInjector;
import com.silabs.eggboard.scanner.ui.ScannerPresenter;
import com.silabs.eggboard.scanner.ui.ScannerPresenter_Factory;
import com.silabs.eggboard.settings.ui.BeaconNotificationsActivity;
import com.silabs.eggboard.settings.ui.BeaconNotificationsActivity_MembersInjector;
import com.silabs.eggboard.settings.ui.SettingsActivity;
import com.silabs.eggboard.settings.ui.SettingsActivity_MembersInjector;
import com.silabs.eggboard.settings.ui.SettingsEditActivity;
import com.silabs.eggboard.settings.ui.SettingsEditActivity_MembersInjector;
import com.silabs.eggboard.web.CloudManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<BleManager> provideBleManagerProvider;
  private Provider<PreferenceManager> providePreferenceManagerProvider;
  private Provider<ScannerPresenter> scannerPresenterProvider;
  private MembersInjector<ScannerActivity> scannerActivityMembersInjector;
  private MembersInjector<SettingsActivity> settingsActivityMembersInjector;
  private MembersInjector<SettingsEditActivity> settingsEditActivityMembersInjector;
  private Provider<DemosPresenter> demosPresenterProvider;
  private MembersInjector<DemosSelectionActivity> demosSelectionActivityMembersInjector;
  private Provider<StatusPresenter> statusPresenterProvider;
  private MembersInjector<ThunderBoardStatusFragment> thunderBoardStatusFragmentMembersInjector;
  private MembersInjector<BaseDemoActivity> baseDemoActivityMembersInjector;
  private Provider<CloudManager> provideCloudManagerProvider;
  private Provider<DemoIOPresenter> demoIOPresenterProvider;
  private MembersInjector<DemoIOActivity> demoIOActivityMembersInjector;
  private MembersInjector<GdxDemoActivity> gdxDemoActivityMembersInjector;
  private Provider<DemoMotionPresenter> demoMotionPresenterProvider;
  private MembersInjector<DemoMotionActivity> demoMotionActivityMembersInjector;
  private Provider<DemoEnvironmentPresenter> demoEnvironmentPresenterProvider;
  private MembersInjector<DemoEnvironmentActivity> demoEnvironmentActivityMembersInjector;
  private MembersInjector<BeaconNotificationsActivity> beaconNotificationsActivityMembersInjector;

  private DaggerActivityComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideBleManagerProvider = new Factory<BleManager>() {
      private final ThunderBoardComponent thunderBoardComponent = builder.thunderBoardComponent;
      @Override public BleManager get() {
        BleManager provided = thunderBoardComponent.provideBleManager();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.providePreferenceManagerProvider = new Factory<PreferenceManager>() {
      private final ThunderBoardComponent thunderBoardComponent = builder.thunderBoardComponent;
      @Override public PreferenceManager get() {
        PreferenceManager provided = thunderBoardComponent.providePreferenceManager();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.scannerPresenterProvider = ScopedProvider.create(ScannerPresenter_Factory.create(provideBleManagerProvider, providePreferenceManagerProvider));
    this.scannerActivityMembersInjector = ScannerActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), scannerPresenterProvider);
    this.settingsActivityMembersInjector = SettingsActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), providePreferenceManagerProvider);
    this.settingsEditActivityMembersInjector = SettingsEditActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), providePreferenceManagerProvider);
    this.demosPresenterProvider = ScopedProvider.create(DemosPresenter_Factory.create(provideBleManagerProvider));
    this.demosSelectionActivityMembersInjector = DemosSelectionActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), demosPresenterProvider);
    this.statusPresenterProvider = ScopedProvider.create(StatusPresenter_Factory.create(provideBleManagerProvider));
    this.thunderBoardStatusFragmentMembersInjector = ThunderBoardStatusFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), statusPresenterProvider);
    this.baseDemoActivityMembersInjector = BaseDemoActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), providePreferenceManagerProvider);
    this.provideCloudManagerProvider = new Factory<CloudManager>() {
      private final ThunderBoardComponent thunderBoardComponent = builder.thunderBoardComponent;
      @Override public CloudManager get() {
        CloudManager provided = thunderBoardComponent.provideCloudManager();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.demoIOPresenterProvider = ScopedProvider.create(DemoIOPresenter_Factory.create((MembersInjector) MembersInjectors.noOp(), provideBleManagerProvider, provideCloudManagerProvider));
    this.demoIOActivityMembersInjector = DemoIOActivity_MembersInjector.create(baseDemoActivityMembersInjector, demoIOPresenterProvider);
    this.gdxDemoActivityMembersInjector = MembersInjectors.delegatingTo(baseDemoActivityMembersInjector);
    this.demoMotionPresenterProvider = ScopedProvider.create(DemoMotionPresenter_Factory.create((MembersInjector) MembersInjectors.noOp(), provideBleManagerProvider, provideCloudManagerProvider));
    this.demoMotionActivityMembersInjector = DemoMotionActivity_MembersInjector.create(gdxDemoActivityMembersInjector, demoMotionPresenterProvider);
    this.demoEnvironmentPresenterProvider = ScopedProvider.create(DemoEnvironmentPresenter_Factory.create((MembersInjector) MembersInjectors.noOp(), provideBleManagerProvider, provideCloudManagerProvider, providePreferenceManagerProvider));
    this.demoEnvironmentActivityMembersInjector = DemoEnvironmentActivity_MembersInjector.create(baseDemoActivityMembersInjector, demoEnvironmentPresenterProvider);
    this.beaconNotificationsActivityMembersInjector = BeaconNotificationsActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), providePreferenceManagerProvider);
  }

  @Override
  public void inject(ScannerActivity object) {  
    scannerActivityMembersInjector.injectMembers(object);
  }

  @Override
  public void inject(SettingsActivity object) {  
    settingsActivityMembersInjector.injectMembers(object);
  }

  @Override
  public void inject(SettingsEditActivity object) {  
    settingsEditActivityMembersInjector.injectMembers(object);
  }

  @Override
  public void inject(DemosSelectionActivity object) {  
    demosSelectionActivityMembersInjector.injectMembers(object);
  }

  @Override
  public void inject(ThunderBoardStatusFragment object) {  
    thunderBoardStatusFragmentMembersInjector.injectMembers(object);
  }

  @Override
  public void inject(DemoIOActivity object) {  
    demoIOActivityMembersInjector.injectMembers(object);
  }

  @Override
  public void inject(DemoMotionActivity object) {  
    demoMotionActivityMembersInjector.injectMembers(object);
  }

  @Override
  public void inject(DemoEnvironmentActivity object) {  
    demoEnvironmentActivityMembersInjector.injectMembers(object);
  }

  @Override
  public void inject(BeaconNotificationsActivity object) {  
    beaconNotificationsActivityMembersInjector.injectMembers(object);
  }

  public static final class Builder {
    private ThunderBoardComponent thunderBoardComponent;
  
    private Builder() {  
    }
  
    public ActivityComponent build() {  
      if (thunderBoardComponent == null) {
        throw new IllegalStateException("thunderBoardComponent must be set");
      }
      return new DaggerActivityComponent(this);
    }
  
    public Builder thunderBoardComponent(ThunderBoardComponent thunderBoardComponent) {  
      if (thunderBoardComponent == null) {
        throw new NullPointerException("thunderBoardComponent");
      }
      this.thunderBoardComponent = thunderBoardComponent;
      return this;
    }
  }
}

