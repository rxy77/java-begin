package Demo.Demo11163;

public abstract class Goods implements GetPriceable{
    String Name;
    String ManuPlace;
    double Price;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getManuPlace() {
        return ManuPlace;
    }

    public void SetManuPlace(String ManuPlace) {
        this.ManuPlace = ManuPlace;
    }

    public double getPrice() {
        return Price;
    }

    public void SetPrice(double Price) {
        this.Price = Price;
    }
}
