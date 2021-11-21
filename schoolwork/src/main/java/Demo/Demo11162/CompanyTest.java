package Demo.Demo11162;

import java.util.Scanner;

public class CompanyTest {
    public static void main(String[] args) {
        int year=0;
        Scanner read = new Scanner(System.in);
        Company myCompany = new Company();


        if(read.hasNextInt())
            year = read.nextInt();
        System.out.println(myCompany.getTotalMoney(year)/10000);

    }
}
