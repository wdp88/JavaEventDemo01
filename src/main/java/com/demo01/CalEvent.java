package com.demo01;

import java.util.EventObject;
/**
 * 具体事件类 ： 计算工具事件类  （ extends EventObject ）
 * @author Administrator
 *
 */

public class CalEvent extends EventObject {              
	/**
	 * 申明事件标志，单步计算完成
	 */
    public static final int STEPOVER=1;           //
    /**
	 * 计算完成标志
	 */
    public static final int CALOVER=2;            //
    /**
	 * 计算取消标志
	 */
    public static final int CALCANCEL=3;         //
    /**
	 * 错误事件类型
	 */
    public static final int TYPEERROR=-1;

 
    /**
   	 * 单步计算的步数
   	 */
    protected long StepNum;                    //
    /**
   	 * 事件类型
   	 */
    protected int Type;                         //

 
    /**
     * 
     * @param src  事件源
     */
    public CalEvent(Object src) {                //几个事件构造函数

        super(src);                           //登记事件源

        Type=TYPEERROR;

    }
    /**
     * 计算事件   ： 设置type的值
     * @param src
     * @param mask
     */
    public CalEvent(Object src, int mask) {

        super(src);

        if(mask==STEPOVER || mask==CALOVER || mask==CALCANCEL) Type=mask;

        else Type=TYPEERROR;

    }
    /**
     * 计算事件    ： 设置type的值
     * @param src
     * @param mask
     * @param step
     */
    public CalEvent(Object src, int mask, long step) {

        super(src);

        if(mask==STEPOVER || mask==CALOVER || mask==CALCANCEL) Type=mask;

        else Type=TYPEERROR;

        StepNum=step;

    }

    //一些实用方法

    public void setType(int mask) { Type=mask; }

    public void setType(int mask, long step){Type=mask; StepNum=step;}

    public int getType() { return Type; }

    public long getStepNum() { return StepNum; }
    /**
     * 是否是   单步计算完成   事件
     * @return
     */
    public boolean isStepCal() {

        if(Type==CalEvent.STEPOVER) return true;

        else return false;

    }
    /**
     * 是否是   计算完成   事件
     * @return
     */
    public boolean isCalOver() {

        if(Type==CalEvent.CALOVER) return true;

        else return false;

    }
    /**
     * 是否是   计算取消   事件
     * @return
     */
    public boolean isCalCancel() {

        if(Type==CalEvent.CALCANCEL) return true;

        else return false;

    }
}
