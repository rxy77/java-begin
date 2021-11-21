package Demo.Demo11163;

public class PieceGoods extends Goods{
    int pieces;
    void SetAccount(int pieces)
    {
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return "Name:" + Name +
                ";Producing area:" + ManuPlace +
                ";Price:" + Price +
                ";Number:" + pieces +
                ';';
    }

    @Override
    public double GetTotalPrice() {

        return this.pieces*Price;
    }

    @Override
    public String Report() {
        return null;
    }
}
