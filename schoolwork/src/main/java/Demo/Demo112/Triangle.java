package Demo.Demo112;

public class Triangle {
    private double a,b,c;

    public static void getInstance(double a,double b,double c){
        if (a<1||b<1||c<1){
            System.exit(1);
        }
        if (a+b>c&&b+c>a&&a+c>b){
            Triangle tr = new Triangle(a,b,c);
            System.out.printf("Sides of triangle:%.2f,%.2f,%.2f;",a,b,c);
            perimeter(a,b,c);
            area(a,b,c);
        }else {
            System.out.println("Triangle can't be build");
        }
    }
    public static void perimeter(double a,double b,double c){
        double s=0;
        s=(a+b+c);
        System.out.printf("perimeter:%.2f",s);
        System.out.print(";");
    }
    public static void area(double a,double b,double c){
        double p=0,s=0;
        p=(a+b+c)/2;
        s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("area:%.2f",s);
        System.out.println();
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
