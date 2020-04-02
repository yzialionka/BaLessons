package MoreLessons;

import org.openqa.selenium.json.JsonOutput;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.sql.SQLOutput;

public class LoopsAndArrays {
    public static void main(String[] args) {

//        String[] str = new String[]{"xx", "yy", "zz"};
//        for (String x : str) {
//            System.out.println(x);
//        }


//        int[] ages = new int[]{25, 54, 2, 49, 42, 42, 4, 22, 2, 3, 23, 4, 11, 56, 23, 45};
//        int max = ages[0];
//        System.out.println(ages.length);
//        for (int i = 0; i < ages.length; i++) {
//            if (ages[i] > max) {
//                max = ages[i];
//            }
//        }
//        System.out.println(max);

//        int[] yy = new int[]{10,15,12,7,88,10,6,17,23,10,10,16};
////        for (int i = 0; i<yy.length;i++ ){
////            if(yy[i]==10){
////                System.out.println(i);
////            }
////        }
//        for (int i:yy
//             ) {if(i%4==0)
//            System.out.println(i);
//        }

        int[] array = new int[]{10, 15, 12, 7, 88, 10, 6, 17, 23, 10, 10, 16};
        int i = 0;
        for (int number : array
        ) {
            if (number == 10) {
                System.out.println(i);
            }
            i++;
        }


    }
}
