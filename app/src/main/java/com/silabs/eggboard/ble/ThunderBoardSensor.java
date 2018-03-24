package com.silabs.eggboard.ble;

public abstract class ThunderBoardSensor {
    public Boolean isNotificationEnabled;
    public Boolean isSensorDataChanged = false;

    public abstract ThunderboardSensorData getSensorData();
}
