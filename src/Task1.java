import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    //TODO: Processing InputMismatchException
    public static void main(String[] args){
        System.out.println("Input integer");
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
        } catch (InputMismatchException exception){
            System.out.println("Input value is inkorrect");
        }
    }
}
