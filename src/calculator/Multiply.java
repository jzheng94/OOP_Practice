package calculator;

public class Multiply implements Operations{
    @Override
    public Double getResult(Double... numbers) {
        Double product = 1.0;

        for (Double num : numbers) {
            product *= num;
        }

        return product;
    }
}