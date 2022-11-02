import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PeakElementTest {

    /**
     * 10.	Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает значения
     * пиковых элементов (элементы, которые больше своих соседей).
     * Test Data:
     * {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */

    // 1. Positive test Happy path

    @Test
    public void testPeakElementHappyPath() {
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};

        String[] expectedResult = {"3", "7", "23"};

        String[] actualResult = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPeakElementHappyPath1() {
        int[] array = {3, 2, 7, 5, 10, 9, 23, 25};

        String[] expectedResult = {"3", "7", "10", "25"};

        String[] actualResult = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPeakElementNegative() {
        int[] array = {3};

        String[] expectedResult = {};

        String[] actualResult = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPeakElementNegative1() {
        int[] array = {};

        String[] expectedResult = {};

        String[] actualResult = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Ignore
    @Test
    public void testPeakElementNegative3() {
        int[] array = null;

        String[] expectedResult = {};

        String[] actualResult = new PeakElement().peakElement(array);

        Assert.assertEquals(actualResult, expectedResult);
    }




}
