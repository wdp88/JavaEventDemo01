package com.demo01;
/**
 * ���㹤��1������ ( extends CalAdapter )
 * @author Administrator
 *
 */
public class myCal1Adapter extends CalAdapter {      //���㹤��1������

    public boolean StepProformed(CalEvent e) { //�����¼�������

        System.out.println("Step "+e.getStepNum());

        return true;

    }

    public void CalOverProformed(CalEvent e) { //������ɴ�����

        System.out.println("The Result is "+((myCal1)e.getSource()).getResult());

    }

}