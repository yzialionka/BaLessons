package BaLessons.Lesson14;

import java.time.LocalDateTime;

public class Teacher extends Person {
    private Subject subject;

    public Teacher(String firstName, String lastName, LocalDateTime dob, Subject subject) {
        super(firstName,lastName,dob);
        this.subject = subject;

    }

    public void printTeacher(){
        printPersson();
        System.out.println("Sub is " + subject);
    }

}
