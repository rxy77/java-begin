package com.rxy.lesson;

import java.util.Scanner;

/*
给出一个不多于5位的正整数，要求：
    1.求出它是几位数。
    2.分别打印出每一位数字。
    3.按照逆序打印出每一位数字。
 */
public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x= 0;
        while(num>100000 || num<0) {
            System.out.println("输入错误！");
            System.out.println("请输入不大于5位的正整数：");
            num = sc.nextInt();
        }

        String len = String.valueOf(num);
        System.out.println(len.length());
        System.out.println(num);
        while(num > 0) {
            x= x*10+num%10;
            num = num/10;
        }
        System.out.println(x);
    }
}
