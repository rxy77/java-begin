package com.rxy.lesson;

import java.util.Scanner;

/*
小鱼游泳
 */
public class test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入开始时：");
        int a = sc.nextInt();
        System.out.println("请输入开始分：");
        int b = sc.nextInt();
        System.out.println("请输入结束时：");
        int c = sc.nextInt();
        System.out.println("请输入结束分：");
        int d = sc.nextInt();
        int m = d - b;
        int h = c - a;
        if (m < 0) {
            h --;
            m += 60;
        }

        System.out.printf("%d时 %d分\n", h, m);
    }

}
