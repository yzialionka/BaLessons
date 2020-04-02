package BaLessons.Lesson13;

public class Address {

    private PersonalName name;
    private String streetAddress;
    private String state;
    private int zip;
    private String city;

    public Address(PersonalName name, String streetAddress, String city, String state, int zip) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.state = state;
        this.zip = zip;
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public int getZip() {
        return zip;
    }

    public PersonalName getName() {
        return name;
    }
}
