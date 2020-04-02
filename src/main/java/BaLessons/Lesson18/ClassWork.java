package BaLessons.Lesson18;

import java.util.HashMap;
import java.util.Map;

public class ClassWork {
    public static void main(String[] args) {


        Map<String, String> countriesAndCapitals = new HashMap<>();
        countriesAndCapitals.put("UK", "London");
        countriesAndCapitals.put("Germany", "Berlin");
        countriesAndCapitals.put("India", "New Deli");
        countriesAndCapitals.put("Australia", "Canbera");


        //TODO Learn!
        for (Map.Entry<String, String> pair : countriesAndCapitals.entrySet()) {
            System.out.println("Country = " + pair.getKey() + ", capital = " + pair.getValue());
        }

        //TODO Learn!
        countriesAndCapitals.forEach((key, value) -> System.out.println("Country = " + key + ", capital = " + value));

    }
}
