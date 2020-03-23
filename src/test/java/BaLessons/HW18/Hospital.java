package BaLessons.HW18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {

    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranseCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranseCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public void printInfo() {
        System.out.println("Hospital name: " + hospitalName);
        address.printInfo();
        doctors.forEach(doctor -> doctor.printInfo());
        rooms.forEach((roomNumber, roomName) -> System.out.println(roomNumber + "-->" + roomName));
        System.out.println("List of insurance: ");
        acceptedInsurances.forEach(i -> System.out.println(i));
    }
}
