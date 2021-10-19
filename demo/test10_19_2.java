package Demo;

import java.util.Scanner;

public class test10_19_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] pc = new Person[10];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            double p1 = sc.nextDouble();
            double p2 = sc.nextDouble();
            double p3 = sc.nextDouble();
            Person pi = new Person(s,p1,p2,p3);
            pc[i]=pi;
        }
        for (int i = 0; i < n; i++) {


                System.out.printf("%5s,Salary is:%7.2f",pc[i].getName(),(pc[i].getP1()+pc[i].getP2()-pc[i].getP3()));
            System.out.println();
        }

    }
}
class Person {
    private String name;
    double p1,p2,p3;

    public String getName() {
        return name;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getP3() {
        return p3;
    }

    public Person() {
    }

    public Person(String name, double p1, double p2, double p3) {
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
}
