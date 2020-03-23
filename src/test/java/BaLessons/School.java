package BaLessons;

public class School {
    private String name;
    private Student_L12[] students;
    private Address address;

    public School(String name, Student_L12[] students, Address address) {
        this.name = name;
        this.address = address;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Student_L12[] getStudents() {
        return students;
    }

    public void printSchool() {
        System.out.println(name);
        address.printAddress();
        for (Student_L12 student : students
        ) {
            student.printStudent();

        }
    }
}
