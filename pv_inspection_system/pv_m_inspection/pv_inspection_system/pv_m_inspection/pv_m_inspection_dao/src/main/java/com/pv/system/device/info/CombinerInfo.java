package com.pv.system.device.info;


import java.util.Date;
import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2022/3/29
 * Programme 汇流箱巡检信息
 * =====================================================
 * uuid       设备唯一认证标识符
 * timestamp  时间戳
 * =====================================================
 *         巡检内容                           巡检结果
 * -----------------------------------------------------
 *        汇流箱状态                     正常/通讯超时/自检故障
 *
 */
public class CombinerInfo {
    public UUID uuid;
    public Date timestamp;
    public String combinerStat;

}
