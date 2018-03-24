package com.silabs.eggboard.common.injection.component;

import com.silabs.eggboard.common.app.ThunderBoardApplication;
import com.silabs.eggboard.web.CloudManager;
import com.silabs.eggboard.ble.BleManager;
import com.silabs.eggboard.common.data.PreferenceManager;
import com.silabs.eggboard.common.injection.module.ThunderBoardModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ThunderBoardModule.class})
public interface ThunderBoardComponent {
    BleManager provideBleManager();
    PreferenceManager providePreferenceManager();
    CloudManager provideCloudManager();

    void inject(ThunderBoardApplication o);
}
