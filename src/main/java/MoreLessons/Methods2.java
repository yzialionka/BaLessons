package MoreLessons;

public class Methods2 {
    public static void main(String[] args) {

//        double sphere1 = getSpheraVolume(0.5);
//        double sphere2 = getSpheraVolume(26.4);
//        System.out.println(sphere1);
//        System.out.println(sphere2);


        getSum(2, 6, 1 );
        System.out.println(getSum1(4,14,7));

    }

    public static double getSpheraVolume(double radius) {
        return Math.PI * radius * radius * radius;
    }

    public static void getSum(int a, int b, int c) {
        System.out.println("Sum is: " + (a + b + c));
    }

    public static int getSum1(int a, int b, int c) {
        return a+b+c;
    }
}
