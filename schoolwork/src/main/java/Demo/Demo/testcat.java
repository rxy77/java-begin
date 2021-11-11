package Demo;

import java.util.Scanner;

public class testcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hour = sc.nextDouble();
        int pond=1000;
        int sum=0;
        int sum1=0;
        int sum2=0;

        if (hour<2){
            sum1=(int) (hour*10);
        }else if (hour>2){
            sum1=(int) (hour*10);
            double hour2=(hour-2);
            sum2=(int) (hour2*5);
        }else if (hour<0){
            System.out.println("error input");
        }


        if ((sum1+sum2)>1000)   pond=0;
        else pond=pond-(sum1+sum2);


        System.out.println("there are "+pond+" fishes in pond");
        System.out.println("mama has "+sum1+" fishes");
        System.out.println("kitty has "+sum2+" fish");
    }
}
