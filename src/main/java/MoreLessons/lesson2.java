package MoreLessons;

public class lesson2 {
    public static void main(String[] args) {


        String str = "Some string for extra lesson";

        int lenght = str.length();
        char firstletter = str.charAt(0);
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("\n------------------------");

        System.out.println();
        if (str.equals("Some string")) {
            System.out.println("They are equal");

        } else {
            System.out.println("Not equal!");
        }
        System.out.println(str);

        String[] strArray = str.split(" ");

        boolean contain = str.contains("for");

        String lower = str.toLowerCase();
        //tring upper = str.toUpperCase();
        System.out.println(str);
        String capitalO = str.replace("o", "[O]");
        System.out.println(capitalO);


    }
}
