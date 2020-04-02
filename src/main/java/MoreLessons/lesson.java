package MoreLessons;

public class lesson {
    public static void main(String[] args) {

        Fish goldFish = new Fish(30, "Karas", true);
        double goldFishsize = goldFish.calculateSize();
        System.out.println("Goldfish size is: " + goldFishsize + " inches");


    }
}
