package com.pv.system.device.info;

import java.util.Date;
import java.util.UUID;

/**
 * Developer:Simultree
 * Date:2022/3/29
 * Programme: 母线巡检信息
 * ===============================================
 *  UUID   DC_Converter_UUID
 *  timestamp
 * ===============================================
 *       巡检内容                   巡检结果
 * -----------------------------------------------
 *     变流器母线电压              正常/过压/欠压
 *     变流器母线电流              正常/过流
 *     变流器母线中点电压           正常/上偏/下偏
 *     变流器硬件母线电压           正常/过压
 *     变流器硬件母线电流           正常/过流
 *     变流器硬件中点电压           正常/上偏/下偏
 */


public class BusInfo {
    public UUID converterUUID;
    public Date timestamp;
    public String busVoltage;
    public String busCurrent;
    public String busMidVol;
    public String hardBusVol;
    public String hardBusCur;
    public String hardMidVol;
}

