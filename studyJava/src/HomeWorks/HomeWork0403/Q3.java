package HomeWorks.HomeWork0403;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        // 사용자로부터 문자열 5개를 입력받아 컬렉션 구현체에 저장하고
        // 저장된 문자열들을 화면에 출력하시오.
        // 단, 중복 문자열은 저장하지 말아야 함

        // 여기 코드 작성 !!
        String[] strArray = new String[5];
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        strArray[0] = inputStr;
        for (int i = 1; i < strArray.length-1; ) {
            strArray[i] = inputStr;
            for (int j = 0 ; ;j++) {
                if(strArray[i].equalsIgnoreCase(strArray[i+1])) {
                    strArray[i+1] = new String();
                    System.out.println("중복된 값을 입력함");
                    i = i=0;
                }else {
                    strArray[j] = inputStr;
                    i=i+1;
                }
            }
        }
        System.out.println(Arrays.toString(strArray));
    }
}
