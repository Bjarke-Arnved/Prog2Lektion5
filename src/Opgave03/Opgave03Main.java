package Opgave03;

import java.util.Queue;

public class Opgave03Main {
    public static int power(int n, int p) {
        int result = 0;
        if(p <= 0) {
            return 1;
        }

        if(p % 2 == 0) {
            result = power(n * n, p / 2);
        }
        else {
            result = power(n, p - 1) * n;
        }
        return result;
    }
}
