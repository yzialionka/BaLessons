package BaLessons.existedFiles;

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private int zip;

    public Address(String streetAddress, String city, String state, int zip) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getState() {
        return state;
    }

    public void printAddress() {
        System.out.println(streetAddress + " | " + city + " | " + state + " | " + zip);
    }
}
