package MoreLessons;

public class CarMethods {

    public static void main(String[] args) {

        Car mashina = new Car();
        mashina.beep();


        Car ivanCar = new Car();
        ivanCar.brand = "BMW";
        ivanCar.model = "X5";
        ivanCar.color = "Red";
        ivanCar.gasTankVlume = 20.5;
        ivanCar.lightOn();

        ivanCar.printCarInfo();

        System.out.println("------------------------------");
        Person person1 = new Person();
        person1.name = "Rick";
        person1.lastName = "Green";
        person1.eyeColor = "Blue";
        person1.weight = 181.6;
        person1.age = 47;
        person1.printFullName();
        person1.printPhysicalConditions();
    }
}
