package BaLessons.pre_lesson16;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ClassWork {
    public static void main(String[] args) {

        ArrayList<String> listOfStrings = new ArrayList<String>();
        ArrayList<LocalDateTime> listOfDates = new ArrayList<LocalDateTime>();
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        ArrayList<Boolean> listOfBoolean = new ArrayList<Boolean>();

        System.out.println(listOfStrings.size());
        listOfStrings.add("Hello world!");
        System.out.println(listOfStrings.size());
        System.out.println(listOfStrings.get(0));
        listOfStrings.add("Hello, Students!");
        listOfStrings.add("Happy to see you");
        listOfStrings.add("It is 4th record");
        System.out.println(listOfStrings.size());

        listOfStrings.set(3, "It is 3rd record");
        System.out.println(listOfStrings.get(3));


    }
}
