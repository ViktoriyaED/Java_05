public class IsPositiveNumber {

    /** Task 5
     * Напишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр больше или равен нулю,
     * и возвращает false, если параметр меньше 0.
     * Проверьте работу метода на числах 555, 0 и -555.
     */


//    public boolean isPositiveNumber(int number) {
//        boolean isPositiveNumber = true;
//        if (number >= 0) {
//            return isPositiveNumber;
//        } else {
//            return !isPositiveNumber;
//        }
//    }
//
//    public boolean isPositiveNumber(double number) {
//        boolean isPositiveNumber = true;
//        if (number >= 0) {
//            return isPositiveNumber;
//        } else {
//            return !isPositiveNumber;
//        }
//    }

    public boolean isPositiveNumber(int number) {
        boolean isPositiveNumber = true;
        return (number >= 0) ? isPositiveNumber : !isPositiveNumber;
    }

    public boolean isPositiveNumber(double number) {
        boolean isPositiveNumber = true;
        return (number >= 0) ? isPositiveNumber : !isPositiveNumber;
    }


}
