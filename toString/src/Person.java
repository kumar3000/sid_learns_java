public class Person {
    String first;
    String last;

    Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public String toString() {
        return this.first + " " + this.last;
    }
}
