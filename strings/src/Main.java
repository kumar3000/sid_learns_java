public class Main {
    public static void main(String[] args) {
        String name = "Sidarth Kumar";

        // string methods

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("a");
        int lastIndex = name.lastIndexOf("a");

        System.out.println(name + " is " + length + " chars long.");
        System.out.println("char at 0 is " + letter + "!");
        System.out.println("The first occurance of 'a' is at index " + index + "!");
        System.out.println("The last occurance of 'a' is at index " + lastIndex + "!");

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        if (name.isEmpty()) {
            System.out.println("No name!");
        } else {
            System.out.println("Hello, " + name + "!");
        }

        if (name.equals("sidarth kumar")) {
            System.out.println("Hi sid!");
        }
    }
}
