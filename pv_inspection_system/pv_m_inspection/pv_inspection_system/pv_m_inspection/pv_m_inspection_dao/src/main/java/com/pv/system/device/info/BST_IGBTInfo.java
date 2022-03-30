package com.pv.system.device.info;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2-22/3/30
 * Programme: BST_IGBT 巡检信息
 * ====================================================
 * converterUUID   所属的设备的UUID
 * BST_IGBT UUID   BST_IGBT UUID
 * timestamp
 * ====================================================
 * 设备状态         正常/故障/过温
 * */
public class BST_IGBTInfo {
    public UUID converterUUID;
    public UUID uuid;
    public Date timestamp;
    public String BST_IGBTStat;

}
