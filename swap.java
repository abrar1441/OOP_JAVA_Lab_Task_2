import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first variable (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second variable (b): ");
        int b = scanner.nextInt();
        
        System.out.println("\nBefore swapping: a = " + a + ", b = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        scanner.close();
    }
}
