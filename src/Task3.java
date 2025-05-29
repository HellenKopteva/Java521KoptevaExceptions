import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Input integer");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int factorial = 0;
        try {
            factorial = factorial(i);
        }catch (NegativeNumberException exception){
            System.err.println("Catch exception " + exception.getMessage());
        }
        System.out.println(factorial);
    }


    public static int factorial(int number) throws NegativeNumberException {
        if (number == 0) {
            return 1;
        }
        if (number < 0) {
            throw new NegativeNumberException("Attempt to calc factorial of negative number.");
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
