package BaLessons;

public class Student {
    private String name;
    private String lastName;
    private String major;
    private String[] subjects;

    public Student(String name, String lastName, String major, String[] subjects) {
        this.name = name;
        this.lastName = lastName;
        this.major = major;
        this.subjects = subjects;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public void printStudentInfo() {
        System.out.println("\n" +"************************");
        System.out.println(name + " " +lastName + " " +major);
        System.out.println();
        for (String item: subjects
             ) {
            System.out.print(item + ", ");

        }
    }

}
