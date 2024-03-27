package SamsExample.Java0326;

import java.util.ArrayList;
import java.util.Arrays;

public class StrSumExample {

    // 문자열 "12345"의 각 자리에 있는 숫자를 더하는 코드를 완성하시오
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        int intValue = Integer.parseInt(str);




        int[] intArray = new int[str.length()];
        for (int i =0;i <intArray.length;i++) {
           sum= sum+ str.charAt(i) - '0';
        }
        System.out.println(sum);




        /*System.out.println("합계는 " + sum); // 15*/
    }
}
