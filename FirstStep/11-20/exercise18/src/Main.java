//18. Count how many numbers between 1 and 100 are divisible by 3.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 100, sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
