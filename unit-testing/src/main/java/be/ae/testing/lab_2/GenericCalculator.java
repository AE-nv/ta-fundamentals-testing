package be.ae.testing.lab_2;

public class GenericCalculator {

    public int calculate(String operator, int a, int b) {
        switch(operator) {
            case "+":
                return (a + b) % 7;
            case "*":
                if (a == 0) return 0;
                return b + this.calculate("*", a - 1, b);
            default:
                return 42;
        }
    }

}
