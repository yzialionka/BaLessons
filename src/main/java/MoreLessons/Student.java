package MoreLessons;

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

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void printInfo() {
        System.out.println(name + " " + lastName + ", the major is: " + major);
        for (String subj : subjects) {
            System.out.print(subj + ". ");

        }
        System.out.println();
        System.out.println();
    }
}
