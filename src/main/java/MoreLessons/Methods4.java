package MoreLessons;

public class Methods4 {
    public static void main(String[] args) {

        System.out.println(cyl(10, 10));

    }

    private static double sqR(double radius){
        return Math.PI*radius*radius;
    }

    private static double cyl (double radius, double height){
        double sq = sqR(radius);
        return sq*height;
    }
}
