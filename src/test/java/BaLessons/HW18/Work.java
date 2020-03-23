package BaLessons.HW18;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {

    public static void main(String[] args) {

        var address = new Address("154 MAin Ave", "Denver", "CO", 80004);
        var doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Peter", "Shy", Position.DOCTOR));
        doctors.add(new Doctor("Rob", "Stoll", Position.DOCTOR));
        doctors.add(new Doctor("Genry", "Kess", Position.DOCTOR));
        doctors.add(new Doctor("Pete", "Darsy", Position.DOCTOR));
        doctors.add(new Doctor("Mike", "Todd", Position.MANAGER));
        doctors.add(new Doctor("Stive", "Rocco", Position.PHYSICIAN));
        doctors.add(new Doctor("Lisa", "Stivenson", Position.NURSE));

        var rooms = new HashMap<Integer, String>();
        rooms.put(12, "Doctors room");
        rooms.put(13, "Doctors room");
        rooms.put(14, "Doctors room");
        rooms.put(15, "Doctors room");
        rooms.put(16, "Doctors room");
        rooms.put(17, "Ultrasound room");
        rooms.put(18, "Registration");
        rooms.put(12, "Accounter room");

        var acceptedIns = new ArrayList<InsuranseCompanies>();
        acceptedIns.add(InsuranseCompanies.AETNA);
        acceptedIns.add(InsuranseCompanies.ANTHEM);
        acceptedIns.add(InsuranseCompanies.BLUE_CROSS);
        acceptedIns.add(InsuranseCompanies.EMBLEM);

        var hospital = new Hospital("Mount Zero", address, doctors, rooms, acceptedIns);
        hospital.printInfo();


    }

}
