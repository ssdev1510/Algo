package UnitTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DivideOpsTest {
	ArithmeticOps arthmetic = new ArithmeticOps();

	// Divide of two positive number
	@Test
	public void divideTwoPositiveTest() {
		int result = arthmetic.divide(10, 5);
		Assert.assertEquals(2, result);
	}

	// Divide of One positive and One Negative number
	@Test
	public void divideOnePostiveOneNegativeTest() {
		int result = arthmetic.divide(10, -5);
		Assert.assertEquals(-2, result);
	}

	// Divide of two Negative number
	@Test
	public void divideTwoNegativeTest() {
		int result = arthmetic.divide(-10, -5);
		Assert.assertEquals(2, result);
	}

	// Divide of One positive and One Zero number
	@Test
	public void divideOnePostiveOneZeroTest() {
		arthmetic.divide(10, 0);
		System.out.println("Error > Divider can not be zero");
		
	}

	// Divide of One Zero and One Negative number
	@Test
	public void divideOneZeroOneNegativeTest() {
		int result = arthmetic.divide(0, -10);
		Assert.assertEquals(0, result);
	}

}
