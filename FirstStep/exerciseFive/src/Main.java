//5. Write a program that takes two numbers and displays the sum, subtraction, multiplication, and division.

public class Main {
    public static void main(String[] args) {
        double n = 5, x = 3;
        double sum = n + x;
        double sub = n - x;
        double mul = n * x;
        double div = n / x;

        System.out.printf("The sum is: %.0f\n", sum);
        System.out.printf("The subtraction is: %.0f\n", sub);
        System.out.printf("The multiplication is: %.0f\n", mul);
        System.out.printf("The division is: %.2f\n", div);
    }
}