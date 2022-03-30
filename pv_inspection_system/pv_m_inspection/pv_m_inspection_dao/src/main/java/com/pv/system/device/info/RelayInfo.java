package com.pv.system.device.info;

import javax.xml.crypto.Data;
import java.sql.DataTruncation;
import java.util.Date;
import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2022/3/30
 * Programme: 继电器巡检信息
 * =====================================================
 * ConverterUUID
 * timestamp
 * =====================================================
 *    巡检内容                       巡检结果
 * -----------------------------------------------------
 *   继电器                       第一次吸合/ 第二次吸合
 *
 *
 *
 *
 */
public class RelayInfo {
    public UUID converterUUID;
    public Date timestamp;
    public String relayStat;
}
