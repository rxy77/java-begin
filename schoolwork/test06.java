package com.rxy.lesson;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, max, b;
        n = scanner.nextInt();
        max = n / 5;
        if(max >= 5 && max < 20)
            max = max + max / 5;
        if(max >= 20) {
            b = max % 20;
            max = max + (max / 20) * 5 + b / 5;
        }
        System.out.print(max);
    }
}
