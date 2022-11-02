import project_utils.Utils;

public class DeleteNumber {

    /** Task 1 Part 3 Algorithms
     * Написать метод deleteNumber, который принимает на вход массив целых чисел и число number.
     * Удалите все вхождения числа number из массива (пропусков быть не должно).
     * ({0,1,2,2,3,0,4,2}, 2) -> {0, 1, 3, 0, 4}
     */

    public int[] deleteNumber(int[] arr, int number) {
        if (Utils.arrayValidation(arr)) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != number) {
                    count++;
                }
            }
            int[] deleteNumber = new int[count];
            count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != number) {
                    deleteNumber[count++] = arr[i];
                }
            }
            return deleteNumber;
        }
        return new int[0];
    }

}
