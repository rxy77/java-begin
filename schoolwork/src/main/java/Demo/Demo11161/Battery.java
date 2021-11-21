package Demo.Demo11161;

public class Battery {
    int power;

    public Battery() {
        power = 100;
    }

    public void consume(int p){
        power-=p;
    }

    public int getPower() {
        return power;
    }
}
