package BaLessons;

public class Lesson12_ClassWork {
    public static void main(String[] args) {

        Student_L12 dina = new Student_L12("Dina", "Ivanova", 102);
        Student_L12 boris = new Student_L12("Boris", "Jameson", 103);
        Student_L12 alex = new Student_L12("Alex", "Mishin", 104);

        Student_L12[] sds = new Student_L12[]{dina, boris, alex};

        Address schoolAddress = new Address("155 Columbus ave", "Brooklyn", "New York", 80000);

        School mathSchool = new School("Math School", sds, schoolAddress);

        mathSchool.printSchool();


    }
}
