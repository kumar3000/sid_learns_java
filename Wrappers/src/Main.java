public class Main {
    public static void main(String[] args) {
        // Wrapper classes = Allow primitive values to be used as objects.
        //                   Useful in collections

        // autoboxing, data -> wrapper
        String s = "Pizza";

        Integer a = 123;
        Double d = 3.14;
        Character c = '$';
        Boolean b = true;

        // unboxing, wrapper -> primitive
        int x = a;
        double y = d;
        double z = (int) x + y;
        System.out.println(z);

        // static utility methods
        String aString = Integer.toString(123);
        String bString = Double.toString(3.14);
        String cString = Character.toString('$');
        String dString = Boolean.toString(false);

        String total = aString + bString + cString + dString;
        System.out.println(total);
    }
}
