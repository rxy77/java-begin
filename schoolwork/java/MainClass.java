package Demo;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double re1=sc.nextDouble();
        double im1=sc.nextDouble();
        double re2=sc.nextDouble();
        double im2=sc.nextDouble();
        Complex data1 = new Complex(re1, im1);

        Complex data2 = new Complex(re2, im2);


        Complex result_add = data1.add(data2);
        Complex result_sub = data1.sub(data2);
        Complex result_mul = data1.mul(data2);
        Complex result_div = data1.div(data2);

        System.out.print("Add:");result_add.print();
        System.out.print("Sub:");result_sub.print();
        System.out.print("Multi:");result_mul.print();
        System.out.print("Div:");result_div.print();
    }
}
