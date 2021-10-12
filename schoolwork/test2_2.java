package com.rxy.lesson;

import java.util.Scanner;

public class test2_2 {
    public static void main(String[] args) {
        double sum1,high1;//n为初始高度,m为第m次落下次数,sum1第一次路程,high1第一次反弹
        double high = 0;//high为第m次反弹高度
        double sum = 0;//sum为第m次落地总路程
        int i=2;
        Scanner sc = new Scanner(System.in);
        double n=sc.nextDouble();
        double m=sc.nextDouble();
       //如输入40 3注意中间加空格
        sum1 = n;
        high1 = n/4;
        sum = sum1;
        high = high1;
        while(i++<=m)
        {
            sum = sum  + 2*high;
            high = high/4;
        }
        if(m==1)
        {
            System.out.println(String.format("%.2f\n",sum1));
            System.out.println(String.format("%.2f\n",high1));
        }
        else
        {
            System.out.println(String.format("%.2f\n",sum));
            System.out.println(String.format("%.2f\n",high));

        }



    }
}
