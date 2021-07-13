package UnitTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionOpsTest {
	ArithmeticOps arthmetic = new ArithmeticOps();

	// Addition of two positive number
	@Test
	public void addTwoPositiveTest() {
		int result = arthmetic.add(10, 5);
		Assert.assertEquals(15, result);
	}

	// Addition of One positive and One Negative number
	@Test
	public void addOnePostiveOneNegativeTest() {
		int result = arthmetic.add(10, -5);
		Assert.assertEquals(5, result);
	}

	// Addition of two Negative number
	@Test
	public void addTwoNegativeTest() {
		int result = arthmetic.add(-10, -5);
		Assert.assertEquals(-15, result);
	}
}
