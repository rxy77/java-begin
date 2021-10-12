package com.rxy.lesson;

import java.util.Scanner;

/*
个十百位数字的立方和
 */
public class test04 {
    public static void main(String[] args) {
        System.out.println("请输入3位整数：");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int x = 0,sum = 0;
        int g,s,b;
       g=num%10;
       s=(num/10)%10;
       b=(num/100)%10;
       sum=g*g*g+s*s*s+b*b*b;
        System.out.println("个十百位平方和为："+sum);
        }
    }

