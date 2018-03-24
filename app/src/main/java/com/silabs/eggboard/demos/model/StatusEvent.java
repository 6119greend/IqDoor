package com.silabs.eggboard.demos.model;

import com.silabs.eggboard.ble.model.ThunderBoardDevice;

public class StatusEvent {

    public final ThunderBoardDevice device;

    public StatusEvent(ThunderBoardDevice device) {
        this.device = device;
    }
}
