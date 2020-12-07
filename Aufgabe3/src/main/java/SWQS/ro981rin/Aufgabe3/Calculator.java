package SWQS.ro981rin.Aufgabe3;


public class Calculator implements ICalculator{
	
	public int addition(int num1, int num2) {
		return num1 + num2;
	}

	public int substraction(int num1, int num2) {
		return num1 - num2;
	}

	public double division(int num1, int num2) {
		return (double) num1/num2;
	}

	public int multiplication(int num1, int num2) {
		return num1 * num2;
	}
}
