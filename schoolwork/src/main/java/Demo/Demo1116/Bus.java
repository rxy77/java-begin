package Demo.Demo1116;

public class Bus extends Automobile{
    int ns;//座位数量成员变量。

    public Bus(double height, double width, double weight, double trivalmiles, int fc, int ns) {
        super(height, width, weight, trivalmiles, fc);
        this.ns = ns;
    }

//    public Bus(int ns) {
//        this.ns = ns;
//    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    @Override
    public void Output() {
        System.out.println(this.ns);
    }
}
