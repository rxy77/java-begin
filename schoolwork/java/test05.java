package com.rxy.lesson;

import java.util.Scanner;

/*
球的面积
 */
public class test05 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入半径：");
        double r=sc.nextDouble();
        sum=(4/3)*(r*r*r)*Math.PI;
        System.out.print("球体积为：");
        System.out.println(String.format("%.3f", sum));
    }
}
