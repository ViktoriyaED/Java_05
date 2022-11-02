import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveDuplicatesTest {

    /** Task 2 Part 3 Algorithms
     * Напишите метод removeDuplicates(int[] array) , который возвращает массив, в котором удалены
     * повторяющиеся элементы из массива array
     */

    @Test
    public void testRemoveDublicatesHappyPath() {

        int[] array = {0, 6, 1, 2, 2, 6, 3, 0, 4, 2, 4};

        int[] expectedResult = {0, 6, 1, 2, 3, 4};

        int[] actualResult = new RemoveDuplicates().removeDuplicates(array);

        Assert.assertEquals(actualResult, expectedResult);
    }







}
