import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    // 1. Positive test
// if i > 0
// return reverseArray
    @Test
    public void testIndexGreaterThanZero(){
        int[] array = {2, 7, 3, 10};

        int[] expectedResult = {10, 3, 7, 2};

        int[] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 1. Positive test
// if i > 0
// return reverseArray
    @Test
    public void testOneElementArray(){
        int[] array = {2};

        int[] expectedResult = {2};

        int[] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOneElementArrayNegative(){
        int[] array = {};

        int[] expectedResult = {};

        int[] actualResult = new ReverseArray().reverseArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
