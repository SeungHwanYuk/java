package HomeWorks.HomeWork0403;

import java.util.Arrays;
import java.util.Locale;

public class Q1 {
    public static void main(String[] args) {
        // String 문자열의 소문자는 대문자로, 대문자는 소문자로 변경시킨
        // String 문자열을 리턴하는 메서드(changeCase)를 완성하시오
        String str = "cHanGe CasE";
        String result = changeCase(str);
        System.out.println(result); // ChANgE cASe
    }

    public static String changeCase(String str) {
        char[] strToChar = str.toCharArray();
        char[] strToCharLower = str.toLowerCase().toCharArray();
        char[] strToCharUpper = str.toUpperCase().toCharArray();
        char[] result = new char[strToChar.length];
//        System.out.println(Arrays.toString(strToChar));
//        System.out.println(Arrays.toString(strToCharLower));
//        System.out.println(Arrays.toString(strToCharUpper));
        for (int i = 0; i < str.length(); i++) {
            if (strToChar[i]!=strToCharLower[i]) {
                result[i] = strToCharLower[i];
            } else {
                result[i] = strToCharUpper[i];
            }
        }
        System.out.println(result);

//        String[] strings = new String[]{str};

        // 여기 코드 작성 !!
        return "";
    }
}