package com.rxy.lesson;

import java.util.Scanner;

public class test2_4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] number =new int[n];
            int[] grade =new int[n];
            for(int i=0;i<n;i++){
                number[i]=sc.nextInt();
                grade[i] =sc.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    if(grade[j]>grade[j+1]){
                        int tem=grade[j+1];
                        grade[j+1]=grade[j];
                        grade[j]=tem;
                        tem=number[j];
                        number[j]=number[j+1];
                        number[j+1]=tem;
                    }else if(grade[j]==grade[j+1]){
                        if(number[j]>number[j+1]){
                            int tem=number[j];
                            number[j]=number[j+1];
                            number[j+1]=tem;
                        }
                    }
                }
            }
            for(int i=0;i<n;i++){
                System.out.println(number[i]+" "+grade[i]);
            }
        }


    }
}
