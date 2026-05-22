public class Fish extends Animal {

    @Override // good practice to have @Override, helps debugging
    void move() {
        System.out.println("Fish is swimming!");
    }
}
