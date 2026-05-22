public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.eat();
        dog.eat();
        cat.eat();
        System.out.println(Animal.animals);
        System.out.println(Cat.animals);
        System.out.println(Dog.animals);
    }
}
