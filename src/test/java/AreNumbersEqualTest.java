import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    // 1. Positive test
    //  if (number1 == number2)
    //  return 0;

    @Test
    public void testNumbersAreEqual() {

        int number1 = 89;
        int number2 = 89;

        int expectedResult = 0;

        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 1. Positive test
    //  if (number1 < number2)
    //  return -1;

    @Test
    public void testNumber1GreaterThanNumber2() {

        int number1 = -89;
        int number2 = 89;

        int expectedResult = -1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //  if (number1 > number2)
    //  return 1;

    @Test
    public void testNumber1LessThanNumber2() {

        int number1 = 89;
        int number2 = -89;

        int expectedResult = 1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
