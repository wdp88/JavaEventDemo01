package com.demo01;
/**
 * �¼������ӿڵ�������  �� implements CalListener �� 
 * @author Administrator
 *
 */
public class CalAdapter  implements CalListener {            //�¼��������࣬ʵ��3���մ�����
	/**
	 * �����������㺯���ӿ�
	 * @param event �¼�
	 * @return
	 */
    public boolean StepProformed(CalEvent event){return true;}
    /**
     * ����������ɺ����ӿ�
     * @param event �¼�
     */
    public void CalOverProformed(CalEvent event){}
    /**
     * ��������ȡ�������ӿ�
     * @param event �¼�
     */
    public void CancelProformed(CalEvent event){}


}
