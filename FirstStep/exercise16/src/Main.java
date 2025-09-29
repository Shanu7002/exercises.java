//16. Check if a person can vote based on their age.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int n = sc.nextInt();
        if(n >= 18){
            System.out.print("Your able to vote in Brazil.");
        } else{
            System.out.print("Your are not able to vote in Brazil.");
        }
    }
}
