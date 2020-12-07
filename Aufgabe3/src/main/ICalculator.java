package htwg_konstanz.swqs.ro981rin.aufgabe3;


public interface ICalculator {

	/**
	 * add a number to another one
	 * 
	 * @param num1	first number for addition
	 * @param num2	second number for addition
	 * @return	sum of num1 and num2
	 */
	public int addition(int num1, int num2);
	
	
	/**
	 * substract a number from another one
	 * 
	 * @param num1	first number for substraction
	 * @param num2	second number for substraction
	 * @return	difference of num1 and num2
	 */
	public int substraction(int num1, int num2);
	
	/**
	 * divides a number by another number
	 * 
	 * @param num1	numerator for divison
	 * @param num2	denominator for divions
	 * @return	quotient of num1 and num2
	 */
	public double division(int num1, int num2);
	
	/**
	 * multiplicate a number by another number
	 * 
	 * @param num1	first factor for multiplication
	 * @param num2	second factor for multiplication
	 * @return	product value of num1 and num2
	 */
	public int multiplication(int num1, int num2);
}
