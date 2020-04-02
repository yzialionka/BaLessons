package MoreLessons;

public class JavaCore {
    public static void main(String[] args) {
        int age1 = 30;
        int age2 = 65;
        int age3 = 8;
        int price = 1000;
        double price1 = getPrice(age1);
        double price2 = getPrice(age2);
        double price3 = getPrice(age3);

        System.out.println(price1);
        System.out.println(price2);
        System.out.println(price3);
    }

    public static double getPrice(int age) {
        int price = 1000;
        double finalPrice = 1000;
        if (age > 12) {
            if (age > 62) {
                finalPrice = price * 0.8;
            } else {
                finalPrice = price * 1;
            }
        } else {
            if (age < 2) {
                finalPrice = price * 0;
            } else {
                finalPrice = price * 0.6;
            }
        }
        return finalPrice;
    }
}
