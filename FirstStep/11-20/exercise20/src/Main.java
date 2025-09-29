//20. Create an interactive menu using switch-case.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select a option: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("First Option");
                break;
            case 2:
                System.out.println("Second Option");
                break;
            case 3:
                System.out.println("Third Option");
                break;
            case 4:
                System.out.println("Fourth Option");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
