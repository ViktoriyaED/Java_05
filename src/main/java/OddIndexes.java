import project_utils.Utils;

/** Task 2
 *  Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных индексов
 * Input = {-45, 590, 234, 985, 12, 68}
 * Expected Result =  {590, 985, 68}
 */

public class OddIndexes {
    public int[] oddIndexes(int[] array) {
        if (Utils.arrayValidation(array)) {
            int[] oddIndexesArray = new int[array.length / 2];

            int oddIndex = 0;
            for (int i = 1; i < array.length; i += 2) {
                oddIndexesArray[oddIndex] = array[i];
                oddIndex++;
            }
            return oddIndexesArray;
        }
        return new int[]{};
    }


}







