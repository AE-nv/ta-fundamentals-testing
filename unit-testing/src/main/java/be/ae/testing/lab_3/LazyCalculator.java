package be.ae.testing.lab_3;

public class LazyCalculator {

    private final WorkingTimeService workingTimeService;

    public LazyCalculator(WorkingTimeService workingTimeService) {
        this.workingTimeService = workingTimeService;
    }

    public int forceCalculate(String operator, int a, int b) {
        System.out.println("I was forced to calculate " + a + " " + operator + " " + b);
        return this.doCalculation(operator, a, b);
    }

    public int nicelyCalculate(String operator, int a, int b) {
        if (!workingTimeService.isItWorkingTime()) {
            throw new IllegalStateException("I don't want to work right now!");
        }
        return doCalculation(operator, a, b);
    }

    private int doCalculation(String operator, int a, int b) {
        return switch (operator) {
            case "+" -> a + b;
            case "*" -> {
                if (a == 0) yield 0;
                yield b + this.doCalculation("*", a - 1, b);
            }
            default -> 42;
        };
    }
}
