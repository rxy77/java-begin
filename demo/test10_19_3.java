package Demo;

import java.util.*;

public class test10_19_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] num1 = new int[n1];
        for (int j = 0; j < n1; j++) {
            num1[j] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] num2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            num2[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : num1) {
            boolean flag=false;
            for (int j : num2) {
                flag=flag||i==j;
            }
            if (!flag) list.add(i);
        }
        for (int i : num2) {
            boolean flag=false;
            for (int j : num1) {
                flag=flag||i==j;
            }
            if (!flag) list.add(i);
        }

        Collections.sort(list);
        for (int i = list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+" ");
        }





    }
}

