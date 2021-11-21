package Demo.Demo11163;

public class GoodsTest {
    public static void main(String [] args)
    {
        Cart myCart = new Cart();
        Apple myApple = new Apple("shanxi");
        myApple.SetPrice(5.5);
        myApple.SetAccount(3.4);
        Fish myFish = new Fish("qiandaohu");
        myFish.SetPrice(19.8);
        myFish.SetAccount(2.6);
        Cup myCup = new Cup("hangzhou");
        myCup.SetPrice(3.8);
        myCup.SetAccount(2);
        ToothBrush myToothBrush = new ToothBrush("shanghai");
        myToothBrush.SetPrice(15.6);
        myToothBrush.SetAccount(1);

        myCart.AddGoods(myApple);
        myCart.AddGoods(myFish);
        myCart.AddGoods(myCup);
        myCart.AddGoods(myToothBrush);
        myCart.Print();
    }
}
