public class Student extends Person {
    double gpa;

    Student(String first, String last, double gpa) {
        super(first, last); // passes required args to parent
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(first + " " + last + "'s GPA is: " + this.gpa);
    }
}
