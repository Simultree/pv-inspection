package com.pv.system.device.info;

import java.util.Date;
import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2022/3/30
 * Programme: BST_IGBT 遥测数据
 * ==============================================
 * converterUUID   所属的设备的UUID
 * BST_IGBT UUID   BST_IGBT UUID
 * timestamp
 * ====================================================
 * 温度
 *
 */
public class BST_IGBTNumInfo {
    public UUID converterUUID;
    public UUID uuid;
    public Date timestamp;
    public Float temperature;
}
