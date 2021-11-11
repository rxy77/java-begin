package Demo.Demo119;

public class Date {
    private int year,month,day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public Date() {
        this.year = 2000;
        this.month = 1;
        this.day = 1;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    int interval(Date d){
        int days=0;

        return days;

    }
    public static int outDay(int year, int month, int day) {

        //定义数组，这里2月的天数取28，假设是平年。
        int[] Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //如果是闰年，那么2月应该有29天。
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            Day[1] = 29;
        }

        //进行判断
        if (year <= 0 || month <= 0 || month > 12 || day <= 0 || day > Day[month - 1]){
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += Day[i];
        }

        //最后sum需要加上当前月份的日期。
        return sum + day;
    }
}
