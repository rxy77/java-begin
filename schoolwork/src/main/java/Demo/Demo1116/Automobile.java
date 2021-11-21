package Demo.Demo1116;

public class Automobile extends Vehicle{
    int Fc;//燃油消耗

    public Automobile(double height, double width, double weight, double trivalmiles, int fc) {
        super(height, width, weight, trivalmiles);
        Fc = fc;
    }

    public int getFc() {
        return Fc;
    }

    public void setFc(int fc) {
        Fc = fc;
    }

    @Override
    public void Output() {
        super.Output();
    }
}
