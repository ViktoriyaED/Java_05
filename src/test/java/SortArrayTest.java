import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SortArrayTest {

    // 1. Positive test
    //  positive numbers

    @Test
    public void testSortArrayPositiveValues() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};

        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    // negative numbers

    @Test
    public void testSortArrayNegativeValues() {

        int[] array = {-4, -3, -7, -12, -5, -2, -9, -4, -12};

        int[] expectedResult = {-12, -12, -9, -7, -5, -4, -4, -3, -2};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testSortArrayNegativeValuesNegative() {

        int[] array = {};

        int[] expectedResult = {};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
