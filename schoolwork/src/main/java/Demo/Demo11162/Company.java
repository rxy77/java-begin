package Demo.Demo11162;

import java.util.GregorianCalendar;

public class Company {
    final int startYear = 2000;
    final int endYear = 2020;
    rentCar [] myCars;
    double sum=0;

    void setTotalCars(int TaxiNumber,int BusNumber,int TruckNumber)
    {

    }
    double getTotalMoney(int year)
    {
        rentCar rentCar = new rentCar();
        float v = rentCar.earnMoney(year);
        return v;
    }
        public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public rentCar[] getMyCars() {
        return myCars;
    }

    public void setMyCars(rentCar[] myCars) {
        this.myCars = myCars;
    }
}
