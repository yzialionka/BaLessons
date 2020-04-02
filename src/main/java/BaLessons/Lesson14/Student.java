package BaLessons.Lesson14;

import java.time.LocalDateTime;

public class Student extends Person {
    private Subject[] subjeccts;
    private Subject major;

    public Student(String firstName, String lastName, LocalDateTime dob, Subject[] subjects, Subject major) {
        super(firstName, lastName, dob);
        this.major = major;
        this.subjeccts = subjects;
    }

    public Subject[] getSubjeccts() {
        return subjeccts;
    }

    public void setSubjeccts(Subject[] subjeccts) {
        this.subjeccts = subjeccts;
    }

}
