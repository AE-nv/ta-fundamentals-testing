package be.ae.testing.lab_2;

public class GenericCalculator {

    public int calculate(String operator, int a, int b) {
        return switch (operator) {
            case "+" -> a + b;
            case "*" -> {
                if (a == 0) yield 0;
                yield b + this.calculate("*", a - 1, b);
            }
            default -> 42;
        };
    }

}
