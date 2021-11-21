package Demo.Demo1116;

public class Car extends Automobile{
    int Da;
    String nd,modle,Wb;//车门数量,车型(SUV,两厢或三厢车等)以及轴距

    public Car(double height, double width, double weight, double trivalmiles, int fc, int da, String nd, String modle, String wb) {
        super(height, width, weight, trivalmiles, fc);
        Da = da;
        this.nd = nd;
        this.modle = modle;
        Wb = wb;
    }

//    public Car(int da, String nd, String modle, String wb) {
//        Da = da;
//        this.nd = nd;
//        this.modle = modle;
//        Wb = wb;
//    }

    public int getDa() {
        return Da;
    }

    public void setDa(int da) {
        Da = da;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public String getWb() {
        return Wb;
    }

    public void setWb(String wb) {
        Wb = wb;
    }

    @Override
    public void Output() {
        System.out.println(this.Da+" "+this.modle+" "+this.Wb+" "+this.nd);
    }
}
