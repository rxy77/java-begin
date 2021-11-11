package Demo.Demo119;

public class Village {
    private static double waterAmount;
    private String name;
    private double drinkAmount;
    private int wateravg;

    public Village(String name, int wateravg) {
        this.name = name;
        this.wateravg = wateravg;
    }

    public double getDrinkAmount() {
        return drinkAmount;
    }

    public void setDrinkAmount(double drinkAmount) {
        this.drinkAmount = drinkAmount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getWaterAmount() {
        return waterAmount;
    }

    public static void setWaterAmount(double waterAmount) {
        Village.waterAmount = waterAmount;
    }

    public void drinkWater() {
        double drink=(this.drinkAmount*this.wateravg);
        if (drink>waterAmount) {
            drink=waterAmount;
            waterAmount=0;
        }
        else if(waterAmount >=  drink )
            waterAmount -= drink ;
        System.out.print(drink);
    }
}
