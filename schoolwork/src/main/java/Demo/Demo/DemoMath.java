package Demo;

import java.util.Scanner;

public class DemoMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        max(i1,i2,i3);
        min(i1,i2,i3);
        sum(i1,i2,i3);
        avg(i1,i2,i3);
    }
    private static void max(int x,int y,int z){
        if(x>y){
            if(x>z){
                System.out.println("max="+x);
            }
            else{
                System.out.println("max="+z);
            }
        }
        else{
            if(y>z){
                System.out.println("max="+y);
            }
            else{
                System.out.println("max="+z);
            }
        }
    }
    private static void min(int x,int y,int z){
        if(x<y){
            if(x<z){
                System.out.println("min="+x);
            }
            else{
                System.out.println("min="+z);
            }
        }
        else{
            if(y<z){
                System.out.println("min="+y);
            }
            else{
                System.out.println("min="+z);
            }
        }
    }

    private static void sum(int x,int y,int z){
        System.out.println("sum="+(x+y+z));
    }
    private static void avg(int x,int y,int z){
        double result =(x+y+z)/3d;
        System.out.print("avg=");
//        System.out.printf("%.1f",result);
        System.out.println(String.format("%.1f",result));

//        System.out.println("avg="+String.format("%.1f",((x+y+z)/3)));
    }
}
