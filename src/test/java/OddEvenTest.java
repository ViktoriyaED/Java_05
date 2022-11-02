import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddEvenTest {


    // 1. Positive testing Happy path
    //  if (number % 2 != 0)
    // return "Odd";

    @Test
    public void testOdd() {

        int number = -345;
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // if (number % 2 == 0)
    // return "Even";

    @Test
    public void testZeroEven() {
        int number = 0;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    // if (number % 2 == 0)
    // return "Even"

    @Test
    public void testEven() {
        int number = 222222;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    // 2. Negative testing Happy path
@Ignore
    @Test
    public void testEvenOddNumbersMaxValue() {
        int number = Integer.MAX_VALUE + 1;
        String expectedResult = "Error";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
@Ignore
    @Test
    public void testEvenOddNumbersMinValue() {
        int number = Integer.MIN_VALUE - 1;
        String expectedResult = "Error";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }


}

