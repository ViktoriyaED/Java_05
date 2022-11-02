import project_utils.Utils;

public class OddEvenValuesInArray {


    /**
     * Task 10
     * Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
     * и возвращает количество четных чисел в этом массиве
     */

    public int countEvenValuesInArray(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }

        return countEven;
    }


    /**
     * Task 11
     * Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,
     * и возвращает количество нечетных чисел в этом массиве
     */

    public int countOddValuesInArray(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOdd++;
            }
        }

        return countOdd;
    }

    /**
     * Task 2 Part 2.1
     * В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
     * который принимает на вход массив целых чисел и возвращает массив int[2],
     * который содержит количество четных и нечетных элементов входящего массива
     */

    public int[] oddEvenElementsInArray(int[] arr) {
        int[] oddEvenElementsInArray = new int[2];
        oddEvenElementsInArray[0] = new OddEvenValuesInArray().countEvenValuesInArray(arr);
        oddEvenElementsInArray[1] = new OddEvenValuesInArray().countOddValuesInArray(arr);

        return oddEvenElementsInArray;

    }

    /** Task 3 Part 2.1 Arrays
     * В классе OddEvenElementsInArray написать метод createOddEvenArray(), который принимает
     * массив целых случайных чисел, и возвращает двумерный массив (массив четных и массив нечетных чисел)
     */

    public int[][] createOddEvenArray(int[] arr) {
        if (Utils.arrayValidation(arr)) {

            return new int[][]{Utils.evenArray(arr), Utils.oddArray(arr)};
        }
        return new int[0][0];
    }


}
