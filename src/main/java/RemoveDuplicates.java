import project_utils.Utils;

public class RemoveDuplicates {

    /**
     * Task 2 Part 3 Algorithms
     * Напишите метод removeDuplicates(int[] array) , который возвращает массив, в котором удалены
     * повторяющиеся элементы из массива array
     */

    public int[] removeDuplicates(int[] array) {                    // {0,1,2,2,3,0,4,2,4}
                                                                    // [0, 1, 2, 3, 4, 6]
        Utils.sortArray(array);
        int ii = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] != array[i - 1]) {
                count++;
            }
        }
        int[] removeDuplicatesArray = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] != array[i - 1]) {
                removeDuplicatesArray[ii++] = array[i];
            }
        }
        return removeDuplicatesArray;
    }

//    public int[] removeDuplicates1(int[] array) {                    // {0,1,2,2,3,0,4,2,4}
//
//        project_utils.Utils.sortArray(array);
//        int ii = 0;
//        int count = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (i == 0 || array[i] != array[i - 1]) {
//                count++;
//            }
//        }
//        System.out.println(count);
//
//        int[] removeDuplicatesArray = new int[count];
//        for (int i = 0; i < array.length; i++) {
//            if (i == 0 || array[i] != array[i - 1]) {
//                removeDuplicatesArray[ii++] = array[i];
//            }
//        }
//count = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < removeDuplicatesArray.length; j++) {
//                if (array[i] == array[j] && count <= 1) {
//                    count++;
//                    removeDuplicatesArray[j] = array[i];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(removeDuplicatesArray));
//        return removeDuplicatesArray;
//
//    }
//
//
}
