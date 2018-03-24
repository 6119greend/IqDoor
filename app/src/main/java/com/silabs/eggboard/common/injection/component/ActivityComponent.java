package com.silabs.eggboard.common.injection.component;

import com.silabs.eggboard.demos.ui.DemoEnvironmentActivity;
import com.silabs.eggboard.common.injection.scope.ActivityScope;
import com.silabs.eggboard.common.ui.ThunderBoardStatusFragment;
import com.silabs.eggboard.demos.ui.DemoIOActivity;
import com.silabs.eggboard.demos.ui.DemoMotionActivity;
import com.silabs.eggboard.demos.ui.DemosSelectionActivity;
import com.silabs.eggboard.scanner.ui.ScannerActivity;
import com.silabs.eggboard.settings.ui.BeaconNotificationsActivity;
import com.silabs.eggboard.settings.ui.SettingsActivity;
import com.silabs.eggboard.settings.ui.SettingsEditActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = ThunderBoardComponent.class)
public interface ActivityComponent {
    void inject(ScannerActivity object);
    void inject(SettingsActivity object);
    void inject(SettingsEditActivity object);
    void inject(DemosSelectionActivity object);
    void inject(ThunderBoardStatusFragment object);
    void inject(DemoIOActivity object);
    void inject(DemoMotionActivity object);
    void inject(DemoEnvironmentActivity object);
    void inject(BeaconNotificationsActivity object);
}
