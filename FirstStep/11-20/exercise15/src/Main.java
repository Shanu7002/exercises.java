//15. Create a multiplication table for a number provided by the user.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("The number " + n + " x " + i + " is: " + i * n);
        }
    }
}
