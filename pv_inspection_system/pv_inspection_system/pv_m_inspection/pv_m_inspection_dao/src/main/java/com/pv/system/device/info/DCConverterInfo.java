package com.pv.system.device.info;


import java.util.Date;
import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2022/3/29
 * =================================================
 * uuid         设备唯一的标识符
 * timestamp    时间戳
 * =================================================
 * 巡检内容            巡检结果
 * -------------------------------------------------
 * 通讯状态           正常/超时
 * 设备状态           正常/待机/故障/运行
 * 总故障             $铁电故障    $CAN故障
 *                   $绝缘故障    $采样中点故障
 *
 * 硬件故障            $硬件故障总标志位    $机箱过温
 *                   $PV 硬件过流        $BST_IGBT故障
 *
 */
public class DCConverterInfo {
    public UUID uuid;
    public Date timestamp;
    public String communicationStat;
    public String deviceStat;
    public String totalFail;
    public String hardwareFail;

}
