package com.demo01;
/**
 * 就是事件监听接口类 ： 事件接口类  ，即处理事件的抽象方法（ extends EventListener ） 
 * @author Administrator
 *
 */
public interface CalListener extends java.util.EventListener {    //
	/**
	 * 申明单步运算函数接口
	 * @param event 事件
	 * @return
	 */
    public boolean StepProformed(CalEvent event);     //
    /**
     * 申明计算完成函数接口
     * @param event 事件
     */
    public void CalOverProformed(CalEvent event);     //
    /**
     * 申明计算取消函数接口
     * @param event 事件
     */
    public void CancelProformed(CalEvent event);      //

}
