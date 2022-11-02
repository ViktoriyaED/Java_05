import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeOnTheRightTest {

    /**
     * Task 13
     * Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает массив,
     * в котором все негативные числа находятся во второй половине массива (массив не должен быть отсортирован)
     * Test Data:
     * {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
     */

    // 1. Positive test
    //  positive numbers

    @Test
    public void testNegativeOnTheRight() {

        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};

        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(array);

        Assert.assertEquals(actualResult, expectedResult);

    }






}
