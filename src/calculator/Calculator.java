package calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    public static void main(String[] args) {
        final String readInput = Input.getInput();

        Queue<String> operations;
        Queue<String> numbers;

        String numberArray[] = readInput.split("[-+/*]");
        String operationArray[] = readInput.split("[0-9]+");

        operations = new LinkedList<String>(Arrays.asList(operationArray));
        numbers = new LinkedList<String>(Arrays.asList(numberArray));

        Double result = Double.parseDouble(numbers.poll());

        while (!numbers.isEmpty()) {
            String function = operations.poll();
            Operations operation;

            switch(function) {
                case "+":
                    operation = new Add();
                    break;
                case "-":
                    operation = new Subtract();
                    break;
                case "/":
                    operation = new Divide();
                    break;
                case "*":
                    operation = new Multiply();
                    break;
                default:
                    continue;
            }

            Double number = Double.parseDouble(numbers.poll());

            result = operation.getResult(result, number);

        }

        System.out.println(result);

    }
}
