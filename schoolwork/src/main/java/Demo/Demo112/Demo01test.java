package Demo.Demo112;

import Demo.Demo112.Triangle;

import java.util.Scanner;

public class Demo01test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            Triangle.getInstance(a,b,c);
        }

    }
}
