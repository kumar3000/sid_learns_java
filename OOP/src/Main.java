public class Main {
    public static void main(String[] args) {
        // Object = an entity that holds data (attributes)
        //          and can perform actions (methods)
        //          Reference data types (stored in heap)

        Car car1 = new Car("Ford", "Mustang", 2025, 59000);
        Car car2 = new Car("Nissan", "Sentra", 2019, 23000);

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);

        User user = new User("Spongebob");
        User user2 = new User("Patrick", "patrick@aol.com");
        User user3 = new User("Sandy", "scheeks@gmail.com", 27);
        System.out.printf("%s %s %d\n", user.username, user.email, user.age);
        System.out.printf("%s %s %d\n", user2.username, user2.email, user2.age);
        System.out.printf("%s %s %d\n", user3.username, user3.email, user3.age);
    }
}
