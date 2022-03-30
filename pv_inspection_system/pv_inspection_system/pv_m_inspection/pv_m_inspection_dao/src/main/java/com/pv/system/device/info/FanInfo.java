package com.pv.system.device.info;


import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2022/3/30
 * Programme: 风扇巡检信息
 * ===========================================================
 * ConverterUUID  风扇所对应的 变流器的UUID
 * FinUUID        风扇的UUID
 * ===========================================================
 *       巡检内容                        巡检结果
 * -----------------------------------------------------------
 *      风扇状态                        正常/故障
 *
 */
public class FanInfo {
    public UUID    converterUUID;
    public UUID    uuid;
    public String  FinStat;
}
