package BaLessons.Lesson15;

public class ClassWork {
    public static void main(String[] args) {

        Student ivan = new Student("Ivan", " Susanuin");
        Teacher maya = new Teacher("Maya", "Dowson");

        Person ilya = new Student("Ilya", "Petrov");
        Person jhon = new Teacher("Jhon", "Watson");

        ProtoPerson shelly = new Student("Shelly", "Ostrovsky");
        ProtoPerson mark = new Teacher("Mark", "Rousvelt");
        ProtoPerson abstractPerson = new Person("Some", "Person");



    }
}
