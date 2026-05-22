public class Ostrich extends Animal {

    @Override // good practice to have @Override, helps debugging
    void move() {
        System.out.println("Ostrich is running!");
    }
}
