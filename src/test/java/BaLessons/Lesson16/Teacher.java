package BaLessons.Lesson16;

public class Teacher extends Person {

    public Teacher(String name, String lastName) {
        super(name, lastName);
    }

    public void printName() {
        System.out.println("Proferssor " + name + " " + lastName);
    }

}
