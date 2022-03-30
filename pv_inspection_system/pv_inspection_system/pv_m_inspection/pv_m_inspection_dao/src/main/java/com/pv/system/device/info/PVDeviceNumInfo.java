package com.pv.system.device.info;


import java.util.Date;
import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2022/3/29
 *  PV_Device_uuid: PV设备的UUID
 *  timestamp: 时间戳
 * ==============================================
 *
 *    Voltage           电压
 *    Current           电流
 *    Power             电功率
 *    PV 低压参考值
 */

public class PVDeviceNumInfo {
    public UUID pvUUID;
    public Date timestamp;
    public Float voltage;
    public Float current;
    public Float power;
    public Float pvLowLimit;
}

