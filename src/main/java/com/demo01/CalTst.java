package com.demo01;
//����Ӧ�ó��򣬼�����ļ�����
public class CalTst {
	public static void main(String[] arg) {

        System.out.println("Test Begin:");

        myCal1 c1=new myCal1();               //�������㹤��1��ʵ��

        c1.addCalListener(new myCal1Adapter());  //ע�Ṥ��1�ļ�����

        c1.Run();                             //���й���1

        myCal2 c2=new myCal2();               //��������2��ʵ��

        c2.addCalListener(new myCal2Adaper());       //ע�Ṥ��2������

        c2.Run();                              //���й���2

    }
}
