package com.rxy.lesson;

import java.util.*;

public class test2_3 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - kb.nextInt()]);

    }

}
