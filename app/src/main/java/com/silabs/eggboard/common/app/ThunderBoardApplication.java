package com.silabs.eggboard.common.app;

import android.app.Application;

import com.silabs.eggboard.BuildConfig;
import com.silabs.eggboard.ble.BleManager;
import com.silabs.eggboard.common.injection.component.DaggerThunderBoardComponent;
import com.silabs.eggboard.common.injection.component.ThunderBoardComponent;
import com.silabs.eggboard.common.injection.module.ThunderBoardModule;
import com.silabs.eggboard.common.log.ApplicationDebugTree;
import com.silabs.eggboard.web.CloudManager;

import javax.inject.Inject;

import timber.log.Timber;

public class ThunderBoardApplication extends Application {

    private static final String TAG = ThunderBoardApplication.class.getSimpleName();

    // kick off the cloud manager
    @Inject
    CloudManager cloudManager;

    // kick off beaconing
    @Inject
    BleManager bleManager;

    private ThunderBoardComponent component;

    @Override
    public void onCreate() {

        super.onCreate();

        setupTimber();

        component().inject(this);

        Timber.d("created");
    }

    public ThunderBoardComponent component() {
        if(component == null) {
            component = DaggerThunderBoardComponent.builder().thunderBoardModule(new ThunderBoardModule(this, BuildConfig.CLOUD_DATA_URL, BuildConfig.CLOUD_DEMO_URL, BuildConfig.KEY_FIREBASE)).build();
        }
        return component;
    }

    private void setupTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new ApplicationDebugTree(TAG));
        }
    }
}
