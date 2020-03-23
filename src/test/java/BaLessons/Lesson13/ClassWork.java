package BaLessons.Lesson13;

public class ClassWork {
    public static void main(String[] args) {

        PersonalName ivanDole = new PersonalName("Ivan", "Dole");
        Address address = new Address(ivanDole, "155 Medison Ave", "NYC", "NY", 80000);
        Monitor monitor = new Monitor();
        monitor.model = "MODEL";
        SystemBlock systemBlock = new SystemBlock();
        systemBlock.name = "System";
        Computer personalComputer = new Computer(systemBlock, monitor);
        House house = new House(address, 5, 4, 900, personalComputer);

        String monitorModel = house.getComputer().getMonitor().model;
        System.out.println(monitorModel);

        String name = house.getAddress().getName().getFirstName();
        System.out.println(name);



    }
}
