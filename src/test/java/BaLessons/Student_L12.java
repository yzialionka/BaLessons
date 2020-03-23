package BaLessons;

public class Student_L12 {
    private String name;
    private String lastName;
    private int id;

    public Student_L12(String name, String lastName, int id) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void printStudent() {
        System.out.println(name + "." + lastName + "." + id);
    }
}
