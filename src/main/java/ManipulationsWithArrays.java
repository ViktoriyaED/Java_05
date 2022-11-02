import project_utils.Utils;

public class ManipulationsWithArrays {


    /**
     * Task 5
     * Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
     * Метод возвращает массив тех же чисел, умноженных на number
     * Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
     */

    public int[] multiplуArrayByNumber(int[] array, int number) {
        if (array == null) {
            return new int[0];
        }
        int[] multiplyArrayByNumber = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            multiplyArrayByNumber[i] = array[i] * number;
        }
        return multiplyArrayByNumber;
    }


    /**
     * Task 6
     * Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
     * и возвращает массив типа double[] из тех же чисел
     * Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
     */

    public double[] toDoubleArray(int[] array) {
        double[] toDoubleArray = new double[array.length];
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                toDoubleArray[i] = array[i];
            }
            return new double[0];
        }

        return toDoubleArray;
    }

    /**
     * Task 7
     * Написать метод toIntArray(), который принимает на вход массив типа double[],
     * и возвращает массив типа int[] из тех же чисел
     * Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
     */

    public int[] toIntArray(double[] array) {
        int[] toIntArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            toIntArray[i] = (int) array[i];
        }
        return toIntArray;

    }


    /**
     * Task 8
     * Написать метод toStringArray(), который принимает на вход массив целых чисел,
     * и возвращает массив типа String[] из тех же чисел (без метода .toString())
     * Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
     */


    public String[] toStringArray(int[] array) {
        String[] arrOfStrings = new String[array.length];
        if (Utils.arrayValidation(array) == false) {
            return new String[0];
        } else {
            for (int i = 0; i < array.length; i++) {
//            arrOfStrings[i] = String.valueOf(array[i]);
                arrOfStrings[i] = "" + array[i];
            }
            return arrOfStrings;

        }
    }

    /**
     * Task 9
     * Перегрузить метод toStringArray() параметром double[]. Этот метод должен возвращать массив типа String[]
     * Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
     */

    public String[] toStringArray(double[] array) {
        String[] arrOfStrings = new String[array.length];
        if (array.length == 0) {
            return new String[0];
        } else {
//        int index = 0;
            for (int i = 0; i < array.length; i++) {

//            arrOfStrings[i] = String.valueOf(array[i]);
                arrOfStrings[i] = "" + array[i];
//            index++;
            }

            return arrOfStrings;
        }
    }


    /**
     * Task 12
     * В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
     * который принимает на вход массив целых чисел и число number. Метод возвращает значение true,
     * если все элементы массива больше number, иначе возвращает false
     */


    public boolean areValuesGreaterThanNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    /** Task 4 Part 2.1 Arrays
     * В классе ManipulationsWithArrays написать метод getTheGreaterHalf(), который принимает массив целых чисел,
     * и возвращает  массив из суммарно бОльшей первой или второй половины входящего массива
     */

    public int[] getTheGreaterHalf(int[] arr) {
        if (Utils.arrayValidation(arr)) {
                int newLength = arr.length / 2;
                int leftCount = 0;
                int rightCount = 0;

                for (int i = 0, j = arr.length - 1; i < newLength; i++, j--) {      // подсчитали суммы правой и левой частей
                    leftCount += arr[i];
                    rightCount += arr[j];
                }
//                for (int i = 0; i < newLength; i++) {
//                    leftCount += arr[i];
//                }
//                for (int j = arr.length - 1; j >= newLength; j--) {
//                    rightCount += arr[j];
//                }
                int[] getTheGreaterHalf = new int[newLength];
                if (leftCount > rightCount) {

                    for (int i = 0; i < newLength; i++) {
                        getTheGreaterHalf[i] = arr[i];
                    }
                    return getTheGreaterHalf;
                } else {
                    if (arr.length % 2 == 0) {      // случай четной и нечетной длины
                        for (int i = newLength; i < arr.length; i++) {
                            getTheGreaterHalf[i - newLength] = arr[i];
                        }
                        return getTheGreaterHalf;
                    } else {
                        for (int i = newLength + 1; i < arr.length; i++) {
                            getTheGreaterHalf[i - newLength - 1] = arr[i];
                        }
                        return getTheGreaterHalf;
                    }
                }
        }
        return new int[0];
    }


}
