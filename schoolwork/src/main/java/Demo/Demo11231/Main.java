package Demo.Demo11231;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String  a,b;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextLine();
        b=scanner.nextLine();
        String result=new BigInteger(a).subtract(new BigInteger(b)).toString();

        System.out.println(result);
    }
}

