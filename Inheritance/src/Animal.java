public class Animal {
    boolean isAlive;
    static int animals = 0;

    Animal() {
        isAlive = true;
        animals += 1;
    }

    void eat() {
        System.out.println("The animal is eating.");
    }
}
