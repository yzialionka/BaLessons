package BaLessons.existedFiles;

public class Lesson4_ForEach {
    public static void main(String[] args) {
//        String[] strs = new String[]{"xxx", "yyy", "zzz", "aaa", "bbb"};
//        for (String str : strs) {
//            System.out.print(str + " ");
//
//        }
//        //самое большое число в массиве
//        int[] massive = new int[]{2, 13, 56, 745, 234, 23, 123, 123, 23, 746, 34, 234, 23, 423, 423, 4, 235, 750};
//        int max = massive[0];
//        int min = massive[0];
//        for (int i = 0; i <= massive.length - 1; i++) {
//            if (max < massive[i]) {
//                max = massive[i];
//            } else {
//            }
//        }
//        System.out.println(max);
//        int[] massive = new int[]{2, 13, 56, 745, 234, 23, 123, 123, 23, 746, 34, 234, 23, 423, 423, 4, 235, 750};
//        for (int i = 0; i <= massive.length - 1; i++) {
//            if (massive[i]%2==0) {
//                System.out.println(massive[i]);
//            } else {
//                System.out.println("Нечётное");
//            }
//        }

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 2 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

    }
}