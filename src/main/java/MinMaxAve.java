import project_utils.Utils;

public class MinMaxAve {

    /** Task 8 Part 2 Algorithms
     * Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
     * Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
     * и среднее среди всех значений между 2-мя индексами.
     * Test data ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

//    public int[] minMaxAve(int[] array, int index1, int index2) {
//
//        int min = new project_utils.Utils().minOfArray(array, index1, index2);
//        int max = new project_utils.Utils().maxOfArray(array, index1, index2);
//        int average = new project_utils.Utils().averageOfArray(array, index1, index2);
//
//
//
//
//        int[] newArray = new int[3];
////        int[] newArray = {min, max, average};
//        newArray[0] = min;
//        newArray[1] = max;
//        newArray[2] = average;
//
//
//        return newArray;
//    }

    public int[] minMaxAve(int[] array, int index1, int index2) {
        if (index1 < array.length || index2 < array.length) {

            int min = new Utils().minOfArray(array, index1, index2);
            int max = new Utils().maxOfArray(array, index1, index2);
            int average = new Utils().averageOfArray(array, index1, index2);

            int[] newArray = new int[3];
            newArray[0] = min;
            newArray[1] = max;
            newArray[2] = average;

            return newArray;
        } else {

            return new int[0];
        }
    }




}
