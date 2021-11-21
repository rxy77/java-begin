package Demo.Demo11161;

public class Map {
    final static String distanceMap = "2.3\n" +
            "4.6 3.4\n" +
            "5.6 4.5 5.1\n" +
            "4.8 3.7 6.1 3.5\n" +
            "3.8 3.1 4.3 1.5 3.2\n" +
            "4.8 4.2 5.3 3.3 3.7 2.4\n" +
            "3.8 4.1 6.3 3.9 1.9 3.3 6.4\n" +
            "5.8 7.1 5.5 3.4 4.2 5.4 5.6 4.5\n" +
            "4.8 6.1 2.3 3.4 3.7 4.4 6.6 3.7 4.2";
    final static int[] foo = {0,1,3,6,10,15,21,28,36};
    public static double distanceBetween(int from,int to){
        int f = Math.max(from,to);
        int t = Math.min(from,to);
        String a = distanceMap.split("\n")[f-1].split(" ")[t];
        return Double.parseDouble(a);
    }
}
