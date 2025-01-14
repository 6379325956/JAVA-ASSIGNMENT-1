import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();

        
        scanner.close();

        
        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        
        int sum = N * (N + 1) / 2;

        
        System.out.println("The sum of the first " + N + " natural numbers is: " + sum);
    }
}
