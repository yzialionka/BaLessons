package MoreLessons;

public class Car {


    public String color;
    public String model;
    public String brand;
    public double gasTankVlume;

    public void beep() {
        System.out.println("beep");
    }

    public void driver() {
        System.out.println("Driving");
    }

    public void lightOn() {
        System.out.println("Light turn on");
    }

    public void printCarInfo() {
        System.out.println("Model = " + model +", Brand is " + brand + ", Color is " + color + ", Gas tank volume is " + gasTankVlume);
    }

}
