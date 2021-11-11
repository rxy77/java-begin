package Demo.Demo112;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo03test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student stu[] = new Student[10];

        for (int i = 0; i < 10; i++) {
            String s = sc.next();
            int i1 = sc.nextInt();
            boolean b = sc.nextBoolean();
            double score = sc.nextDouble();
            stu[i] =new Student(s, i1, b, score);
        }
//        System.out.println(stu);
        int temp = 0;
        int temp1=0;
        double max=stu[0].getScore();
        double min=stu[0].getScore();
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].getScore()>max) {
                max=stu[i].getScore();
                temp=i;
            }
            if (stu[i].getScore()<min) {
                min=stu[i].getScore();
                temp1=i;
            }
        }


//        for (int i = 0; i < stu.length-1; i++) {
//            if (stu[i].getScore()<stu[i+1].getScore()){
//                temp1=i;
//            }else temp1=i+1;
//        }
        System.out.print("MAX:");
        stu[temp].show();
        System.out.println();
        System.out.print("MIN:");
        stu[temp1].show();
        System.out.println();

    }
}
