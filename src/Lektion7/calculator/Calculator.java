package Lektion7.calculator;

public class Calculator {
    public int calculate(int tal1, int tal2, String metod) throws ArithmeticException, IllegalArgumentException {
        switch(metod.toLowerCase()) {
            case "add":
                return tal1 + tal2;
            case "subtract":
                return tal1 - tal2;
            case "multiply":
                return tal1 * tal2;
            case "divide":
                if (tal2 == 0) {
                    throw new ArithmeticException();
                } else {
                    return tal1 / tal2;
                }
            default:
                throw new IllegalArgumentException();

        }
    }


}
