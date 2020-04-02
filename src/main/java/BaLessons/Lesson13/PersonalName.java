package BaLessons.Lesson13;

public class PersonalName {

    private String firstName;
    private String lastName;

    public PersonalName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
