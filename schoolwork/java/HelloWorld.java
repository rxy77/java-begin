package com.rxy.lesson;
import java.util.Scanner;

/*
每年过年的时候，小明总是要为新学期准备很多的水笔。
今天商店搞活动，每满5支送1支，若满20支则赠送5支，每支水笔5元。
小明一共带了n（n>10）元钱，希望能买到最多的水笔，编写程序请你帮他计算他最多能买到多少支？


 */
public class HelloWorld {
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
