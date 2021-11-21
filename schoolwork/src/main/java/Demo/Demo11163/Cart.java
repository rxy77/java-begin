package Demo.Demo11163;

public class Cart {
    GetPriceable [] CartList = new GetPriceable[100];
    int GoodNumber = 0;
    boolean AddGoods(GetPriceable goods)
    {
        if (GoodNumber>=100)
            return false;
        else
        {
            CartList[GoodNumber] = goods;
            GoodNumber++;
            return true;
        }
    }
    void Print()
    {

        double sum=0;
        System.out.println("List:");
        for (GetPriceable getPriceable : CartList) {
            try{
                System.out.println(getPriceable.toString());
                System.out.println("TotalPrice:"+getPriceable.GetTotalPrice());
                sum+=getPriceable.GetTotalPrice();
            }catch (Exception e){

            }


        }
        System.out.println("ListPrice:"+sum);
    }
}
