import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    // 1. Positive test
    // positive numbers
    @Test
    public void biggerValueTestPositiveNumbers() {
        int number1 = 3333;
        int number2 = 9999;

        int expectedResult = 9999;

        int actualResult = new BiggerValue().biggerValue(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // negative numbers
    @Test
    public void biggerValueTestNegativeNumbers() {
        int number1 = -1234;
        int number2 = -4321;

        int expectedResult = -1234;

        int actualResult = new BiggerValue().biggerValue(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // positive and negative numbers
    @Test
    public void biggerValueTestNegativeAndPositiveNumbers() {
        int number1 = -100;
        int number2 = 100;

        int expectedResult = 100;

        int actualResult = new BiggerValue().biggerValue(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // same value numbers
    @Test
    public void biggerValueTestSameNumbers() {
        int number1 = 5;
        int number2 = 5;

        int expectedResult = 5;

        int actualResult = new BiggerValue().biggerValue(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
