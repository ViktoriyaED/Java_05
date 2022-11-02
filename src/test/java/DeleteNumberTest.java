import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteNumberTest {

    /** Task 1 Part 3 Algorithms
     * Написать метод deleteNumber, который принимает на вход массив целых чисел и число number.
     * Удалите все вхождения числа number из массива (пропусков быть не должно).
     * ({0,1,2,2,3,0,4,2}, 2) -> {0, 1, 3, 0, 4}
     */

    @Test
    public void testDeleteNumberHappyPath() {

        int[] array = {0, 1, 2, 2, 3, 0, 4, 2};

        int number = 2;

        int[] expectedResult = {0, 1, 3, 0, 4};

        int[] actualResult = new DeleteNumber().deleteNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDeleteNumberHappyPath1() {

        int[] array = {0, 6, 1, 2, 2, 6, 3, 0, 4, 2, 4};

        int number = 0;

        int[] expectedResult = {6, 1, 2, 2, 6, 3, 4, 2, 4};

        int[] actualResult = new DeleteNumber().deleteNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDeleteNumberNegative() {

        int[] array = {};

        int number = 2;

        int[] expectedResult = {};

        int[] actualResult = new DeleteNumber().deleteNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }





}
