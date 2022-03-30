package com.pv.system.device.info;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2022/3/29
 * Programme: 通讯管理机巡检信息
 * =====================================================
 * uuid       设备唯一认证标识符
 * timestamp  时间戳
 * =====================================================
 *         巡检内容                        巡检结果
 * -----------------------------------------------------
 *         通讯管理设备                     运行/故障
 *         直流网并网状态                   运行/待机/故障
 *         交流网并网状态                   运行/待机/故障
 *         设备故障类型                     NOT DETERMINED
 */
public class ConnectionDeviceInfo {
    public UUID uuid;
    public Date timestamp;
    public String DPUStat;
    public String DCNetworkStat;
    public String ACNetworkStat;
    public String deviceFailType;

}
