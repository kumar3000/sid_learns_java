public class Main {
    public static void main(String[] args) {
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behavior without having to create a new class.
        //                   Often used for one time uses!

        Dog dog = new Dog();
        Dog ScoobyDoo = new Dog() {
            @Override
            void speak() {
                System.out.println("*RUH ROH*");
            }
        };

        dog.speak();
        ScoobyDoo.speak();
    }
}
