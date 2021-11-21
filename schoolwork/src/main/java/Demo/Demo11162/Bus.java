package Demo.Demo11162;

public class Bus  extends rentCar{
    int num=10,dmm=500,am=8000;
//    static double s;
//    大客车10辆，租赁以里程为单位，每百公里500元，平均每个月行驶8000公里，
    public static double earnM(){
        double s=((10*500)*8000)/30;
        return s;
    }
}
