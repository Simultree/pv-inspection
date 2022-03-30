package com.pv.system.device.info;

import java.util.Date;
import java.util.UUID;

/**
 * Developer:Simutlree
 * Date:2022/3/29
 * Programme: PV设备巡检信息
 * ===============================================
 * converter_uuid   PV 设备所在的 DC 变流器设备的uuid
 * uuid             PV 设备的 uuid
 * timestamp        时间戳
 * ===============================================
 *      巡检内容                    巡检结果
 * -----------------------------------------------
 *      存在标志                     是/否
 *      电压                        正常/欠压/过压/升压
 *      电流                        正常/过流
 *      限功率标志                   是/否
 *      硬件电流                     正常/过流
 *
 */

public class PVDeviceInfo {
    public UUID converterUUID;
    public UUID uuid;
    public Date timestamp;
    public Boolean presenceSignStat;
    public String voltageStat;
    public String currentStat;
    public Boolean powerLimitStat;
    public String hardwareStat;
}
