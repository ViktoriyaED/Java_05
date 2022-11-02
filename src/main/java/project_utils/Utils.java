package project_utils;

import java.util.Arrays;

public class Utils {


    // Метод по созданию массива заданной длины из случайных чисел
    public static int[] generateRandomArray(int length, int min, int max) {
        int[] randomArray = new int[length];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) ((Math.random() * (max - min + 1)) + min);
        }
        System.out.println(Arrays.toString(randomArray));
        return randomArray;
    }

    // Метод нахождения среднего значения массива
    public int averageOfArray(int[] array, int index1, int index2) {
        if (index1 != index2) {
            if (index1 < index2) {
                int sum = 0;
                for (int i = index1; i <= index2; i++) {
                    sum = sum + array[i];
                }

                return sum / (index2 - index1 + 1);

            } else if (index1 > index2) {
                int sum = 0;
                for (int i = index1; i >= index2; i--) {
                    sum = sum + array[i];
                }

                return sum / (index1 - index2 + 1);
            }

        } else {
            int sum = 0;
//            for (int i = index1; i <= index2; i++) {
//                sum = sum + array[i];
//            }

            return sum / 1;
        }
        return 0;
    }


    public int minOfArray(int[] array, int index1, int index2) {
        if (index1 < array.length || index2 < array.length) {
            if (index1 < index2) {
                int min = Integer.MAX_VALUE;
                for (int i = index1; i <= index2; i++) {
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
                return min;
            } else {
                int min = Integer.MAX_VALUE;
                for (int i = index1; i >= index2; i--) {
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
                return min;
            }
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public int maxOfArray(int[] array, int index1, int index2) {
        if (index1 < array.length || index2 < array.length) {
            if (index1 < index2) {
                int max = Integer.MIN_VALUE;
                for (int i = index1; i <= index2; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                }
                return max;
            } else {
                int max = Integer.MIN_VALUE;
                for (int i = index1; i >= index1; i--) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                }
                return max;
            }
        } else {
            return Integer.MIN_VALUE;
        }
    }


    // универсальный метод создания двумерного массива случайных чисел
    public static void random2DArray(int indexA, int indexB, int start, int end) {
        int[][] randomArrays = new int[indexA][indexB];
        int range = (end + 1 - start);

        for (int i = 0; i <= indexA - 1; i++) {
            for (int j = 0; j <= indexB - 1; j++) {

                randomArrays[i][j] = (int) (Math.random() * range) + start;
            }
        }
        for (int i = 0; i <= indexA - 1; i++) {
            System.out.println(Arrays.toString(randomArrays[i]));
        }
    }


    // метод по нахождению кол-ва нечетных чисел в массиве
    public int countOddArrayLength(int[] array) {
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOdd++;
            }
        }

        return countOdd;
    }

    // метод по нахождению кол-ва четных чисел в массиве
    public static int countEvenArrayLength(int[] array) {
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }

        return countEven;
    }

//    public int countOddIndexArrayLength(int[] array) {
//        int countOdd = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0) {
//                countOdd++;
//            }
//        }
//
//        return countOdd;
//    }

    // метод по созданию массива из четных чисел
    public static int[] evenArray(int[] arr) {
        int[] evenArray = new int[countEvenArrayLength(arr)];
        int evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[evenIndex] = arr[i];
                evenIndex++;
            }
        }
        return evenArray;
    }


    // метод по созданию массива из нечетных чисел
    public static int[] oddArray(int[] arr) {
        int[] oddArray = new int[countEvenArrayLength(arr)];
        int oddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArray[oddIndex] = arr[i];
                oddIndex++;
            }
        }
        return oddArray;
    }

    // алгоритм сортировки пузырьком
    public static int[] sortArray(int[] array) {
        // номер прохода
        for (int i = 0; i < array.length; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }


//    public static int[] bubbleSort(int[] arr) {
//
//        // int[] arr = {64, 42, 68, 41, 32, 53, 16, 24, 57, 48, 74, 55, 36};
//
//        boolean isSorted = false;
//        while(!isSorted) {
//        isSorted = true;
//
//        for (int i = 1; i < arr.length; i ++) {
//            if (arr[i - 1] > arr[i]) {
//                int temp = arr[i];
//                arr[i] = arr[i - 1];
//                arr[i - 1] = temp;
//                isSorted = false;
//            }
//        }
//        return arr;
//    }

    // метод проверить если массив пустой

    public static boolean arrayValidation(int[] array) {
        if (array != null && array.length != 0) {
            return true;
        }
        return false;
    }


    // метод проверить если строка пустая
//    public static boolean stringValidation(String text) {
//
//        if (text != null && text.length() > 0) {
//            return true;
//        }
//        return false;
//    }

    // метод проверить если строка пустая
    public static boolean stringValidation(String text) {

        if (text != null) {

            return !text.trim().isEmpty();
        }

        return false;
    }

    // Reverse Array
    public static int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = array[i];
        }
        return reverseArray;
    }


}
