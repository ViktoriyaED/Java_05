import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {


    /** Task 10
     * Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
     * и возвращает количество четных чисел в этом массиве
     */

    @Test
    public void testCountEvenValuesInArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int expectedResult = 4;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountEvenValuesInArray1() {
        int[] array = {-1, -2, -3, -4, -5, -6, -7, -8};

        int expectedResult = 4;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCountEvenValuesInArray3() {
        int[] array = {-1, 1, -3, 3, 5, 5, -7, 7};

        int expectedResult = 0;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /** Task 11
     * Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,
     * и возвращает количество нечетных чисел в этом массиве
     */


    @Test
    public void testCountOddValuesInArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int expectedResult = 4;

        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCountOddValuesInArray1() {
        int[] array = {0, 2, 0, 4, 0, 6, 0, 8};

        int expectedResult = 0;

        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /** Task 2 Part 2.1
     * В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
     * который принимает на вход массив целых чисел и возвращает массив int[2],
     * который содержит количество четных и нечетных элементов входящего массива
     */

//    @Ignore
    @Test
    public void testOddEvenElementsInArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] expectedResult = {4, 4};

        int[] actualResult = new OddEvenValuesInArray().oddEvenElementsInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /** Task 3 Part 2.1 Arrays
     * В классе OddEvenElementsInArray написать метод createOddEvenArray(), который принимает
     * массив целых случайных чисел, и возвращает двумерный массив (массив четных и массив нечетных чисел)
     */

    @Test
    public void testCreateOddEvenArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int[][] expectedResult = {{2, 4, 6, 8},{1, 3, 5, 7}};

        int[][] actualResult = new OddEvenValuesInArray().createOddEvenArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }












}
