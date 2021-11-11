package Demo.Demo112;

import java.util.Scanner;

public class Demo02test {
    public static void main(String[] args) {
        Circle c = new Circle(1);
        c.setPi(3.14);
//        System.out.println(c.getRadius());
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble();
        System.out.print("Circle"+1+":pi="+ c.getPi()+",radius="+c.getRadius()+",");
        Circle.perimeter(1.0);
        Circle.area(1.0);
        c.setRadius(r1);
        System.out.print("Circle"+2+":pi="+ c.getPi()+",radius="+c.getRadius()+",");
        Circle.perimeter(r1);
        Circle.area(r1);
    }
}
