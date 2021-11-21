package Demo.Demo11162;

public class Truck  extends rentCar{
    int num=5,tm=30000;
    double dm=3.5;
//    static double s=0;
//    公司还有货运汽车5辆，租赁费用以公里数和吨数计算，3.5元每吨一公里，平均每周可以运载货物30000吨公里。
public static double earnM(){
    double s=((5*3.5)*30000)/7;
    return s;
}
}
