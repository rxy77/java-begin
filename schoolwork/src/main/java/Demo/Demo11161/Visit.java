package Demo.Demo11161;

import java.util.ArrayList;
import java.util.Scanner;

public class Visit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> dst = new ArrayList<Integer>();
        int visitCount = 0;
        while(scanner.hasNextInt()){
            visitCount++;
            dst.add(scanner.nextInt());
        }
        if(visitCount<4){
            System.out.println("Please input number >= 4");
            return;
        }
        Ebike bike = new Ebike(dst.remove(0));
        for (Integer i : dst) {
            bike.visit(i);
        }
    }
}
