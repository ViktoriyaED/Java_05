import project_utils.Utils;

import java.util.Arrays;

public class CreateArray {

    /**
     * Task 1
     * метод createIntArray(), который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
     * Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     */

    public int[] createIntArray(int n1, int n2, int n3, int n4, int n5) {
//        int[] intArray = new int[5];
//        intArray[0] = n1;
//        intArray[1] = n2;
//        intArray[2] = n3;
//        intArray[3] = n4;
//        intArray[4] = n5;
//
//        return intArray;

        return new int[]{n1, n2, n3, n4, n5};
    }

    /**
     * Task 2
     * Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double,
     * и возвращает массив из этих же чисел
     * Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     */

    public double[] createDoubleArray(double n1, double n2, double n3, double n4, double n5) {
//        double[] doubleArray = new double[5];
//        doubleArray[0] = n1;
//        doubleArray[1] = n2;
//        doubleArray[2] = n3;
//        doubleArray[3] = n4;
//        doubleArray[4] = n5;
//
//        return doubleArray;

        return new double[]{n1, n2, n3, n4, n5};
    }

    /**
     * Task 3
     * Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
     * Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    public String[] createStringArray(String word1, String word2, String word3, String word4, String word5) {


//        String stringArray[] = new String[5];
//        stringArray[0] = word1;
//        stringArray[1] = word2;
//        stringArray[2] = word3;
//        stringArray[3] = word4;
//        stringArray[4] = word5;
//
//        return stringArray;

        return new String[]{word1, word2, word3, word4, word5};
    }

    /**
     * Task 4
     * Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов
     * и возвращает массив из этих слов.
     * Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    public static String[] createArrayFromText(String sentence) {

        return sentence.split(" ");

    }


    /**
     * Task 1 Part 2.1
     * В классе CreateArray написать метод createIntArrayFromText(), который принимает на вход строку чисел
     * (н-р, “3 4 1 8 10 12.3”) и возвращает массив типа int[] из этих чисел. (можно использовать split() или toCharArray())
     */

    public int[] createIntArrayFromText(String sentence) {      // "3 4 1 8 10 12.3"
        if (sentence == null || sentence.equals(" ")) {
            return new int[0];
        }
        String[] str = sentence.split(" ");               // {"3", "4", "1", "8", "10", "12.3"}
        int l = sentence.split(" ").length;
        int[] createIntArrayFromText = new int[l];

        for (int i = 0; i < l; i++) {
            createIntArrayFromText[i] = (int) Double.parseDouble(str[i]);   // {3, 4, 1, 8, 10, 12}
        }

        return createIntArrayFromText;
    }


    /**
     * Task 5 Part 2.1 Arrays
     * В классе CreateArray написать метод multiplesOf(), который принимает на вход целое положительные число number
     * в пределах от 1 включительно до 10 включительно, и возвращает таблицу умножения на это число в виде массива
     * Например, multiplesOf(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
     */

    public int[] multiplesOf(int number) {
        if (number > 0 && number <= 10) {
            int[] multiplesOf = new int[11];
            int multi = 0;
            for (int i = 0; i < 11; i++) {
                multiplesOf[i] = number * i;
            }
            return multiplesOf;
        }
        return new int[0];
    }


    /** Task 2 Part 3 Arrays
     * В классе CreateArray написать метод createUniqueArray(), который принимает массив целых положительных чисел
     * больше 0, и возвращает массив уникальных чисел.
     * Например, createUniqueArray({1, 2, 1, 5, 23, 90, 3, 43, 23, 1}) -> {1, 2, 5, 23, 90, 3, 43}
     */

    public static int[] createUniqueArray(int[] arr) {
        if (Utils.arrayValidation(arr)) {
          int[] sortArray = Utils.sortArray(arr);

            int count = 0;

            for (int i = 0; i < sortArray.length; i++) {
                if (i == 0 || sortArray[i] != sortArray[i - 1]) {
                    count++;
                }
            }

            int[] uniqueArray = new int[count];

            count = 0;

            for (int i = 0; i < sortArray.length; i++) {
                if (i == 0 || sortArray[i] != sortArray[i - 1]) {
                    uniqueArray[count++] = sortArray[i];
                }
            }
            return uniqueArray;
        }
        return new int[0];
    }



    public static void main(String[] args) {
       int[] arr = {1, 2, 1, 5, 23, 90, 3, 43, 23, 1} ;
        System.out.println(Arrays.toString(createUniqueArray(arr)));
    }


}
