package com.silabs.eggboard.scanner.ui;

import com.silabs.eggboard.ble.model.ThunderBoardDevice;

import java.util.List;

public interface ScannerViewListener {
    void onData(List<ThunderBoardDevice> devices);
    void onBluetoothDisabled();
    void onBluetoothEnabled();
}
