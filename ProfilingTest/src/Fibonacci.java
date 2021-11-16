

public class Fibonacci {


    public static void main(String[] args) {
        int result = fibo(1000);
        System.out.println("fibo is " + result);
    }

    public static int fibo(int n) {
        int first = 1;
        int second = 1;
        int temp;
        for (int i = 2; i < n; i++) {
            temp = first;
            first = second;
            second = second + temp;
        }
        return second;
    }

    public static int fibo_bad(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibo_bad(n - 1) + fibo_bad(n - 2);
    }
}
