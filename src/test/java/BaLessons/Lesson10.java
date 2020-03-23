package BaLessons;

public class Lesson10 {
    public static void main(String[] args) {

        String[] subjects = new String[] {"Class_1", "Class_2", "Class_3", "Class_4", "Class_5", "Class_6"};
        Student jhon = new Student("Jhon", "Dole", "Finance", subjects);
        Student jane = new Student("Jane", "Dole", "Finance", subjects);
        Student boris = new Student();
        boris.setName("Boris");
        boris.setLastName("Jhoson");
        boris.setMajor("Politic");
        boris.setSubjects(subjects);
        jhon.printStudentInfo();
        jane.printStudentInfo();
        boris.printStudentInfo();

    }
}
