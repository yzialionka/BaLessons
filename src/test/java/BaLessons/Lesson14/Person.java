package BaLessons.Lesson14;

import java.time.LocalDateTime;

public class Person {

    protected String firstName;
    protected String lastName;
    protected LocalDateTime dob;

    public Person(String firstName, String lastName, LocalDateTime dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;

    }

    protected void printPersson() {
        System.out.println(firstName + " " + lastName + " " + dob);
    }
}
