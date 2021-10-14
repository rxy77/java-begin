package com.rxy.lesson;

import java.util.Scanner;
/*
输入三位数字N，求两位数AB（其中个位数字为B，十位数字为A，且有0 < A < B ≤9）。使得下列等式成立：
 AB x BA = N
其中BA是把AB中个、十位数字交换所得的两位数。

编写程序，接收控制台输入的三位整数N，求解A，B并输出。
如果没有解则输出“No Answer”。
 */
public class test02 {
    static boolean flag;
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= 9; ++i) {//A
            for (int j = i + 1; j <= 9; ++j) {//B
                //A < B  所以j从i+1开始
                //p q 分别表示AB  BA两个整数
                int p = i * 10 + j, q = j * 10 + i;

                if (p * q == n) {
                    System.out.println(p);
                    flag = true;//至少一组解
                }
            }
        }
        if(!flag)//没有解
            System.out.println("No Answer");



    }
}
