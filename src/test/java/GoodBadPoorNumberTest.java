import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodBadPoorNumberTest {

    // 1. Positive test
    //   if (M % 7 == 0 && M % 9 == 0)
    //   return "Good Number";

    @Test
    public void testGoodNumber() {

        int M = 63;

        String expectedResult = "Good Number";

        String actualResult = new GoodBadPoorNumber().goodBadPoorNumber(M);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //   if (M % 9 == 0)
    //   return "Bad Number";

    @Test
    public void testBadNumber() {

        int M = 45;

        String expectedResult = "Bad Number";

        String actualResult = new GoodBadPoorNumber().goodBadPoorNumber(M);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //   if (M % 11 == 0)
    //   return "Poor Number";

    @Test
    public void testPoorNumber() {

        int M = 22;

        String expectedResult = "Poor Number";

        String actualResult = new GoodBadPoorNumber().goodBadPoorNumber(M);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //   doesn't satisfy any of the above conditions
    //   return "-1";

    @Test
    public void testNumberMinusOne() {

        int M = 10;

        String expectedResult = "-1";

        String actualResult = new GoodBadPoorNumber().goodBadPoorNumber(M);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //   doesn't satisfy any of the above conditions
    //   return "-1";

    @Test
    public void testNumberZero() {

        int M = 0;

        String expectedResult = "Zero is always multiple of every number";

        String actualResult = new GoodBadPoorNumber().goodBadPoorNumber(M);

        Assert.assertEquals(actualResult, expectedResult);
    }












}
