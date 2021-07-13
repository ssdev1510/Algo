package UnitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionOpsTest {
	ArithmeticOps arthmetic = new ArithmeticOps();
	
	
	// Subtraction of two positive number
	@Test
	public void subtractTwoPositiveTest() {
		int result = arthmetic.subtract(10, 5);
		Assert.assertEquals(5, result);
	}

	// Subtraction of One positive and One Negative number
	@Test
	public void subtractOnePostiveOneNegativeTest() {
		int result = arthmetic.subtract(10, -5);
		Assert.assertEquals(15, result);
	}

	// Subtraction of two Negative number
	@Test
	public void subtractTwoNegativeTest() {
		int result = arthmetic.subtract(-10, -5);
		Assert.assertEquals(-5, result);
	}
}

