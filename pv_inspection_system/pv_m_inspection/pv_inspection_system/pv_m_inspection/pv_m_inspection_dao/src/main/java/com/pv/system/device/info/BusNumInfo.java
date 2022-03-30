package com.pv.system.device.info;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2022/3/29
 * Programme: 母线遥测信息
 * =================================================
 * DCConverterUUID 对应的DC 变流器的UUID
 * timestamp
 * =================================================
 * 变流器母线电压值
 * 变流器母线电流值
 * 设备总功率
 * 直流网母线电压值
 * 变流器中点电压
 *
 */
public class BusNumInfo {
    public UUID ConverterUUID;
    public Date timestamp;
    public Float busVol;
    public Float busCur;
    public Float totalPower;
    public Float DCBusVol;
    public Float busMidVol;
}

