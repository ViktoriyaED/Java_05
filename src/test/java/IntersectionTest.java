import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {

    // на вход 2 массива целых чисел
    // возвращает массив общих элементов
    // {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}

    // 1. Positive test Happy path

    @Test
    public void testIntersectionHappyPath() {
       int[] arr1 = {1, 2, 4, 5, 89};
       int[] arr2 = {8, 9, 4, 2};

       int[] expectedResult =  {2, 4};

       int[] actualResult = new Intersection().intersection(arr1, arr2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersectionHappyPath1() {
        int[] arr1 = {1, 2, 4, 5, 8, 9};
        int[] arr2 = {8, 9, -4, -2};

        int[] expectedResult =  {8, 9};

        int[] actualResult = new Intersection().intersection(arr1, arr2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersectionHappyPath2() {
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 45};

        int[] expectedResult =  {};

        int[] actualResult = new Intersection().intersection(arr1, arr2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersectionHappyPath3() {
        int[] arr1 = {};
        int[] arr2 = {8, 9, 45};

        int[] expectedResult =  {};

        int[] actualResult = new Intersection().intersection(arr1, arr2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersectionNegative() {
        int[] arr1 = {};
        int[] arr2 = {};

        int[] expectedResult =  {};

        int[] actualResult = new Intersection().intersection(arr1, arr2);

        Assert.assertEquals(actualResult, expectedResult);
    }





}
