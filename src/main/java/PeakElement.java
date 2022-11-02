import project_utils.Utils;

public class PeakElement {

    /**
     * 10.	Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и
     * возвращает значения пиковых элементов (элементы, которые больше своих соседей).
     * Test Data:
     * {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */

    public String[] peakElement(int[] array) {
        if (Utils.arrayValidation(array) && array.length > 1) {
            String stringPeakElement = "";
            if (array[0] >= array[1]) {
                stringPeakElement += array[0] + " ";
            }
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    stringPeakElement += array[i] + " ";
                }
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                stringPeakElement += array[array.length - 1];
            }
            return stringPeakElement.split(" ");
        }
        return new String[]{};
    }

//    public int[] peakElement1(int[] array) {
//        int count = 0;
//        if (array[0] > array[1]) {
//            count++;
//        }
//        if (array[array.length - 1] > array[array.length - 2]) {
//            count++;
//        }
//        for (int i = 1; i < array.length - 1; i++) {
//            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
//                count++;
//            }
//        }
//        int[] arr = new int[count];
//
//        return arr;
//    }


}
/**
 * public class BubbleSorter {
 * public static void sort(int[] array) {
 * // i - номер прохода
 * for (int i = 0; i < array.length - 1; i++) {
 * // внутренний цикл прохода
 * for (int j = array.length - 1; j > i; j--) {
 * if (array[j - 1] > array[j]) {
 * int tmp = array[j - 1];
 * array[j - 1] = array[j];
 * array[j] = tmp;
 * }
 * }
 * }
 * }
 * }
 */