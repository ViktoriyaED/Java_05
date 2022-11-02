import project_utils.Utils;

public class Intersection {

    /** Task 9 Part 2 Algorithms
     * Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
     * и возвращает массив общих элементов.
     * Test Data:
     * {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     * {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     * {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     */

    public int[] intersection(int[] arr1, int[] arr2) {
        if (Utils.arrayValidation(arr1) && Utils.arrayValidation(arr2)) {
            int count = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr2[j] == arr1[i]) {
                        count++;
                    }
                }
            }
            int[] arr3 = new int[count];

            count = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr2[j] == arr1[i]) {
                        arr3[count] = arr2[j];
                        count++;
                    }
                }
            }
            return arr3;
        }

        return new int[0];
    }
}
