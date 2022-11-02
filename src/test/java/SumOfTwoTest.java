import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTwoTest {


    /** Task 14 test
     * Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,
     * и число n. Алгоритм  возвращает пары элементов, которые в сумме дают число n.
     * Test Data:
     * ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
     */

    @Test
    public void testSumOfTwo1() {
        int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};

        int n = 12;

        int[][] expectedResult = {{3, 9}, {7, 5}};

        int[][] actualResult = new SumOfTwo().sumOfTwo(arr, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumOfTwo2(){
        int[] arr = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12, 0};

        int n = 12;

        int[][] expectedResult = new int[][]{{3, 9}, {7, 5}, {12, 0}, {12, 0}};

        int[][] actualResult = new SumOfTwo().sumOfTwo(arr, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumOfTwo3(){
        int[]arr = new int[]{4, 7, 7, 7, 7, 7, 7, 7, 7, 7};

        int n = 11;

        int[][] expectedResult = new int[][]{{4, 7}, {4, 7},{4, 7},{4, 7},{4, 7},{4, 7},{4, 7},{4, 7},{4, 7},};

        int[][] actualResult = new SumOfTwo().sumOfTwo(arr,n);

        Assert.assertEquals(actualResult, expectedResult);
    }

//    public void testSumOfTwo4() {
//
//        int[][] actualResult = new SumOfTwo().sumOfTwo1(arr, n);
//
//    }


}
