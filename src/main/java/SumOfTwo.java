public class SumOfTwo {

    /**
     * Task 14
     * Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,
     * и число n. Алгоритм  возвращает пары элементов, которые в сумме дают число n.
     * Test Data:
     * ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
     */


    public int[][] sumOfTwo(int[] arr, int n) {
        int sumOfTwoArr[][] = new int[arr.length][2];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    sumOfTwoArr[index][0] = arr[i];
                    sumOfTwoArr[index][1] = arr[j];
                    index++;
                }
            }
        }
        int[][] arr2 = new int[index][2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sumOfTwoArr[i];
        }

        return arr2;
    }


    public int[][] sumOfTwoAlgoritm(int[] a, int sum) {
        if (a.length > 0) {

            int[] b = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (sum == (a[i] + a[j])) {
                        count++;
                        a[i] = -2147483648;
                        a[j] = -2147483648;
                    }
                }
            }

            int[][] result = new int[count][2];

            count = 0;
            for (int i = 0; i < b.length; i++) {
                for (int j = i + 1; j < b.length; j++) {
                    if (sum == b[i] + b[j]) {
                        result[count][0] = b[i];
                        result[count][1] = b[j];
                        count++;
                        b[i] = -2147483648;
                        b[j] = -2147483648;
                    }
                }
            }

            return result;
        }

        return new int[][]{};
    }


//    public int[][] sumOfTwo1(int[] arr, int n) {
//        int sumOfTwoArr[][] = new int[arr.length][2];
//        int[] array = new int[2];
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] + arr[j] == n) {
//                    array[0] = arr[i];
//                    array[1] = arr[j];
//                    sumOfTwoArr[index] = array;
//                    index++;
//                }
//            }
//        }
////        int[][] arr2 = new int[index][2];
////        for (int i = 0; i < arr2.length; i++) {
////            arr2[i] = sumOfTwoArr[i];
////        }
////
////        return arr2;
//        return sumOfTwoArr;
//    }


}
