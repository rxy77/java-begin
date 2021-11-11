package Demo.Demo119;

public class DemoTest03 {
    public static void main(String[] args) {
        int x;
        x = A(5);
        System.out.print(x);
    }

    static int A(int n) {
        if (n > 0)
            return (n * A(n - 2));
        else
            return (1);
    }
}
