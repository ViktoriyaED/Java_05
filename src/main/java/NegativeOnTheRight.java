import project_utils.Utils;

public class NegativeOnTheRight {

    /**
     * Task 13
     * Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает массив,
     * в котором все негативные числа находятся во второй половине массива (массив не должен быть отсортирован)
     * Test Data:
     * {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
     */

    public int[] negativeOnTheRight(int[] arr) {
        if (Utils.arrayValidation(arr)) {
            int[] newArr = new int[arr.length];
            int start = 0;
            int end = arr.length - 1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    newArr[start] = arr[i];
                    start++;
                } else {
                    continue;
                }
            }
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] < 0) {
                    newArr[end] = arr[j];
                    end--;
                } else {
                    continue;
                }
            }

            return newArr;
        }
        return new int[0];
    }
}
