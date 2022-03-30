package com.pv.system.device.info;

import java.util.List;
import java.util.UUID;

/**
 *  Developer: Simultree
 *  Date: 2022/3/30
 *  Programme: 记录所拥有的设备数量
 *
 *  --------------------------------------------------------
 *                         光伏系统设备
 *
 *
 *        DC变流器
 *        |- 母线/硬件母线
 *        |- 风扇 * 8
 *        |- BST_IGBT * 5
 *        |- PV硬件 * 10
 *
 *        汇流器
 *        |- 20 个 端口
 *                  |- 组串到DC变流器
 *                  |- 组串到逆变器
 *                  |- 组串入口
 *
 *        逆变器
 *
 *
 *
 *
 *
 *
 */
public class DeviceInfo {
    private Integer resource; // 用于生成UUID
    public UUID DCConverterUUID;
    public UUID inverterUUID;
    public UUID combinerUUID;
    public List<UUID> pvUUIDList;
    public List<UUID> fineUUIDList;
    public Integer portNum;  // 用于记录端口个数
    public Integer pvNum; // 用于记录pv个数
    public Integer fineNum; // 用于记录风扇个数

}
