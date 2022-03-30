package com.pv.system.device.info;

import java.util.Date;

/**
 * Developer: Simultree
 * Date: 2022/3/30
 * Programme: DC 变流器数据监测信息
 * ==========================================================
 * PV输入总电流
 * PV输入总电压
 * PV输入总功率
 * 变流器输入总电流
 * 变流器输入总电压
 * 变流器输入总功率
 * 日发电量
 * 月发电量
 * 总发电量
 * 设置总功率            // 只读
 * 设置母线电压保护值上限  // 只读
 * 设置母线电压保护值下限  // 只读
 * 设置母线稳压值        // 只读
 *
 *
 */
public class DCConverterTotalNumInfo {
    public Date timestamp;
    public Float pvInCurrent;
    public Float pvInVoltage;
    public Float pvInPower;
    public Float DCInCurrent;
    public Float DCInVoltage;
    public Float DCInPower;
    public Float DailyGeneration;
    public Float MonthlyGeneration;
    public Float AnnualGeneration;
    public Float BusPreserveMax;
    public Float BusPreserveMin;
    public Float BusStable;

}
