package homeworks;

import java.util.*;

public class Homework_16 {
    public static void main(String[] args) {
        System.out.println(countWords("     Java is fun       "));//TASK1
        System.out.println(countWords("Selenium is the most common UI automation tool.   "));//TASK1
        System.out.println(countWords(""));//TASK1
        System.out.println(countA("TechGlobal is a QA bootcamp"));//TASK2
        System.out.println(countA(""));//TASK2
        System.out.println(countA("QA stands for Quality Assurance"));//TASK2
        System.out.println(countPos(new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67))));//TASK3
        System.out.println(countPos(new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123))));//TASK3
        System.out.println(removeExtraSpaces("   I   am      learning     Java      "));
    }

    //TASK1
    public static int countWords(String str) {
        if (str.isEmpty())
            return 0;
        int split = str.trim().split(" ").length;
        return split;
    }

    //TASK2
    public static int countA(String str) {
        if (str.isEmpty())
            return 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
    //TASK3
    public static Integer countPos(List<Integer> numbers){
        int positive = 0;
        for (Integer number : numbers) {
            if (number > 0) {
                positive++;
            }
        }
                return positive;
            }
            //TASK6
            static String removeExtraSpaces(String str)
            {
                str = str.replaceAll(" +"," ");
                return str;
            }
        }










