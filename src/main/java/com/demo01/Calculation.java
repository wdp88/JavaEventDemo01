package com.demo01;

import java.util.Vector;
/**
 * 事件源  ： 一个事件源有多个事件
 * @author Administrator
 *
 */
@SuppressWarnings({"unchecked","rawtypes"})
public class Calculation {                                //计算类，实际的计算事件源
	/**
	 * 存放监听者的list集合（线程安全的list）
	 */
    
	protected Vector listener;                       //监听者队列

    public Calculation(){ listener=new Vector(); }
    /**
     * 添加监听者
     * @param l 事件监听者
     */
    
	public synchronized void addCalListener(CalListener l) { listener.add(l); }//
    /**
     * 移除监听者
     * @param l 事件监听者
     */
    public synchronized void removeCalListener(CalListener l){listener.remove(l);}
    /**
     * 事件通知函数重载版本1
     * @param mask
     * @return
     */
    public boolean notifyEvent(int mask) {            //

        Vector l=new Vector();

        l=(Vector)listener.clone();

        boolean rt=true;

        CalEvent ev=new CalEvent(this);

        if(mask==CalEvent.STEPOVER) ev.setType(CalEvent.STEPOVER,0);

        else ev.setType(mask);

        synchronized(this) {                      //多线程锁定
        	//查询监听者，并调用处理函数
            for(int i=0; i<l.size(); i++) {            

                if(ev.isStepCal()) rt=((CalListener)l.elementAt(i)).StepProformed(ev);

                else if(ev.isCalOver()) ((CalListener)l.elementAt(i)).CalOverProformed(ev);

                else if(ev.isCalCancel()) ((CalListener)l.elementAt(i)).CancelProformed(ev);
            }

        }

        return rt;

    }
    /**
     * 事件通知函数重载版本2
     * @param mask
     * @param step
     * @return
     */
    public boolean notifyEvent(int mask, long step) {  

        Vector l=new Vector();

        l=(Vector)listener.clone();

        boolean rt=true;

        CalEvent ev=new CalEvent(this);

        if(mask==CalEvent.STEPOVER) ev.setType(CalEvent.STEPOVER,step);

        else ev.setType(mask);

        synchronized(this) {

            for(int i=0; i<l.size(); i++) {

                if(ev.isStepCal()) rt=((CalListener)l.elementAt(i)).StepProformed(ev);

                else if(ev.isCalOver()) ((CalListener)l.elementAt(i)).CalOverProformed(ev);

                else if(ev.isCalCancel()) ((CalListener)l.elementAt(i)).CancelProformed(ev);

            }

        }

        return rt;

    }

}