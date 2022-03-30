package com.pv.system.device.info;

import java.util.Date;
import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2022/3/29
 * Programme: 光伏逆变器巡检信息
 * ======================================================
 * uuid         用于识别设备的唯一表示符号
 * timestamp    时间戳
 * ======================================================
 *      巡检内容           巡检结果
 * ------------------------------------------------------
 *      状态              待机/运行/故障
 */
public class InverterInfo {
    public UUID uuid;
    public Date timestamp;
    public String inverterStat;
}
