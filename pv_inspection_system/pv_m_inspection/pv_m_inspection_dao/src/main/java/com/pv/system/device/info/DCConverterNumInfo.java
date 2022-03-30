package com.pv.system.device.info;

import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2022/3/30
 * Programme: DC 变流器数据监测
 * =================================================
 * ConverterUUID  对应的 Converte UUID
 * timestamp  时间戳
 * -------------------------------------------------
 * 日发电量                 数值
 * 月发电量                 数值
 * 总发电量                 数值
 *
 */
public class DCConverterNumInfo {
    public UUID ConverterUUID;
    public Float DailyGenerate;
    public Float MonthlyGenerate;
    public Float AnnualGenerate;
}
