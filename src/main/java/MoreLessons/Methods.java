package MoreLessons;

public class Methods {
    public static void main(String[] args) {
//        hi();       //invoke or call
//        hello();
//
//        for (int i = 0; i < 7; i++) {
//            if (i % 2 == 0) {
//                hi();
//            } else {
//                hello();
//            }
//        }
//
//        int x = someAction(10);
//        System.out.println(x);
        circleLenght(10);

    }

    //declaration
    public static void hi() {
        System.out.println("Hi!");
    }

    public static void hello() {
        System.out.println("Hello!");
    }

    public static int someAction(int a) {
        return a * a - 5;
    }

    public static void circleLenght(int radius){
        System.out.println(radius*2*Math.PI);
    }
}
