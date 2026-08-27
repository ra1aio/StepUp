package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumToN(2));

    }


    /*Задача 1: разработать метод с сигнатурой publiс static boolean isEven(int n). Метод возвращает true,
               если число чётное, и false — если нечётное.*/
    public static boolean isEven(int n) {

        return n % 2 == 0;

    }

    /*Задача 2: разработать метод с сигнатурой public static String checkAccess(int age). Метод возвращает Allowed,
    если число строго больше 18, и Denied — если меньше.*/
    public static String checkAccess(int age) {
        if (age > 18) {
            return "Allowed";
        } else {
            return "Denied";
        }
    }

    /*Задача 3: разработать метод с сигнатурой public static boolean isPositive(int n). Метод должен возвращать true,
    если переданное число больше или равно нулю, и false, если переданное число меньше нуля. Проверка внутри метода
    должна происходить с помощью тернарного оператора.*/
    public static boolean isPositive(int n) {

        return n >= 0 ? true : false;
    }

    /*Задача 4: разработать метод с сигнатурой public static String getGrade(int score). Метод возвращает строку,
    соответствующую строгому вхождению в границы:
    0–20: E;
    21–40: D;
    41–60: C;
    61–80: B;
    81–100: A.
    Если переданное число не входит в границы — вернуть строку Error.*/
    public static String getGrade(int score) {
        if (score >= 0 && score <=20) {
            return "E";
        } else if (score >= 21 && score <=40) {
            return "D";
        } else if (score >= 41 && score <=60) {
            return "C";
        } else if (score >= 61 && score <=80) {
            return "B";
        } else if (score >= 81 && score <=100) {
            return "A";
        } else {
            return "Error";
        }
    }

    /*Задача 5: разработать метод с сигнатурой public static String blastOff(int start). Метод принимает стартовое число
    (например, 5) и возвращает строку со всеми числами до 1 и словом «Поехали!» в конце (например, «5 4 3 2 1 Поехали!»).*/
    public static String blastOff(int start) {
        StringBuilder sb = new StringBuilder();
        while (start > 0) {
            sb.append(start).append(" ");
            start--;
        }
        sb.append("Поехали!");

        return sb.toString();
    }

    /*Задача 6: разработать метод с сигнатурой public static int sumToN(int n).
    Метод возвращает сумму всех целых чисел от 1 до n.*/
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /*Задача 7: разработать метод с сигнатурой publiс static boolean hasBug(String[] messages). Метод принимает массив
    строк и возвращает true, если хотя бы одна строка в массиве равна Bug. Сравнение можно выполнять без учёта регистра.*/

    public static boolean hasBug(String[] messages) {
        if (messages == null) {

            return false;
        }
        for (String message : messages) {
            if (message != null && message.equalsIgnoreCase("bug")) {

                return true;
            }
        }

        return false;
    }

    /*Задача 8: разработать метод с сигнатурой publiс static getEvenInRange(int start, int end). Метод принимает границы
    диапазона и возвращает строку, состоящую только из чётных чисел внутри этого промежутка (включая границы),
    разделённых пробелом. Перед первым и после последнего числа пробел не ставится. Например: (2, 5) -> “2 4”*/

    public static String getEvenInRange(int start, int end) {
        if (start > end) {

            return "";
        }
        StringBuilder sb = new StringBuilder();

        for (int i = start; i <= end ; i++) {
            if (i % 2 == 0) {
                sb.append(i).append(" ");
            }
        }

        return sb.toString().trim();
    }

    /*Задача 9: разработать метод с сигнатурой publiс static public int findMax(int[] arr). Метод находит и возвращает
    самое большое число в переданном массиве.*/

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    /*Задача 10: разработать метод с сигнатурой publiс static String[] reverse(String[] arr).
    Метод возвращает новый массив, в котором элементы исходного массива расположены в обратном порядке.
    Например, {“One”, “Two”, “Zero”} -> {“Zero”, “Two”, “One}.*/

    public static String[] reverse(String[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        String[] reverseArr = new String[arr.length];
        int i = arr.length - 1;
        for (String string : arr) {
            reverseArr[i] = string;
            i--;
        }

        return reverseArr;
    }

    /*Задача 11: разработать метод с сигнатурой publiс static calcAverage(List<Integer> list).
    Метод вычисляет и возвращает среднее арифметическое всех чисел в списке.*/

    public static double calcAverage(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым");
        }
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        return (double) sum / list.size();
        //Меня тоже смутил int, но в видео к заданию четко сказано, что дробная часть должна быть отброшена и сигнатура
        // именно public static int calcAverage(List<Integer> list). Это я к тому, что скорее всего все решат через  int
        // Но не могу не согласиться, что double здесь уместнее
    }

    /*Задача 12: разработать метод с сигнатурой
    publiс static List<String> removeSpecificName(List<String> list, String nameToRemove).
    Метод принимает список и имя, которое нужно исключить. Возвращает новый список, не содержащий указанного имени.*/

    public static List<String> removeSpecificName(List<String> list, String nameToRemove) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым");
        }

        List<String> newList = new ArrayList<>();
        for (String string : list) {
            if (!string.equals(nameToRemove)) {
                newList.add(string);
            }
        }

        return newList;
    }
}