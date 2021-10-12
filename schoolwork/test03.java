package com.rxy.lesson;

import java.util.Scanner;

/*
华氏摄氏度=（9/5）*摄氏温度+32
 */
public class test03 {
    public static void main(String[] args) {
        System.out.println("请输入摄氏温度：");
        Scanner sc = new Scanner(System.in);
        double s=sc.nextDouble();
        double h;
        h=(9/5)*s+32;
        System.out.print("华氏温度为：");
        System.out.println(String.format("%.2f", h));
    }
}
