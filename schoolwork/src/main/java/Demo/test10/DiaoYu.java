package Demo.test10;

public class DiaoYu {

    public static int number(double hour) {
        int sum=0;
        if (hour<2){
            sum=(int) hour*10;
            return sum;
        }else if (hour>2){
            sum=(int) (hour*10+(hour-2)*5);
        }else System.out.println("error input");

        return sum;

    }



}
