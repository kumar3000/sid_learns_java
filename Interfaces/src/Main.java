public class Main {
    public static void main(String[] args) {
        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that implementing classes MUST define.
        //             Supports multiple inheritance-like behavior. (Class can have multiple parents)

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk tuah = new Hawk();
        tuah.hunt();

        Fish feesh = new Fish();
        feesh.flee();
        feesh.hunt();
    }
}
