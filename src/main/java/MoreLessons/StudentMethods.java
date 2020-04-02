package MoreLessons;

public class StudentMethods {
    public static void main(String[] args) {
        System.out.println("*****************");

        String[] subjs = new String[]{"Sub_1", "Sub_2", "Sub_3"};

        Student jhon = new Student("Jhom", "Dohe", "Math!", subjs );
        Student jane = new Student("Jane", "Dohe", "Geo", subjs );
        Student boris = new Student();
        boris.setName("Boris");
        boris.setLastName("Jhonson");
        boris.setMajor("Politics");
        boris.setSubjects(subjs);

        jhon.printInfo();
        jane.printInfo();
        boris.printInfo();


    }
}

