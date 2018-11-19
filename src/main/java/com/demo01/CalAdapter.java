package com.demo01;
/**
 * 事件监听接口的适配器  （ implements CalListener ） 
 * @author Administrator
 *
 */
public class CalAdapter  implements CalListener {            //事件适配器类，实现3个空处理函数
	/**
	 * 申明单步运算函数接口
	 * @param event 事件
	 * @return
	 */
    public boolean StepProformed(CalEvent event){return true;}
    /**
     * 申明计算完成函数接口
     * @param event 事件
     */
    public void CalOverProformed(CalEvent event){}
    /**
     * 申明计算取消函数接口
     * @param event 事件
     */
    public void CancelProformed(CalEvent event){}


}
