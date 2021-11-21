package Demo.Demo11163;

public class WeightGoods extends Goods{
    double Weight;
    void SetAccount(double Weight)
    {
        this.Weight = Weight;
    }

    @Override
    public String toString() {
        return "Name:" + Name +
                ";Producing area:" + ManuPlace  +
                ";Price:" + Price +
                ";Weight:" + Weight +
                ';';
    }

    @Override
    public double GetTotalPrice() {
        return this.Weight*Price;
    }

    @Override
    public String Report() {
        return null;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }
}
