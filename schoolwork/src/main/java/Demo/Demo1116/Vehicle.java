package Demo.Demo1116;

public class Vehicle {
    double height,width,weight,trivalmiles;

    public Vehicle(double height, double width, double weight, double trivalmiles) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.trivalmiles = trivalmiles;
    }

    public void Output(){
        System.out.println(this.height);
        System.out.println(this.width);
        System.out.println(this.weight);
        System.out.println(this.trivalmiles);
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTrivalmiles() {
        return trivalmiles;
    }

    public void setTrivalmiles(double trivalmiles) {
        this.trivalmiles = trivalmiles;
    }
}
