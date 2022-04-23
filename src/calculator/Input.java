package calculator;
import java.util.Scanner;

public class Input {
    public static String getInput() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input calculations:");

        String Input = userInput.nextLine();
        userInput.close();
        return Input;
    }
}