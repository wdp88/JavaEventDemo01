package com.demo01;

import java.util.EventObject;
/**
 * �����¼��� �� ���㹤���¼���  �� extends EventObject ��
 * @author Administrator
 *
 */

public class CalEvent extends EventObject {              
	/**
	 * �����¼���־�������������
	 */
    public static final int STEPOVER=1;           //
    /**
	 * ������ɱ�־
	 */
    public static final int CALOVER=2;            //
    /**
	 * ����ȡ����־
	 */
    public static final int CALCANCEL=3;         //
    /**
	 * �����¼�����
	 */
    public static final int TYPEERROR=-1;

 
    /**
   	 * ��������Ĳ���
   	 */
    protected long StepNum;                    //
    /**
   	 * �¼�����
   	 */
    protected int Type;                         //

 
    /**
     * 
     * @param src  �¼�Դ
     */
    public CalEvent(Object src) {                //�����¼����캯��

        super(src);                           //�Ǽ��¼�Դ

        Type=TYPEERROR;

    }
    /**
     * �����¼�   �� ����type��ֵ
     * @param src
     * @param mask
     */
    public CalEvent(Object src, int mask) {

        super(src);

        if(mask==STEPOVER || mask==CALOVER || mask==CALCANCEL) Type=mask;

        else Type=TYPEERROR;

    }
    /**
     * �����¼�    �� ����type��ֵ
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

    //һЩʵ�÷���

    public void setType(int mask) { Type=mask; }

    public void setType(int mask, long step){Type=mask; StepNum=step;}

    public int getType() { return Type; }

    public long getStepNum() { return StepNum; }
    /**
     * �Ƿ���   �����������   �¼�
     * @return
     */
    public boolean isStepCal() {

        if(Type==CalEvent.STEPOVER) return true;

        else return false;

    }
    /**
     * �Ƿ���   �������   �¼�
     * @return
     */
    public boolean isCalOver() {

        if(Type==CalEvent.CALOVER) return true;

        else return false;

    }
    /**
     * �Ƿ���   ����ȡ��   �¼�
     * @return
     */
    public boolean isCalCancel() {

        if(Type==CalEvent.CALCANCEL) return true;

        else return false;

    }
}
