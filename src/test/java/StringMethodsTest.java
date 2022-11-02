import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class StringMethodsTest {

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

    @Test
    public void testRemoveSpacesHappyPath() {
        String text = "    Red Rover School   ";

        String expectedResult = "Лишние пробелы удалены";

        String actualResult = new StringMethods().removeSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testRemoveSpacesHappyPath1() {
        String text = "Red Rover School";

        String expectedResult = "Пробелов не было";

        String actualResult = new StringMethods().removeSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveSpacesNegative() {
        String text = "";

        String expectedResult = "Строка пустая";

        String actualResult = new StringMethods().removeSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);
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


    @Test
    public void testRemoveAllAsHappyPath() {
        String text = "    Red Rover School   ";

        String expectedResult = "Red Rover School";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testRemoveAllAsHappyPath1() {
        String text = "panda   ";

        String expectedResult = "pnd";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testRemoveAllAsHappyPath2() {
        String text = "taramasalata";

        String expectedResult = "trmslt";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testRemoveAllAsNegative() {
        String text = "";

        String expectedResult = "";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testRemoveAllAsNegative1() {
        String text = null;

        String expectedResult = "";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult, expectedResult);
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

    @Test
    public void testRemoveAllZerosHappyPath() {
        String text = "3504209706040000 ";

        String expectedResult = "35429764";

        String actualResult = new StringMethods().removeAllZeros(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testRemoveAllZerosHappyPath1() {
        String text = "0000000111";

        String expectedResult = "111";

        String actualResult = new StringMethods().removeAllZeros(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testRemoveAllZerosNegative() {
        String text = "";

        String expectedResult = "";

        String actualResult = new StringMethods().removeAllZeros(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testRemoveAllZerosNegative1() {
        String text = null;

        String expectedResult = "";

        String actualResult = new StringMethods().removeAllZeros(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 4
     * Написать алгоритм removeAllSpaces, который принимает на вход строку. Если строка валидная, то метод удаляет
     * все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     * “p a     n   d a   “ → “panda”
     */

    @Test
    public void testRemoveAllSpacesHappyPath() {
        String text = "    R e d     Ro ve    r Sc   h ool   ";

        String expectedResult = "RedRoverSchool";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testRemoveAllSpacesHappyPath1() {
        String text = "p a     n   d a   ";

        String expectedResult = "panda";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testRemoveAllSpacesNegative() {
        String text = "";

        String expectedResult = "";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testRemoveAllSpacesNegative1() {
        String text = null;

        String expectedResult = "";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);
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

    @Test
    public void testCountAsHappyPath() {
        String text = "Abracadabra";

        String expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCountAsHappyPath1() {
        String text = "Homenum Revelio";

        String expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCountAsHappyPath2() {
        String text = "3 tarAmasAlatA";

        String expectedResult = "6, 8";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCountAsNegative() {
        String text = "";

        String expectedResult = "";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCountAsNegative1() {
        String text = null;

        String expectedResult = "";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 6
     * Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте хотя бы
     * одно слово Java.
     */

    @Test
    public void testCountJavaHappyPath() {
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java 8 " +
                "with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds " +
                "of OpenJDK 8 and 11 that are still receiving security and other upgrades.";

        String expectedResult = "true";

        String actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCountJavaHappyPath1() {
        String text = "99 little bugs in a code.\n" +
                "99 little bugs in a code.\n" +
                "Take one down, and patch it around.\n" +
                "235 critical bugs in the code.";

        String expectedResult = "false";

        String actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountJavaNegative() {
        String text = "";

        String expectedResult = "";

        String actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountJavaNegative1() {
        String text = null;

        String expectedResult = "";

        String actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 7
     * Напишите метод insertQuotes(), который принимает слово и возвращает строку,
     * в которой это слово “обернуто” в кавычки:
     * Test Data: “Abracadabra” →  ““Abracadabra””
     */

    @Test
    public void testInsertQuotesHappyPath() {
        String text = "Abracadabra";

        String expectedResult = "\"Abracadabra\"";

        String actualResult = new StringMethods().insertQuotes(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testInsertQuotesHappyPath1() {
        String text = "Java";

        String expectedResult = "\"Java\"";

        String actualResult = new StringMethods().insertQuotes(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testInsertQuotesNegative() {
        String text = "";

        String expectedResult = "";

        String actualResult = new StringMethods().insertQuotes(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testInsertQuotesNegative1() {
        String text = null;

        String expectedResult = "";

        String actualResult = new StringMethods().insertQuotes(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 8
     * Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :  после слова “говорил”,
     * и оборачивает в кавычки вторую строку
     * (результат строится с помощью метода concat())
     */

    @Test
    public void testInsertQuotes1HappyPath() {
        String text1 = "Федор Достоевский писал";
        String text2 = "Надо любить жизнь больше, чем смысл жизни.";

        String expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";

        String actualResult = new StringMethods().insertQuotes1(text1, text2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testInsertQuotes1HappyPath1() {
        String text1 = "Наполеон Бонапарт писал";
        String text2 = "В моем словаре нет слова \"невозможно\".";

        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";

        String actualResult = new StringMethods().insertQuotes1(text1, text2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testInsertQuotes1Negative() {
        String text1 = "";
        String text2 = "";

        String expectedResult = "";

        String actualResult = new StringMethods().insertQuotes1(text1, text2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testInsertQuotes1Negative1() {
        String text1 = null;
        String text2 = null;

        String expectedResult = "";

        String actualResult = new StringMethods().insertQuotes1(text1, text2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 9
     * Напишите метод, который принимает на вход название города и исправляет написание:
     * Test Data:
     * “ташкент” → “Ташкент”
     * “ЧикаГО” → “Чикаго”
     */

    @Test
    public void testFixCityNameHappyPath() {
        String city = "ташкент";

        String expectedResult = "Ташкент";

        String actualResult = new StringMethods().fixCityName(city);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFixCityNameHappyPath1() {
        String city = "ЧикаГО";

        String expectedResult = "Чикаго";

        String actualResult = new StringMethods().fixCityName(city);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFixCityNameNegative() {
        String city = "";

        String expectedResult = "";

        String actualResult = new StringMethods().fixCityName(city);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFixCityNameNegative1() {
        String city = null;

        String expectedResult = "";

        String actualResult = new StringMethods().fixCityName(city);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 10
     * Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все, что находится
     * между первой и последней буквой-параметром:
     * Test Data:
     * “Abracadabra”, “b” → “bracadab”
     * “Whippersnapper”, “p” → “ppersnapp”
     */

    @Test
    public void testFindStringBetweenTwoIndexesHappyPath() {
        String text = "Abracadabra";
        char letter = 'b';

        String expectedResult = "bracadab";

        String actualResult = new StringMethods().findStringBetweenTwoIndexes(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFindStringBetweenTwoIndexesHappyPath1() {
        String text = "Whippersnapper";
        char letter = 'p';

        String expectedResult = "ppersnapp";

        String actualResult = new StringMethods().findStringBetweenTwoIndexes(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testFindStringBetweenTwoIndexesNegative() {
        String text = "";
        char letter = 'p';

        String expectedResult = "";

        String actualResult = new StringMethods().findStringBetweenTwoIndexes(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFindStringBetweenTwoIndexesNegative1() {
        String text = null;
        char letter = 'p';

        String expectedResult = "";

        String actualResult = new StringMethods().findStringBetweenTwoIndexes(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Ignore
    @Test
    public void testFindStringBetweenTwoIndexesNegative2() {
        String text = "Whippersnapper";
        char letter = 'ы';

        String expectedResult = "-1";

        String actualResult = new StringMethods().findStringBetweenTwoIndexes(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 11
     * Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и заканчивается
     * на одинаковую букву, и false иначе
     * Test Data:
     * “Abracadabra” → true
     * “Whippersnapper” → false
     */

    @Test
    public void testSameLetterHappyPath() {
        String text = "Abracadabra";

        String expectedResult = "true";

        String actualResult = new StringMethods().sameLetter(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSameLetterHappyPath1() {
        String text = "Whippersnapper";

        String expectedResult = "false";

        String actualResult = new StringMethods().sameLetter(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSameLetterNegative() {
        String text = "";

        String expectedResult = "";

        String actualResult = new StringMethods().sameLetter(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 12
     * Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом,
     * и возвращает последнее слово
     * Test Data:
     * “Red Rover” → “Rover”
     */

    @Test
    public void testReturnLastWordHappyPath() {
        String text = "Red Rover";

        String expectedResult = "Rover";

        String actualResult = new StringMethods().returnLastWord(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReturnLastWordHappyPath1() {
        String text = "Java Script";

        String expectedResult = "Script";

        String actualResult = new StringMethods().returnLastWord(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReturnLastWordNegative() {
        String text = "";

        String expectedResult = "";

        String actualResult = new StringMethods().returnLastWord(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReturnLastWordNegative1() {
        String text = null;

        String expectedResult = "";

        String actualResult = new StringMethods().returnLastWord(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 13
     * Написать метод, который принимает строку, и 2 индекса. Метод удаляет все, что находится между двумя индексами
     * включительно
     * Test Data: 	“Red rover”, 1, 4 → “Rover”
     */

    @Test
    public void testDeleteInBetweenTwoIndexesHappyPath() {
        String text = "Red rover";
        int index1 = 1;
        int index2 = 4;

        String expectedResult = "Rover";

        String actualResult = new StringMethods().deleteInBetweenTwoIndexes(text, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDeleteInBetweenTwoIndexesHappyPath1() {
        String text = "Red rover";
        int index1 = 0;
        int index2 = 4;

        String expectedResult = "over";

        String actualResult = new StringMethods().deleteInBetweenTwoIndexes(text, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDeleteInBetweenTwoIndexesNegative() {
        String text = "";
        int index1 = 1;
        int index2 = 4;

        String expectedResult = "";

        String actualResult = new StringMethods().deleteInBetweenTwoIndexes(text, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDeleteInBetweenTwoIndexesNegative1() {
        String text = null;
        int index1 = 1;
        int index2 = 4;

        String expectedResult = "";

        String actualResult = new StringMethods().deleteInBetweenTwoIndexes(text, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDeleteInBetweenTwoIndexesNegative2() {
        String text = "Red rover";
        int index1 = -1;
        int index2 = 4;

        String expectedResult = "";

        String actualResult = new StringMethods().deleteInBetweenTwoIndexes(text, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDeleteInBetweenTwoIndexesNegative3() {
        String text = "Red rover";
        int index1 = 10;
        int index2 = 4;

        String expectedResult = "";

        String actualResult = new StringMethods().deleteInBetweenTwoIndexes(text, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 14
     * Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде массива слов
     * Test Data:
     * “QA for Everyone” → {“QA”, “for”, “Everyone”}
     * “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */

    @Test
    public void testArrayOfStringsHappyPath() {
        String text = "QA for Everyone";

        String[] expectedResult = {"QA", "for", "Everyone"};

        String[] actualResult = new StringMethods().arrayOfStrings(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayOfStringsHappyPath1() {
        String text = "Александр Сергеевич Пушкин";

        String[] expectedResult = {"Александр", "Сергеевич", "Пушкин"};

        String[] actualResult = new StringMethods().arrayOfStrings(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayOfStringsNegative() {
        String text = "";

        String[] expectedResult = {};

        String[] actualResult = new StringMethods().arrayOfStrings(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayOfStringsNegative1() {
        String text = null;

        String[] expectedResult = {};

        String[] actualResult = new StringMethods().arrayOfStrings(text);

        Assert.assertEquals(actualResult, expectedResult);
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

    @Test
    public void testSplitTheNameHappyPath() {
        String text = "Александр Сергеевич Пушкин";

        String expectedResult = "Имя: Александр" + "\n"
                + "Отчество: Сергеевич" + "\n"
                + "Фамилия: Пушкин";

        String actualResult = new StringMethods().splitTheName2(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSplitTheNameHappyPath1() {
        String text = "Александр сергеевич пушкин";

        String expectedResult = "Введите данные с заглавной буквы";

        String actualResult = new StringMethods().splitTheName2(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Ignore
    @Test
    public void testSplitTheNameHappyPath1_1() {
        String text = "Александр сергеевич пушкин";

        String expectedResult = "Имя: Александр" + "\n"
                + "Отчество: Сергеевич" + "\n"
                + "Фамилия: Пушкин";

        String actualResult = new StringMethods().splitTheName2(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSplitTheNameNegative() {
        String text = "";

        String expectedResult = "";

        String actualResult = new StringMethods().splitTheName(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testSplitTheNameNegative1() {
        String text = null;

        String expectedResult = "";

        String actualResult = new StringMethods().splitTheName(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 16
     * Написать метод, который принимает на вход слово и число n,  и возвращает строку, где слово повторяется n раз.
     * Test Data: “one”, 5 → “oneoneoneoneone”
     */

    @Test
    public void testMultiplyTheStringHappyPath() {
        String text = "one";
        int n = 5;

        String expectedResult = "oneoneoneoneone";

        String actualResult = new StringMethods().multiplyTheString1(text, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplyTheStringHappyPath1() {
        String text = "five";
        int n = 10;

        String expectedResult = "fivefivefivefivefivefivefivefivefivefive";

        String actualResult = new StringMethods().multiplyTheString1(text, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplyTheStringNegative() {
        String text = "";
        int n = 10;

        String expectedResult = "";

        String actualResult = new StringMethods().multiplyTheString1(text, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplyTheStringNegative1() {
        String text = null;
        int n = 10;

        String expectedResult = "";

        String actualResult = new StringMethods().multiplyTheString1(text, n);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 17
     * Напишите метод, который принимает строку и index, и возвращает численное значение буквы,
     * которая находится на позиции index (использовать только один метод класса String)
     */

    @Test
    public void testFindIntLetterHappyPath() {
        String text = "Abracadabra";
        int index = 5;

        int expectedResult = 97;

        int actualResult = new StringMethods().findIntLetter(text, index);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFindIntLetterHappyPath1() {
        String text = "RedRover";
        int index = 3;

        int expectedResult = 82;

        int actualResult = new StringMethods().findIntLetter(text, index);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFindIntLetterNegative() {
        String text = "RedRover";
        int index = 10;

        int expectedResult = Integer.MIN_VALUE;

        int actualResult = new StringMethods().findIntLetter(text, index);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFindIntLetterNegative1() {
        String text = "";
        int index = 10;

        int expectedResult = Integer.MIN_VALUE;

        int actualResult = new StringMethods().findIntLetter(text, index);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFindIntLetterNegative2() {
        String text = null;
        int index = 10;

        int expectedResult = Integer.MIN_VALUE;

        int actualResult = new StringMethods().findIntLetter(text, index);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFindIntLetterNegative3() {
        String text = null;
        int index = -1;

        int expectedResult = Integer.MIN_VALUE;

        int actualResult = new StringMethods().findIntLetter(text, index);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Task 18
     * Написать метод, который принимает 3 слова, и сравнивает их методом,
     * который считает, что прописные и заглавные буквы - это одни и те же буквы.
     * Метод возвращает true, если все слова одинаковы,
     * и метод возвращает false, если слова не одинаковы:
     */

    @Test
    public void testCompareThreeWordsHappyPath() {
        String word1 = "Abracadabra";
        String word2 = "ABRACADABRA";
        String word3 = "aBrAcAdAbRa";

        boolean expectedResult = true;

        boolean actualResult = new StringMethods().compareThreeWords(word1, word2, word3);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCompareThreeWordsHappyPath1() {
        String word1 = "Abracadabra";
        String word2 = "ABRACADABRA";
        String word3 = "aBrAcAdAbRa";

        boolean expectedResult = true;

        boolean actualResult = new StringMethods().compareThreeWords(word1, word2, word3);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCompareThreeWordsNegative() {
        String word1 = "Abracadabra";
        String word2 = "";
        String word3 = "aBrAcAdAbRa";

        boolean expectedResult = false;

        boolean actualResult = new StringMethods().compareThreeWords(word1, word2, word3);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCompareThreeWordsNegative1() {
        String word1 = null;
        String word2 = null;
        String word3 = "aBrAcAdAbRa";

        boolean expectedResult = false;

        boolean actualResult = new StringMethods().compareThreeWords(word1, word2, word3);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
