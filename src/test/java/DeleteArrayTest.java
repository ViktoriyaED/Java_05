import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteArrayTest {

    /**
     * Task 1 Part 3 Algorithms
     * Написать метод deleteNumber, который принимает на вход массив целых чисел и число number.
     * Удалите все вхождения числа number из массива (пропусков быть не должно).
     * ({0,1,2,2,3,0,4,2}, 2) -> {0, 1, 3, 0, 4}
     */

    @Test
    public void testDeleteNumber() {

        int[] arr = {0,1,2,2,3,0,4,2};
        int number = 2;

        int[] expectedResult = {0, 1, 3, 0, 4};

        int[] actualResult = new DeleteNumber().deleteNumber(arr, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
