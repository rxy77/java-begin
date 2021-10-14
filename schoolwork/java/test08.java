package com.rxy.lesson;

import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float h=in.nextFloat();
        float s=in.nextFloat();
        int n=(int)(20000/(s*h));
        if (n<20000/(s*h))
            System.out.println(n+1);
        else System.out.println(n);
        in.close();
    }
}
