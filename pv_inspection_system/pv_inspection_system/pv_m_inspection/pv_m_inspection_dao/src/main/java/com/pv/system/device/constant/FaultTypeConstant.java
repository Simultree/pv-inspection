package com.pv.system.device.constant;

/**
 * Developer: Simultree
 *
 */
public final class FaultTypeConstant {
    // 总故障
    public final static String CAN_FAULT = "CAN_FAULT";
    public final static String FERROELECTRIC_FAULT = "FERROELECTRIC_FAULT";
    public final static String INSULATION_FAULT = "INSULATION_FAULT";
    public final static String MIDPOINT_FAULT = "MIDPOINT_FAULT";
    public final static String TOTAL_HARDWARE_FAULT = "TOTAL_HARDWARE_FAULT";
    //  硬件故障
    public final static String CHASSIS_OVERHEAT_FAULT = "CHASSIS_OVERHEAT_FAULT";
    public final static String PV_HARDWARE_OVER_CURRENT_FAULT = "PV_HARDWARE_OVER_CURRENT_FAULT";
    public final static String BST_IGBT_FAULT = "BST_IGBT_FAULT";
    // 电压电流故障
    public final static String OVER_VOLTAGE = "OVER_VOLTAGE";    //  过压
    public final static String LOW_VOLTAGE = "LOW_VOLTAGE";      //  欠压
    public final static String NORM = "NORM";                    //  正常
    public final static String Boost_VOLTAGE = "BOOST_VOLTAGE";  //  升压
    public final static String OVER_CURRENT = "OVER_CURRENT";    //  过流
    public final static String OVER_MID = "OVER_MID";            //  中点上偏
    public final static String LOW_MID  = "LOW_MID";             //  中点下偏
    // 存在

}
