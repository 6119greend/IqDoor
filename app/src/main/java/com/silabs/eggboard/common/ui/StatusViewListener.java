package com.silabs.eggboard.common.ui;

import com.silabs.eggboard.ble.model.ThunderBoardDevice;

public interface StatusViewListener {
    void onData(ThunderBoardDevice device);
}
