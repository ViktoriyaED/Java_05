import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndexesTest {


    /** Task 2
     *  Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных индексов
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */


    @Test
    public void TestOddIndexes() {
        int[] array = {-45, 590, 234, 985, 12, 68};

        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndexes().oddIndexes(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void TestOddIndexes1() {
        int[] array = {5, 50, 24, 95, 1, 6, 45, 2, 0, 96};

        int[] expectedResult = {50, 95, 6, 2, 96};

        int[] actualResult = new OddIndexes().oddIndexes(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestOddIndexesLengthofArray1() {
        int[] array = {5};

        int[] expectedResult = {};

        int[] actualResult = new OddIndexes().oddIndexes(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestOddIndexesLengthofArray2() {
        int[] array = null;

        int[] expectedResult = {};

        int[] actualResult = new OddIndexes().oddIndexes(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

}


