import project_utils.Utils;

public class KthLargest {

    /**
     * Task 13
     * 13. Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
     * и возвращает k-тый максимальный элемент.
     * Test Data:
     * ({4, 3, 7, 13, 5, 2, 9, 4, 12}, 3) → 9
     * (13 и 12 - первый и второй самые большие элементы, а метод возвращает 9, как третий самый большой элемент)
     */


    public int kthLargest(int[] arr, int k) {
        if (Utils.arrayValidation(arr)) {
            new Utils().sortArray(arr);
            return arr[arr.length - k];
        }
        return Integer.MAX_VALUE;
    }












}
