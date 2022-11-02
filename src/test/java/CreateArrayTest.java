import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    /** метод createIntArray()
     * createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     */

    @Test
    public void testCreateIntArray() {
        int  n1 = 1;
        int  n2 = 2;
        int  n3 = 3;
        int  n4 = 4;
        int  n5 = 5;

        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new CreateArray().createIntArray(n1, n2, n3, n4, n5);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /** Task 2
     * метод createDoubleArray()
     * на вход 5 чисел типа double, и возвращает массив из этих же чисел
     * Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     */

    @Test
    public void testCreateDoubleArray() {
        double  n1 = 1.1;
        double  n2 = 2.5;
        double  n3 = 3.7;
        double  n4 = 4.0;
        double  n5 = 5.5;

        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

        double[] actualResult = new CreateArray().createDoubleArray(n1, n2, n3, n4, n5);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /** Task 3
     * метод createStringArray()
     * @param array 5 слов
     * @return массив из этих слов
     * Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    @Test
    public void testCreateStringArray() {
        String word1 = "It";
        String word2 = "was";
        String word3 = "an";
        String word4 = "apple";
        String word5 = "pie";

        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        String[] actualResult = new CreateArray().createStringArray(word1, word2, word3, word4, word5);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /** Task 1 Part 2.1
     * В классе CreateArray написать метод createIntArrayFromText(), который принимает на вход строку чисел
     * (н-р, “3 4 1 8 10 12.3”) и возвращает массив типа int[] из этих чисел. (можно использовать split() или toCharArray())
     */

    @Test
    public void testCreateIntArrayFromText() {

        String sentence = "3 4 1 8 10 12.3";

        int[] expectedResult = {3, 4, 1, 8, 10, 12};

        int[] actualResult = new CreateArray().createIntArrayFromText(sentence);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArrayFromText1() {

        String sentence = "3 4 1 8 10 12";

        int[] expectedResult = {3, 4, 1, 8, 10, 12};

        int[] actualResult = new CreateArray().createIntArrayFromText(sentence);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /** Task 5 Part 2.1 Arrays
     * В классе CreateArray написать метод multiplesOf(), который принимает на вход целое положительные число number
     * в пределах от 1 включительно до 10 включительно, и возвращает таблицу умножения на это число в виде массива
     * Например, multiplesOf(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
     */

    @Test
    public void testmultiplesOf() {

        int number = 2;

        int[] expectedResult = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int[] actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testmultiplesOf1() {

        int number = 10;

        int[] expectedResult = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int[] actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testmultiplesOfNegative1() {

        int number = 0;

        int[] expectedResult = {};

        int[] actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testmultiplesOfNegative2() {

        int number = -2;

        int[] expectedResult = {};

        int[] actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /** Task 2 Part 3 Arrays
     * В классе CreateArray написать метод createUniqueArray(), который принимает массив целых положительных чисел
     * больше 0, и возвращает массив уникальных чисел.
     * Например, createUniqueArray({1, 2, 1, 5, 23, 90, 3, 43, 23, 1}) -> {1, 2, 5, 23, 90, 3, 43}
     */

    @Test
    public void createUniqueArray() {

        String sentence = "3 4 1 8 10 12.3";

        int[] expectedResult = {3, 4, 1, 8, 10, 12};

        int[] actualResult = new CreateArray().createIntArrayFromText(sentence);

        Assert.assertEquals(actualResult, expectedResult);


    }
























}
