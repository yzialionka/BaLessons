package BaLessons.Lesson13;

public class House {

    private Address address;
    private int bedrooms;
    private int bathrooms;
    private double square;
    private Computer computer;

    public House(Address address, int bedrooms, int bathrooms, double square, Computer computer) {
        this.address = address;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.square = square;
        this.computer = computer;
    }

    public Address getAddress() {
        return address;
    }

    public Computer getComputer() {
        return computer;
    }

    public double getSquare() {
        return square;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }
}
