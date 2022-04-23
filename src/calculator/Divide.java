package calculator;

public class Divide implements Operations{
    @Override
    public Double getResult(Double... numbers) {
        Double quotient = numbers [0];

        for (int i = 1; i < numbers.length; i++) {
            quotient /= numbers[i];
        }
        return quotient;
    }
}
