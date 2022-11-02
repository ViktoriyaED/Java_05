import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    // 1. Positive test
    //
    @Test
    public void testMinMaxAverageValue() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;

        int [] expectedResult = {3, 7, 5};

        int[] actualResult = new MinMaxAve().minMaxAve(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 1. Positive test
    //
    @Test
    public void testMinMaxAverageValue1() {
        int[] array = {-1, -2, -3, -4, -5, -6, -7, -8};
        int index1 = 2;
        int index2 = 6;

        int [] expectedResult = {-7, -3, -5};

        int[] actualResult = new MinMaxAve().minMaxAve(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }



    @Test
    public void testMinMaxAverageValue2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 0;
        int index2 = 7;

        int [] expectedResult = {1, 8, 4};

        int[] actualResult = new MinMaxAve().minMaxAve(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testMinMaxAverageValue3() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 7;
        int index2 = 0;

        int [] expectedResult = {1, 8, 4};

        int[] actualResult = new MinMaxAve().minMaxAve(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testMinMaxAverageValue4() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 2;

        int [] expectedResult = {3, 3, 3};

        int[] actualResult = new MinMaxAve().minMaxAve(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }
@Ignore
    @Test
    public void testMinMaxAverageValue5() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 12;
        int index2 = 2;

        int [] expectedResult = new int[0];

        int[] actualResult = new MinMaxAve().minMaxAve(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
