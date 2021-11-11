package Demo.Demo119;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class DemoTest01 {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

//        Date date1 = new Date(y1, m1, d1);
//        Date date2 = new Date(y2, m2, d2);

//        String datee1=date1.getYear()+"-"+date1.getMonth()+"-"+date1.getDay();
//        String datee2=date2.getYear()+"-"+date2.getMonth()+"-"+date2.getDay();
        String datee1=y1+"-"+m1+"-"+d1;
        String datee2=y2+"-"+m2+"-"+d2;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");

        Date dd1 = new Date(y1,m1,d1);
        Date dd2 = new Date(y2,m2,d2);
//        Date dd1=sdf.parse(datee1);
//        Date dd2=sdf.parse(datee2);

        int daysBetween= (int) ((dd2.getTime() - dd1.getTime()) / (1000*3600*24));


//        int day1 = Date.outDay(date1.getYear(), date1.getMonth(), date1.getDay());
//        int day2 = Date.outDay(date2.getYear(), date2.getMonth(), date2.getDay());
//        int sum=Math.abs(day1-day2);
//        System.out.println(sum);

        System.out.println(daysBetween);
    }
}
