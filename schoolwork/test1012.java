package com.rxy.lesson;

import java.util.Scanner;


public class test1012 {
    public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    double x = kb.nextDouble();
    int n = kb.nextInt();
    double ex = 1;
        for (int i = 1; i <= n; i++) {
        ex+=Math.pow(x,i)/factorial(i);
    }
        System.out.printf("%.6f\n",ex);
}

    private static double factorial(int n) {
        double res = 1;
        for (int i = 1; i <= n; i++)
            res*=i;
        return res;
    }


}
