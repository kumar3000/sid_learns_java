public class Main {
    public static void main(String[] args) {
        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        System.out.println(friend1.name);
        System.out.println(friend2.name);

        Friend.showFriends();

        // another example
        Math.round(3.99);
    }
}
