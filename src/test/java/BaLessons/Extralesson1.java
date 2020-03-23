package BaLessons;

public class Extralesson1 {
    public static void main(String[] args) {


//        Fish goldFish = new Fish(30, "Karas", true);
//        double goldFishSizeInInchees = goldFish.calculateSizeinInch();
//        System.out.println("GoldFish size is " + goldFishSizeInInchees);

        String str = "Some String for extra lesson";
        int lenght = str.length();
        System.out.println(lenght);

        char four_letter = str.charAt(3);
        System.out.println(four_letter);

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        if (str.equals("Some String")) {
            System.out.println("\n\n" + "They are equals");
        } else {
            System.out.println("Not equals");

            String[] strArray = str.split(" ");
            for (String item : strArray
            ) {
                System.out.print(item + " | ");

            }

            System.out.println("\n");
            String[] strArrayO = str.split("o");
            for (String item : strArrayO
            ) {
                System.out.print(item + " | ");

            }
            System.out.println();


            boolean contain = str.contains("for");
            System.out.println(contain);

            String lower = str.toLowerCase();
            System.out.println(lower);

            String upper = str.toUpperCase();
            System.out.println(upper);

            String capitalO = str.replace("o", "(O)");
            System.out.println(capitalO);

            String substring = str.substring(5,11);
            System.out.println(substring);

        }
    }
}
