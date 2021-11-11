package Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class test10_19 {
    public static void main(String[] args) {

        int a,b,c,e,f,t;
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        a=y%4;
        b=y%100;
        c=y%400;
        e=m-1;
        f=e/2;
        if((a==0&&b!=0)||c==0)
        {
            if(m<=2)
            {
                t=e*31+d;
                System.out.println(t);

            }
            else
            {
                if(m<=8)
                {
                    t=e*31-f-1+d;
                    System.out.println(t);

                }
                else
                {
                    t=244+(e-8)*31-(e-7)/2+d;
                    System.out.println(t);

                }
            }
        }
        else
        {
            if(m<=2)
            {
                t=e*31+d;
                System.out.println(t);
            }
            else
            {
                if(m<=8)
                {
                    t=e*31-f-2+d;
                    System.out.println(t);
                }
                else
                {
                    t=243+(e-8)*31-(e-7)/2+d;
                    System.out.println(t);
                }
            }
        }

    }
}
