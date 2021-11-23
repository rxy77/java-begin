package Demo.Demo11231;

import java.util.Arrays;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        char[] cStr = str.toCharArray();
        Arrays.sort(cStr);
        int i = 0;
        while (i < cStr.length) {
            System.out.print(cStr[i]);
            for (++i; i < cStr.length && cStr[i] == cStr[i - 1]; ++i);
        }

    }
}
