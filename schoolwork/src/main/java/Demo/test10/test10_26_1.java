package Demo.test10;

import java.util.Scanner;

public class test10_26_1 {
    public static void main(String[] args) {

        double hour=0;
        Scanner sc = new Scanner(System.in);
        hour = sc.nextDouble();

        int fishsum=0;
        Pond pond = new Pond();
        fishsum=pond.getFish();

        int sum=0;
        sum=DiaoYu.number(hour);





    }


}
