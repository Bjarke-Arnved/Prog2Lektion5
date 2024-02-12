package Opgave02;

public class Opgave02Main {
    public static int fibonacci(int n) {

        if(n <= 0 || n == 1) {
            return n;
        }
        int result = fibonacci(n-1) + fibonacci(n-2);
        return result;
    }
}
