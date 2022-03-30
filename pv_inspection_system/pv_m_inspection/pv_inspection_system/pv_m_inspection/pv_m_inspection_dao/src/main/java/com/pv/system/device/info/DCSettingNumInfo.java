package com.pv.system.device.info;

import java.util.Date;
import java.util.UUID;

/**
 * Developer: Simultree
 * Date: 2022/3/30
 * Programme: 设置数据信息
 * ========================================================
 * UUIDConverter
 * timestamp
 *
 * 母线保护上限
 * 母线保护下限
 * 母线稳压数值
 * 总功率限制
 *
 *
 */


public class DCSettingNumInfo {
    public UUID converterUUID;
    public Date timestamp;
    public Float busUpLimit;
    public Float busLowLimit;
    public Float busStable;
    public Float totalPowerLimit;

}
