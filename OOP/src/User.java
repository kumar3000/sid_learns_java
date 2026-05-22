public class User {
    String username;
    String email;
    Integer age;

    User() {
        this.username = "Guest";
        this.email = "n/a";
        this.age = null;
    }

    User(String username) {
        this.username = username;
        this.email = "n/a";
        this.age = null;
    }

    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = null;
    }

    User(String username, String email, Integer age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
