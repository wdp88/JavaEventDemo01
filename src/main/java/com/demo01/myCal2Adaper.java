package com.demo01;
/**
 * ���㹤��1������ ( extends CalAdapter )
 * @author Administrator
 *
 */
public class myCal2Adaper extends CalAdapter {          //���㹤��2������

    public void CalOverProformed(CalEvent e) {//������ɴ�����

        System.out.println("The Source is "+e.getSource().toString());

    }

}