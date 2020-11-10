public class FibonacciNumber {
    public static int sumNumber(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        System.out.println("n = " + n);
        return sumNumber(n - 1);
    }

    public int fib(int N) {
        if(N==0)
            return 0;
        if (N==1)
            return 1;
        return fib(N - 1) + fib(N - 2);
    }

    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber=new FibonacciNumber();
        System.out.println(fibonacciNumber.fib(4));
    }
}
