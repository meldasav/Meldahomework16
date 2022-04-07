package stringMethods;

public class _13_Replace {
    public static void main(String[] args) {
        /*
        Method Task: It is used to replace some values in a String with another value
        NOTE: it replaces all the occurrences.
                -It is non-static
        -It is a return type and returns another which is modified
        -It takes 2 arguments(char or String)
         */

        String sentence = "Apple is my favorite fruit";

        System.out.println(sentence.replace("Apple", "Strawberry")); // Can I xxx a xxx?

        String s = "banana";
        System.out.println(s.replace('a', '$'));

        String name = "John"; //o replace with ooo
        System.out.println(name.replaceFirst("o", "ooo"));

        System.out.println("Hello".replace("good", "nice"));

    }
}
