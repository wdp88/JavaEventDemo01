package com.demo01;
/**
 * 计算工具1适配器 ( extends CalAdapter )
 * @author Administrator
 *
 */
public class myCal2Adaper extends CalAdapter {          //计算工具2适配器

    public void CalOverProformed(CalEvent e) {//计算完成处理函数

        System.out.println("The Source is "+e.getSource().toString());

    }

}