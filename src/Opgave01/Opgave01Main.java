package Opgave01;

public class Opgave01Main {
    public static int factorial(int n) {
        int result = 0;
        if(n <= 0) {
            return 1;

        }
        result = factorial(n - 1);
        return n * result;
    }
}
