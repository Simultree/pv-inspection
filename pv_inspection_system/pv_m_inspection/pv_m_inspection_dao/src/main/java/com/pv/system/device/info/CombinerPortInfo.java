package com.pv.system.device.info;

import java.util.Date;
import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2022/3/29
 * Programme: 汇流箱端口巡检信息  假定状态只有两种（连通， 未连通）
 *
 * ===============================================================
 * Combiner_uuid  端口所在设备的唯一标识符
 * port_num       端口号
 * timestamp      时间戳
 * ===============================================================
 *        巡检内容                  巡检结果
 * ---------------------------------------------------------------
 *     组串到入口状态                 状态（未知）
 *     组串到DC变流器状态             状态（未知）
 *     组串到逆变器状态               状态（未知）
 */
public class CombinerPortInfo {
    public UUID combinerUUID;
    public Integer portNum;
    public Date timestamp;
    public Boolean pvString2Entrance;
    public Boolean pvString2Converter;
    public Boolean pvString2Inverter;
}
