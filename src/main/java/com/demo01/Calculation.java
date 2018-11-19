package com.demo01;

import java.util.Vector;
/**
 * �¼�Դ  �� һ���¼�Դ�ж���¼�
 * @author Administrator
 *
 */
@SuppressWarnings({"unchecked","rawtypes"})
public class Calculation {                                //�����࣬ʵ�ʵļ����¼�Դ
	/**
	 * ��ż����ߵ�list���ϣ��̰߳�ȫ��list��
	 */
    
	protected Vector listener;                       //�����߶���

    public Calculation(){ listener=new Vector(); }
    /**
     * ��Ӽ�����
     * @param l �¼�������
     */
    
	public synchronized void addCalListener(CalListener l) { listener.add(l); }//
    /**
     * �Ƴ�������
     * @param l �¼�������
     */
    public synchronized void removeCalListener(CalListener l){listener.remove(l);}
    /**
     * �¼�֪ͨ�������ذ汾1
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

        synchronized(this) {                      //���߳�����
        	//��ѯ�����ߣ������ô�����
            for(int i=0; i<l.size(); i++) {            

                if(ev.isStepCal()) rt=((CalListener)l.elementAt(i)).StepProformed(ev);

                else if(ev.isCalOver()) ((CalListener)l.elementAt(i)).CalOverProformed(ev);

                else if(ev.isCalCancel()) ((CalListener)l.elementAt(i)).CancelProformed(ev);
            }

        }

        return rt;

    }
    /**
     * �¼�֪ͨ�������ذ汾2
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