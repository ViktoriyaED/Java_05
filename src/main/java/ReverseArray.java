import project_utils.Utils;

public class ReverseArray {

    /** Task 11
     * Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
     * Test Data:
     * {2, 7, 3, 10} → {10, 3, 7, 2}
     */

    public int[] reverseArray(int[] array) {
        if (Utils.arrayValidation(array)) {
            int[] reverseArray = new int[array.length];
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                reverseArray[j] = array[i];
            }
            return reverseArray;
        }
        return new int[0];
    }


}
