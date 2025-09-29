//19. Print the Fibonacci sequence up to the 10th term.

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int ant = 0;

        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                n = 1;
                ant = 0;
            } else {
                n += ant;
                ant = n - ant;
            }
            System.out.println(n);
        }
    }
}
