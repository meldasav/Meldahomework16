package homeworks;

import java.util.*;

public class Homework_16 {
    public static void main(String[] args) {

        System.out.println("..............TASK1..............");
        System.out.println(countWords("Java is fun"));//TASK1
        System.out.println(countWords("Selenium is the most common UI automation tool.   "));//TASK1
        System.out.println(countWords(""));//TASK1
        System.out.println("..............TASK2..............");
        System.out.println(countA("TechGlobal is a QA bootcamp"));//TASK2
        System.out.println(countA(""));//TASK2
        System.out.println(countA("QA stands for Quality Assurance"));//TASK2
        System.out.println("..............TASK3..............");
        System.out.println(countPos(new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67))));//TASK3
        System.out.println(countPos(new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123))));//TASK3
        System.out.println("..............TASK4..............");
        System.out.println(removeDuplicateNumbers(new ArrayList(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60))));//TAsk4
        System.out.println(removeDuplicateNumbers(new ArrayList(Arrays.asList(1, 2, 5, 2, 3))));//TAsk4
        System.out.println("..............TASK5..............");
        System.out.println(removeDuplicateElements(new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"))));//TASK5
        System.out.println("..............TASK6..............");
        System.out.println(removeExtraSpaces("   I   am      learning     Java      "));
        System.out.println("..............TASK7..............");
        System.out.println(Arrays.toString(add(new int[]{3, 0, 0, 7, 5, 10}, new int[]{6, 3, 2})));
        System.out.println("..............TASK8..............");
      //  System.out.println(findClosestTo10(

    }

    //TASK1
    public static int countWords(String str) {
        if(str.isEmpty()){
            return 0;
        }
        int countMultiWords = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)== ' ' && str.charAt(i+1)!=' ') countMultiWords++;
        }
        return countMultiWords+1;
    //second way
//        int split = str.trim().split(" ").length;
//        return split;

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
    public static Integer countPos(List<Integer> numbers) {
        int positive = 0;
        for (Integer number : numbers) {
            if (number > 0) {
                positive++;
            }
        }
        return positive;
    }
    //TASK4

    public static List<Integer> removeDuplicateNumbers(List<Integer> arr) {
        int j = 0;
        for (int i = 0; i < arr.size(); i++)
            for (j = i + 1; j < arr.size(); j++)
                if (arr.get(i).equals(arr.get(j)))
                    arr.remove(j);
        return arr;
    }

    //Second way
//    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers) {
//        return new ArrayList<>(new HashSet<>(numbers));
//    }

    //TASK5
    public static List<String> removeDuplicateElements(ArrayList<String> str) {
//        List<String> str1 = new ArrayList<>(str);
//        str1.removeIf(x->x.equalsIgnoreCase(String.valueOf(str)));
//        return str1;
        List<String> str1 = new ArrayList<>(str);
        for (String s : str1) {
            if (!str1.contains(s)) {
                str1.add(s);
            }
        }
        return str1;
    }

    //TASK6

    public static String removeExtraSpaces(String str) {
        str = str.replaceAll(" +", " ");
        return str;
    }

    //TASK7
    public static int[] add(int[] a, int[] b) {
        int len = Math.min(a.length, b.length);
        int[] c = new int[len];
        for (int i = 0; i < len; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    //TASK8
    public static int[] findClosestTo10(int[] number) {
        int near = number[0];
        
        int difference = Math.abs(number[0] - 10);
        for (int j : number) {
            if (Math.abs(j - 10) < difference) {
                difference = Math.abs(j - 10);
                near = j;
            } else if (Math.abs(j - 10) == difference) {
                if (near > j)
                    near = j;
            }
        }
        return number;
      }

    }












