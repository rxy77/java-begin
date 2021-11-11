package Demo.Demo119;

import java.util.Scanner;

public class DemoLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Village.setWaterAmount(sc.nextDouble());
        System.out.println(Village.getWaterAmount());
        Village Zhang = new Village("Zhang",sc.nextInt());
        Zhang.setDrinkAmount(sc.nextDouble());
        Village Li = new Village("Li",sc.nextInt());
        Li.setDrinkAmount(sc.nextDouble());
        Zhang.drinkWater();
        System.out.println(" " + Li.getWaterAmount());
        Li.drinkWater();
        System.out.println(" " + Zhang.getWaterAmount());
    }
}

