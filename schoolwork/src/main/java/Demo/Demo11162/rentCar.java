package Demo.Demo11162;

import java.util.GregorianCalendar;

public class rentCar {

    double sum=0;
    float earnMoney(int year)
    {
        sum=Taxi.earnM()+Bus.earnM()+Truck.earnM();
        int days = getDaysofYear(year);
        sum*=days;
        return (float) sum;
    }

    int getDaysofYear(int year)
    {
        return new GregorianCalendar().isLeapYear(year) ? 366 : 365;
    }
}
