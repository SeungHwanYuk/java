package SamsExample;

import java.util.Arrays;

public class Java0315Ex1 {
    public static void main(String[] args) {

        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님
        String str = "This is a really simple sentence";

        str = str.toLowerCase();

        char[] vowelArr = {'a','e','i','o','u'};

        char[] consonantArr = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z', 'w', 'y',};
        char[] strCharArr = str.toCharArray();
//        System.out.println(Arrays.toString(consonantArr));
//        System.out.println(Arrays.toString(strCharArr));


        int consCount = 0;
        int vowelCount = 0;
        for (int i = 0; i < strCharArr.length; i++) {

            for (int j = 0 ; j < vowelArr.length; j++) {
                if (vowelArr[j]==strCharArr[i]) {
                    vowelCount = vowelCount + 1;
                    break;
                }
            }
        }
        System.out.println(consCount);
        System.out.println(vowelCount);
    }
}