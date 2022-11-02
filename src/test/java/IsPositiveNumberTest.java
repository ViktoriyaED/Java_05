import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    // 1. Positive test
    // положительное число
    @Test
    public void testPositiveNumber() {

        int number = 555;

        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // число 0
    @Test
    public void testNumberZero() {

        int number = 0;

        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // отрицательное число
    @Test
    public void testNegativeNumber() {

        int number = -555;

        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // десятичное отрицательное число
    @Test
    public void testNegativeNumberWithDecimal() {

        double number = -55.5;

        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // десятичное положительное число
    @Test
    public void tesPositiveNumberWithDecimal() {

        double number = 55.5;

        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // число 0.0
    @Test
    public void testDecimalNumberZero() {

        double number = 0.0;

        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
