package Demo.Demo112;

public class Circle {
    private static double pi;
    private double radius=1;

    public static void perimeter(double radius){
        double s=0;
        s=2*pi*radius;
        System.out.printf("perimeter=%.2f,",s);
    }
    public static void area(double radius){
        double s=0;
        s=pi*radius*radius;
        System.out.printf("area=%.2f",s);
        System.out.println();
    }
    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double pi, double radius) {
        this.pi = pi;
        this.radius = radius;
    }
}
