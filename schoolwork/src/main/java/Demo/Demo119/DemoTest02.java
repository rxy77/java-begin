package Demo.Demo119;

import java.util.Scanner;

public class DemoTest02 {
    public static void main(String[] args) {
        int num=1;
        int k=0;
        int f=0;
        int a[]=new int[100];
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        if(isPrimeNum(x)==false)
        {
            System.out.println("no");
            System.exit(0);
        }
        else
            for(int i=0;;i++){
                if(x!=0){
                    a[i]=x%10;
                    x=x/10;
                    num*=10;
                    k++;
                }
                else
                    break;

            }
        for(int i=0;i<k;i++){
            f=f*10+a[i];
        }
//        System.out.println("该数反转后是："+f);
        if(isPrimeNum(f))
        {
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }

    public static boolean isPrimeNum(int a){//判断是否是素数
        if(a<=1)
            return false;
        for(int i=2 ; i<=Math.sqrt(a) ; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;

    }
}
