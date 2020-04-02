package MoreLessons;

public class Methods3 {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 8;


        int sum = getSumOfNumbers(a, b, c);
        System.out.println(sum);
    }

    private static int getSumOfNumbers(int a, int b, int c) {
        return a + b + c;
    }
}
