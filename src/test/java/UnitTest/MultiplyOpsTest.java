package UnitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyOpsTest {
	ArithmeticOps arthmetic = new ArithmeticOps();
	
	

	// Multiplication of two positive number
	@Test
	public void multiplyTwoPositiveTest() {
		int result = arthmetic.multiply(10, 5);
		Assert.assertEquals(50, result);
	}

	// Multiplication of One positive and One Negative number
	@Test
	public void multiplyOnePostiveOneNegativeTest() {
		int result = arthmetic.multiply(10, -5);
		Assert.assertEquals(-50, result);
	}

	// Multiplication of two Negative number
	@Test
	public void multiplyTwoNegativeTest() {
		int result = arthmetic.multiply(-10, -5);
		Assert.assertEquals(50, result);
	}
	
	// Multiplication of One positive and One Zero number
		@Test
		public void multiplyOnePostiveOneZeroTest() {
			int result = arthmetic.multiply(10, 0);
			Assert.assertEquals(0, result);
		}

}



