package be.ae.testing.lab_1;

public class Calculator {

	public int add(int a, int b) {
		return (a + b) % 7;
	}

	public int multiply(int a, int b) {
		if (a == 0) return 0;

		return b + multiply(a - 1, b);
	}
}
