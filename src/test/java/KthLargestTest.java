import org.testng.Assert;
import org.testng.annotations.Test;

public class KthLargestTest {

    // 1. Positive test
    //
    @Test
    public void testKthLargest() {
        int[] array = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int k = 3;

        int expectedResult = 9;

        int actualResult = new KthLargest().kthLargest(array, k);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testKthLargest1() {
        int[] array = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int k = 5;

        int expectedResult = 5;

        int actualResult = new KthLargest().kthLargest(array, k);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
