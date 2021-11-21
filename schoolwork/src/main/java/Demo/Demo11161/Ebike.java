package Demo.Demo11161;

public class Ebike {
    Battery battery;
    int currentPlace;
    final int POWER_CONSUME_PER_KILOMETER = 10;

    public Ebike(int currentPlace) {
        battery = new Battery();
        this.currentPlace = currentPlace;
        System.out.println("Visit " + currentPlace);
    }

    public void visit(int place){
        double distance = Map.distanceBetween(currentPlace,place);
        if (distance*POWER_CONSUME_PER_KILOMETER > battery.getPower()){
            changeBattery();
        }
        battery.consume((int) (distance*POWER_CONSUME_PER_KILOMETER));
        System.out.printf("From %d to %d battery consume %d remain %d\n",currentPlace,place,(int)(distance*POWER_CONSUME_PER_KILOMETER),battery.getPower());
        currentPlace = place;
        System.out.println("Visit " + currentPlace);
    }

    private void changeBattery(){
        battery = new Battery();
        System.out.println("Change battery at " + currentPlace);
    }
}
