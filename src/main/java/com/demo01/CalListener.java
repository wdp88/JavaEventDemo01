package com.demo01;
/**
 * �����¼������ӿ��� �� �¼��ӿ���  ���������¼��ĳ��󷽷��� extends EventListener �� 
 * @author Administrator
 *
 */
public interface CalListener extends java.util.EventListener {    //
	/**
	 * �����������㺯���ӿ�
	 * @param event �¼�
	 * @return
	 */
    public boolean StepProformed(CalEvent event);     //
    /**
     * ����������ɺ����ӿ�
     * @param event �¼�
     */
    public void CalOverProformed(CalEvent event);     //
    /**
     * ��������ȡ�������ӿ�
     * @param event �¼�
     */
    public void CancelProformed(CalEvent event);      //

}
