package UnitTest;

/*
 * Sahil Singla, sahil.9singla@gmail.com
 */
public class ArithmeticOps {

	/*
	 *  This function adds two numbers
	 *  @Param > Two Integer values
	 *  @Return > Addition of both the integer value
	 */
	public int add(int x, int y) {
		return x + y;
	}

	/*
	 *  This function subtracts two numbers
	 *  @Param > Two Integer values
	 *  @Return > Subtraction of integer value
	 */
	public int subtract(int x, int y) {
		return x - y;
	}

	/*
	 *  This function multiplies two numbers
	 *  @Param > Two Integer values
	 *  @Return > Multiplication of both the integer value
	 */
	public int multiply(int x, int y) {
		int result = 0;
		int num1 = verifyNegative(x);
		int num2 = verifyNegative(y);
		result = num1 * num2;

		if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
			return result;
		} else {
			return swtichNegateNumber(result);
		}
	}

	/* This function divides two numbers
	 *  @Param > Two Integer values- here x is dividend and y is divisor
	 *  @Return > Division result
	 */
	public int divide(int x, int y) {
		int result = 0;
		if (y == 0) {
			System.out.println(("Case: Divider is zero"));
			
		} else {
			int dividend = verifyNegative(x);
			int divisor = verifyNegative(y);
			result = dividend / divisor; }

		if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
			return result;
		} else { return swtichNegateNumber(result); }
	}

	/*
	 * This method check if number is negative.
	 * @Return > this will check if the input value is negative or not.
	 */
	private int verifyNegative(int value) {
		if (value < 0) {
			return swtichNegateNumber(value);
		} else {
			return value;
		}
	}

	/*This method convert negative number to positive and vice versa.
	 * @Return> return the negative value if input positive value and vice versa.
	 */
	public int swtichNegateNumber(int value) {
		int result = 0;
		int foo = value < 0 ? 1 : -1;
		while (value != 0) {
			value += foo;
			result += foo;}
		return result;
	}

}
