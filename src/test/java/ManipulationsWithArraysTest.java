import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {


    /** Task 5
     * Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
     * Метод возвращает массив тех же чисел, умноженных на number
     * Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
     */

    @Test
    public void testMultiplуArrayByNumber() {

        int array[] = {1, 2, 3, 4, 5};

        int number = 3;

        int[] expectedResult = {3, 6, 9, 12, 15};

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplуArrayByNumber1() {

        int array[] = {1, 2, 3, 4, 5};

        int number = -3;

        int[] expectedResult = {-3, -6, -9, -12, -15};

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplуArrayByNumber2() {

        int array[] = {1, 2, 3, 4, 5};

        int number = 0;

        int[] expectedResult = {0, 0, 0, 0, 0};

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Ignore
    @Test
    public void testMultiplyArrayByNumber3() {

        int array[] = null;

        int number = 2;

        int[] expectedResult = null;

        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /** Task 6
     * Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
     * и возвращает массив типа double[] из тех же чисел
     * Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
     */

    @Test
    public void toDoubleArray() {
         int[] array = {1, 2, 3, 4, 5};

         double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

         double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

         Assert.assertEquals(actualResult, expectedResult);
    }


    /** Task 7
     * Написать метод toIntArray(), который принимает на вход массив типа double[],
     * и возвращает массив типа int[] из тех же чисел
     * Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
     */

    @Test
    public void toIntArray() {
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};

        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);

    }



    /** Task 8
     * Написать метод toStringArray(), который принимает на вход массив целых чисел,
     * и возвращает массив типа String[] из тех же чисел (без метода .toString())
     * Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
     */

    @Test
    public void testToString() {
        int[] array = {1, 2, 3, 4, 5};

        String[] expectedResult = {"1", "2", "3", "4", "5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /** Task 9
     * Перегрузить метод toStringArray() параметром double[]. Этот метод должен возвращать массив типа String[]
     * Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
     */

    @Test
    public void testToString1() {
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};

        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }



    /** Task 12
     * В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
     * который принимает на вход массив целых чисел и число number. Метод возвращает значение true,
     * если все элементы массива больше number, иначе возвращает false
     */

    @Test
    public void testAreValuesGreaterThanNumber() {

        int [] array = {6, 7, 8, 9, 10};
        int number = 4;

        boolean expectedResult = true;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testAreValuesGreaterThanNumber1() {

        int [] array = {6, 7, 8, 9, 10};
        int number = 8;

        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber2() {

        int [] array = {6, 7, 8, 9, 10};
        int number = 11;

        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber3() {

        int [] array = {-6, -7, -8, -9, -10};
        int number = -11;

        boolean expectedResult = true;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber4() {

        int [] array = {-6, -7, -8, -9, -10};
        int number = -5;

        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /** Task 4 Part 2.1 Arrays
     * В классе ManipulationsWithArrays написать метод getTheGreaterHalf(), который принимает массив целых чисел,
     * и возвращает  массив из суммарно бОльшей первой или второй половины входящего массива
     */

    @Test
    public void testGetTheGreaterHalf() {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] expectedResult = {5, 6, 7, 8};

        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf1() {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] expectedResult = {6, 7, 8, 9};

        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf2() {      // equal parts

        int arr[] = {1, 9, 3, 7, 4, 6, 2, 8};

        int[] expectedResult = {4, 6, 2, 8};

        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf3() {

        int arr[] = {10, 2, 13, 4, 5, 6, 7, 8, 3};

        int[] expectedResult = {10, 2, 13, 4};

        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }







    }
