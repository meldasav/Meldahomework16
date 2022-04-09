package projects;
import java.util.*;
public class Project08 {
    public static void main(String[] args) {
        System.out.println(countMultipleWords(new String[]{"foo", "", "", "java is fun", "ruby"}));//Task1
        System.out.println(removeNegatives(new ArrayList<Integer>(Arrays.asList(2,-5,6,7,-10,-78,0,15))));//TASK2
        System.out.println(removeNegatives(new ArrayList<Integer>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15))));//TASK2
        System.out.println(validatePassword("Abcd1234"));//TASK3
        String email = "abcd@gmail.com";//TASK4
        boolean isEmail = validEMail(email);//TASK4
        System.out.println("Is " + email + " the correct email address? " + isEmail);//TASK4
    }
    //task1
    public static int countMultipleWords(String[] a) {
        int countMultiWords = 0;
        for (String element : a) {
            if (element.trim().contains(" ")) countMultiWords++;
        }
        return countMultiWords;
    }
    //task2
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
        numbers.removeIf(element -> element < 0);
        return numbers;
    }
    //task3
    public static boolean validatePassword(String password) {
        boolean validPassword = false;
        if (!password.isEmpty() && (password.length() >= 8 && password.length() <= 16)) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i)) && Character.isLowerCase(password.charAt(i)) &&
                        Character.isDigit(password.charAt(i)) && (!Character.isWhitespace(password.charAt(i)))
                        && (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))))
                    validPassword = true;
            }
            return validPassword;
        }
        return false;
    }
    //TASK4  String email="<2+chars>@<2+chars>.<2+chars>";

    public static boolean validEMail(String email) {
        if (email.contains(" ")) return false;
        if (email.contains("@") && email.contains(".")) {
            String[] split1 = email.split("@");
            String[] split2 = split1[1].split("\\.");//in java "."needs to use together "\\."
            return split1[0].length() > 2 && split2[0].length() > 2 && split2[1].length() > 2;
        }
        return false;
    }


}
