package Demo.Demo1116;

public class Ship extends Vehicle{
    int Fc;//燃油消耗
    int Dw;

    public Ship(double height, double width, double weight, double trivalmiles, int fc, int dw) {
        super(height, width, weight, trivalmiles);
        Fc = fc;
        Dw = dw;
    }

    public int getFc() {
        return Fc;
    }

    public void setFc(int fc) {
        Fc = fc;
    }

    public int getDw() {
        return Dw;
    }

    public void setDw(int dw) {
        Dw = dw;
    }

    @Override
    public void Output() {
        super.Output();
    }
}
