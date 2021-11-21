package Demo.Demo1116;

public class Plane extends Vehicle{
    int Fc;//燃油消耗

    int trivalmiles,Mtw;

    String modle,category;

    public Plane(double height, double width, double weight, double trivalmiles, int fc, int trivalmiles1, int mtw, String modle, String category) {
        super(height, width, weight, trivalmiles);
        Fc = fc;
        this.trivalmiles = trivalmiles1;
        Mtw = mtw;
        this.modle = modle;
        this.category = category;
    }

    public Plane(double height, double width, double weight, double trivalmiles) {
        super(height, width, weight, trivalmiles);
    }


    public int getFc() {
        return Fc;
    }

    public void setFc(int fc) {
        Fc = fc;
    }

    @Override
    public double getTrivalmiles() {
        return trivalmiles;
    }

    public void setTrivalmiles(int trivalmiles) {
        this.trivalmiles = trivalmiles;
    }

    public int getMtw() {
        return Mtw;
    }

    public void setMtw(int mtw) {
        Mtw = mtw;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void Output() {
        super.Output();
    }
}
