import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Bube= new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = Bube.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = Bube.nextInt();
        
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
