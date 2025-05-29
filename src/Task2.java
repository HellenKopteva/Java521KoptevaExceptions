import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    //TODO: Processing DateTimeParseException
    public static void main (String[] args){
        System.out.println("Input data in format: YYYY-MM-DD, for example: 2022-01-31");
        Scanner scanner = new Scanner(System.in);
        String dataS = scanner.nextLine();
        try {
            LocalDate data = LocalDate.parse(dataS);
        } catch (java.time.format.DateTimeParseException exception){
            System.out.println("Input value is inkorrect");
        }
    }
}
