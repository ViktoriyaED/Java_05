import project_utils.Utils;

import static project_utils.Utils.stringValidation;


public class StringMethods {

    /**
     * Task 1
     * Написать метод removeSpaces(), который принимает на вход строку.
     * Если строка не пустая, то примените метод по удалению пробелов в начале и в конце строки.
     * Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
     * <p>
     * Test Data:
     * “    Red Rover School   “ → “Лишние пробелы удалены”
     * “Red Rover School“ → “Пробелов не было”
     * “” → “Строка пустая”
     */

    public String removeSpaces(String text) {
        if (text.isEmpty() == false) {
            if (text.charAt(0) == ' ' || text.charAt(text.length() - 1) == ' ') {
                text.trim();
                return "Лишние пробелы удалены";
            } else {
                return "Пробелов не было";
            }
        } else {
            return "Строка пустая";
        }
    }


    /**
     * Task 2
     * Написать алгоритм removeAllAs(), который принимает на вход строку. Если строка валидная, то метод удаляет
     * все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    Red Rover School   “ →  “Red Rover School“
     * “panda   “ → “pnd”
     * “taramasalata” → “trmslt”
     */
    // далить все буквы а из слова
    public String removeAllAs(String text) {
        if (stringValidation(text)) {
//            if (text.charAt(0) == ' ' || text.charAt(text.length() - 1) == ' ') {
            return text.trim().replace("a", "");
//            }
//            return text.replace("a", "");
        }
        return "";
    }


    /**
     * Task 3
     * Написать алгоритм removeAllZeros(), который принимает на вход строку, состоящую из цифр.
     * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
     * Метод возвращает обработанную строку, в которой нет нулей.
     * Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
     * Test Data:
     * “3504209706040000 “ →  “35429764“
     * “0000000111“ → “111”
     */
    //
    public String removeAllZeros(String text) {
        if (stringValidation(text)) {
            if (text.contains("0")) {
                return text.trim().replace("0", "");
            }
            return "This is a valid string";
        }
        return "";
    }


    /**
     * Task 4
     * Написать алгоритм removeAllSpaces, который принимает на вход строку. Если строка валидная, то метод удаляет
     * все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     * “p a     n   d a   “ → “panda”
     */

    public String removeAllSpaces(String text) {
        if (stringValidation(text)) {

            return text.trim().replace(" ", "");
        }

        return "";
    }


    /**
     * Task 5
     * Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится в строке.
     * Метод возвращает количество букв a/A,  и количество букв/знаков в слове без букв a/A.
     * Итоговый результат должен строится с помощью метода из видео 2.
     * Test Data:
     * “Abracadabra” → “5, 6”
     * “Homenum Revelio” → “0, 15”
     * “3 tarAmasAlatA” → “6, 8”
     */

    public String countAs(String text) {
        if (stringValidation(text)) {
            int count = 0;
//            String lowerText = text.trim().toLowerCase().replace("a", "").length();
            String lowerText = text.trim().toLowerCase();
            for (int i = 0; i < text.length(); i++) {
                if (lowerText.charAt(i) == 'a') {
                    count++;
                }
            }
            int countWithoutAs = text.length() - count;

            return Integer.toString(count).concat(", ").concat(Integer.toString(countWithoutAs));
        }

        return "";
    }


    /**
     * Task 6
     * Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте хотя бы
     * одно слово Java.
     * Test Data:
     * “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support
     * (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS
     * in January 2019 for commercial use, although it will otherwise still support Java 8 with public updates
     * for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11
     * that are still receiving security and other upgrades.” → true
     * <p>
     * “99 little bugs in a code.
     * 99 little bugs in a code.
     * Take one down, and patch it around.
     * 235 critical bugs in the code.” → false
     */


    public String countJava(String text) {
        if (stringValidation(text)) {
            if (text.contains("Java")) {

                return "true";
            }

            return "false";
        }
        return "";
    }


    /**
     * Task 7
     * Напишите метод insertQuotes(), который принимает слово и возвращает строку,
     * в которой это слово “обернуто” в кавычки:
     * Test Data: “Abracadabra” →  ““Abracadabra””
     */

    public String insertQuotes(String text) {
        if (stringValidation(text)) {
            String element = "\"";
            return element.concat(text).concat(element);
//            return element + text + element;
        }
        return "";
    }


    /**
     * Task 8
     * Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :  после слова “писал”,
     * и оборачивает в кавычки вторую строку
     * (результат строится с помощью метода concat())
     * <p>
     * Test Data:
     * “Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
     * “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
     * Задание со звездочкой:
     * “Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
     * "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
     */

    public String insertQuotes1(String text1, String text2) {
        if (stringValidation(text1) && stringValidation(text2)) {
            if (text1.contains("писал") || text2.contains("писал")) {
                return text1.concat("\"").concat(":").concat(text2).concat("\"");
            }
//            String element = "\"";
//            String element1 = ": ";

//            return text1.concat(element1).concat(element).concat(text2).concat(element);
        }
        return "";
    }


    /**
     * Task 9
     * Напишите метод, который принимает на вход название города и исправляет написание:
     * Test Data:
     * “ташкент” → “Ташкент”
     * “ЧикаГО” → “Чикаго”
     */

    public String fixCityName(String city) {
        if (stringValidation(city)) {
            String newCity = city.toLowerCase();

            return city.substring(0, 1).toUpperCase() + newCity.substring(1);
        }

        return "";
    }


    /**
     * Task 10
     * Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все, что находится
     * между первой и последней буквой-параметром:
     * Test Data:
     * “Abracadabra”, “b” → “bracadab”
     * “Whippersnapper”, “p” → “ppersnapp”
     */
// && (int)letter >= 1040 && (int) letter <= 1103 русский алфавит
    // && (int)letter >= 65 && (int) letter <= 90 английский мал алфавит
    // && (int)letter >= 97 && (int) letter <= 122 английский бол алфавит
    // валидация буквы (не было символов, при отсутствии буквы вывод, пустое значение, одинаковый язык
    public String findStringBetweenTwoIndexes(String text, char letter) {
        if (stringValidation(text) && (int) letter >= 1040 && (int) letter <= 1103
                || (int) letter >= 65 && (int) letter <= 90 || (int) letter >= 97 && (int) letter <= 122) {

            return text.trim().substring(text.indexOf(letter), text.lastIndexOf(letter) + 1);
        }
        return "";
    }


    /**
     * Task 11
     * Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и заканчивается
     * на одинаковую букву, и false иначе
     * Test Data:
     * “Abracadabra” → true
     * “Whippersnapper” → false
     */

    public String sameLetter(String text) {
        if (stringValidation(text)) {
            String newText = text.toLowerCase();
//            if (newText.charAt(0) == newText.charAt(text.length() - 1)) {
            if (newText.indexOf(newText.charAt(text.length() - 1)) == 0) {
                return "true";
            }
            return "false";
        }
        return "";
    }

//    public boolean sameLetter(String text) {
//        if (text != null && !text.trim().isEmpty() && !text.trim().contains(" ")) {
//            String newText = text.trim().toLowerCase();
//                return newText.lastIndexOf(newText.charAt(0)) == (newText.length() - 1);
//            }
//            return false;
//
//    }


    /**
     * Task 12
     * Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом,
     * и возвращает последнее слово
     * Test Data:
     * “Red Rover” → “Rover”
     */

    public String returnLastWord(String text) {
        if (stringValidation(text)) {
            return text.substring(text.indexOf(' ') + 1);
        }
        return "";
    }


    /**
     * Task 13
     * Написать метод, который принимает строку, и 2 индекса. Метод удаляет все, что находится между двумя индексами
     * включительно
     * Test Data: 	“Red rover”, 1, 4 → “Rover”
     */

    public String deleteInBetweenTwoIndexes(String text, int index1, int index2) {
        if (stringValidation(text) && index1 >= 0 && index1 < text.length() && index2 >= 0 && index2 < text.length()) {
            return text.substring(0, index1).concat(text.substring(index2 + 1));
//            return text.substring(0, index1) + text.substring(index2 + 1);
        }
        return "";
    }


    /**
     * Task 14
     * Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде массива слов
     * Test Data:
     * “QA for Everyone” → {“QA”, “for”, “Everyone”}
     * “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */

    public String[] arrayOfStrings(String text) {
        if (stringValidation(text)) {

            return text.split(" ");
        }
        return new String[0];
    }


    /**
     * Task 15
     * Написать метод, который принимает на вход предложение, которое состоит из имени, фамилии, отчества
     * и возвращает текст:
     * Test Data: “Александр Сергеевич Пушкин” →
     * “Имя: Александр
     * Отчество: Сергеевич
     * Фамилия: Пушкин”
     */

    //подумать об проверке - имя, фамилия и отчество - все пришли с большой буквы.
    public String splitTheName(String text) {           // Test Data: “Александр Сергеевич Пушкин”
        if (stringValidation(text)) {

            String[] temp = text.split(" ");        // [Александр, Сергеевич, Пушкин]

//            char firstNameLetter = temp[0].charAt(0);      // А
//            char middleNameLetter = temp[1].charAt(0);     // С
//            char lastNameLetter = temp[2].charAt(0);       // П

            if (temp[0].charAt(0) >= 'A' && temp[0].charAt(0) <= 'Я'
                    && temp[1].charAt(0) >= 'A' && temp[1].charAt(0) <= 'Я'
                    && temp[2].charAt(0) >= 'A' && temp[2].charAt(0) <= 'Я') {

                String splitTheName = "";

                for (int i = 0; i < temp.length; i++) {
                    if (i == 0) {
                        splitTheName = "Имя: " + temp[i] + "\n" + "Отчество: " + temp[i + 1] + "\n"
                                + "Фамилия: " + temp[i + 2];
                        break;
                    }
                }

                return splitTheName;
            }
            return "Введите данные с заглавной буквы";

//            int firstNameLetterInt =Integer.parseInt(String.valueOf(firstNameLetter));      // по идее должно быть 1040
//            int middleNameLetterInt = Integer.parseInt(String.valueOf(middleNameLetter));      // по идее должно быть 1057
//            int lastNameLetterInt = Integer.parseInt(String.valueOf(lastNameLetter));      // по идее должно быть 1055
//
//            if (firstNameLetterInt >= 1040 && firstNameLetterInt <= 1072
//                    && middleNameLetterInt >= 1040 && middleNameLetterInt <= 1072
//                    && lastNameLetterInt >= 1040 && lastNameLetterInt <= 1072) {
        }

        return "";
    }


    public String splitTheName1(String text) {           // Test Data: “Александр Сергеевич Пушкин”
        if (stringValidation(text)) {

            String[] temp = text.split(" ");        // [Александр, Сергеевич, Пушкин]

            String splitTheName = "";

            for (int i = 0; i < temp.length; i++) {
                if (i == 0) {
                    splitTheName = "Имя: " + temp[i] + "\n" + "Отчество: " + temp[i + 1] + "\n"
                            + "Фамилия: " + temp[i + 2];
                    break;
                }
            }

            return splitTheName;
        }

        return "";
    }


    public String splitTheName2(String text) {           // Test Data: “Александр Сергеевич Пушкин”
        if (stringValidation(text)) {

            String[] temp = text.split(" ");        // [Александр, Сергеевич, Пушкин]

//            if (temp[0].codePointAt(0) >= 1040 && temp[0].codePointAt(0) <= 1071
//                    && temp[1].codePointAt(0) >= 1040 && temp[1].codePointAt(0) <= 1071
//                    && temp[2].codePointAt(0) >= 1040 && temp[2].codePointAt(0) <= 1071) {

//            if (temp[0].charAt(0) >= 'A' && temp[0].charAt(0) <= 'Я'
//                    && temp[1].charAt(0) >= 'A' && temp[1].charAt(0) <= 'Я'
//                    && temp[2].charAt(0) >= 'A' && temp[2].charAt(0) <= 'Я') {


            String splitTheName = "";

            if (temp[0].substring(0, 1).equals(temp[0].substring(0, 1).toUpperCase())
                    && temp[1].substring(0, 1).equals(temp[1].substring(0, 1).toUpperCase())
                    && temp[2].substring(0, 1).equals(temp[2].substring(0, 1).toUpperCase())) {


                for (int i = 0; i < temp.length; i++) {
                    if (i == 0) {
                        splitTheName = "Имя: " + temp[i] + "\n" + "Отчество: " + temp[i + 1] + "\n"
                                + "Фамилия: " + temp[i + 2];
                        break;
                    }
                }

                return splitTheName;
            }

            return "Введите данные с заглавной буквы";
//            String firstName = temp[0].substring(0, 1).toUpperCase().concat(temp[0].substring(1, temp[0].length()));
//            String middleName = temp[1].substring(0, 1).toUpperCase().concat(temp[1].substring(1, temp[1].length()));
//            String lastName = temp[2].substring(0, 1).toUpperCase().concat(temp[2].substring(1, temp[2].length()));
//
//
//            for (int i = 0; i < temp.length; i++) {
//                if (i == 0) {
//                    splitTheName = "Имя: " + firstName + "\n" + "Отчество: " + middleName + "\n"
//                            + "Фамилия: " + lastName;
//                    break;
//                }
//            }
//
//            return splitTheName;
        }

        return "";
    }

    /**
     * Task 16
     * Написать метод, который принимает на вход слово и число n,  и возвращает строку, где слово повторяется n раз.
     * Test Data: “one”, 5 → “oneoneoneoneone”
     */

//    public String multiplyTheString(String text, int n) {
//        if (project_utils.Utils.stringValidation(text) && n > 0) {
//            String multiplyTheString = "";
//            for (int i = 0; i < n; i++) {
//                multiplyTheString += text;
//            }
//            return multiplyTheString;
//        }
//
//        return "";
//    }
    public String multiplyTheString1(String text, int n) {
        if (stringValidation(text) && n > 0) {

            return text.repeat(n);
        }

        return "";
    }


    /**
     * Task 17
     * Напишите метод, который принимает строку и index, и возвращает численное значение буквы,
     * которая находится на позиции index (использовать только один метод класса String)
     */

//    public int findIntLetter(String text, int index) {
//        if (project_utils.Utils.stringValidation(text) && index >= 0 && index < text.length()) {
//            int findIntLetter = (int) text.charAt(index);
//            return findIntLetter;
//        }
//        return Integer.MIN_VALUE;
//    }
    public int findIntLetter(String text, int index) {
        if (stringValidation(text) && index >= 0 && index < text.length()) {

            return text.codePointAt(index);
        }
        return Integer.MIN_VALUE;
    }


    /**
     * Task 18
     * Написать метод, который принимает 3 слова, и сравнивает их методом,
     * который считает, что прописные и заглавные буквы - это одни и те же буквы.
     * Метод возвращает true, если все слова одинаковы,
     * и метод возвращает false, если слова не одинаковы:
     */

    public boolean compareThreeWords(String str1, String str2, String str3) {
        if (stringValidation(str1) && stringValidation(str2) && stringValidation(str3)) {
            if (str1.equalsIgnoreCase(str2) && str2.equalsIgnoreCase(str3) && str1.equalsIgnoreCase(str3)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println((int) 'А');
        System.out.println((int) 'Б');
        System.out.println((int) 'В');
        System.out.println((int) 'Г');
        System.out.println((int) 'Д');
    }


}
