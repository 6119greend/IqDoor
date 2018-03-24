package com.silabs.eggboard.demos.ui;

import com.silabs.eggboard.ble.model.ThunderBoardDevice;

public interface DemosViewListener {
    void setDeviceId(String deviceId);
    void onData(ThunderBoardDevice device);
}
