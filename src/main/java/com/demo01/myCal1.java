package com.demo01;
/**
 * ���㹤����1   �� extends Calculation ��
 * @author Administrator
 *
 */
public class myCal1 extends Calculation {               //���㹤��1��

    public void Run() {                        //���й���1����

        for(int i=0; i<5; i++) notifyEvent(CalEvent.STEPOVER,i);//���������¼�

        notifyEvent(CalEvent.CALOVER);       //������������¼�

    }

    public String getResult(){ return "OK"; }       //���ؼ�����ɽ��

}