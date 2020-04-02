package BaLessons.Lesson14;

import java.time.LocalDateTime;

public class ClassWork {
    public static void main(String[] args) {


        Subject[] dashaSubjects = new Subject[]{Subject.BIOLOGY, Subject.GEO, Subject.MATH};
        Student dasha = new Student("Dasha", "Jennings", LocalDateTime.of(2002, 1, 1, 0, 0), dashaSubjects, Subject.HISTORY);

        Teacher antony = new Teacher("Antony", "James", LocalDateTime.of(1985, 8, 20, 0, 0, 0), Subject.MATH);


        antony.printTeacher();

    }
}
