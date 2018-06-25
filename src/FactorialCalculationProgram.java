import java.util.Scanner;

public class FactorialCalculationProgram {
    public static void main(String[] args) {
        System.out.println("Factorial calculation program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial:");
        long N = scanner.nextLong();
        long fact = factorial(N);
        System.out.println("The factorial of N is: " + fact);
    }
    static long factorial(long N) {
        if (N <= 1) {
            return 1;
        }
        return N * factorial(N - 1);
    }
}
