import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator Program!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

 System.out.println("Thank You Gyus");
        
        scanner.close();
    }
}