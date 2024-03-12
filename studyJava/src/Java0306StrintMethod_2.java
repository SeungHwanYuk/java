import java.util.Arrays;

public class Java0306StrintMethod_2 {
    public static void main(String[] args) {
        // 문자열의 길이
        // @.length() = 문자열의 길이를 리턴한다. 한글, 영문, 공백 구분없이 한 문자당 1개의 크기를 가짐
        //                       리턴 = 내가 입력한 값을 인지한 컴퓨터가 돌려주는 값. output
        String str1 = "Hello Java!";         // 11
        String str2 = "안녕하세요! 반갑습니다."; // 13
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println();

        // 문자열 검색
        // @.charAt() = 문자열에서 특성 인덱스에 위치해 있는 문자를 알아 낸다.
        System.out.println(str1.charAt(1)); // e  한글, 영문, 공백 구분없이 인덱스 1위치의 문자
        System.out.println(str2.charAt(1)); // 녕
        System.out.println();

        // @.indexOf() = 문자열에서 특정 문자나 특정 문자열을 앞에서부터 찾아 위치값을 알려준다.
        // @.lastIndexOf() = 뒤에서부터 찾아 알려준다.
        System.out.println(str1.indexOf('a'));                 // 7
        System.out.println(str1.lastIndexOf('a'));         // 9
        System.out.println(str1.indexOf('a',8));  // 9
        System.out.println(str1.indexOf("Java"));              // 6 문자열일경우 맨 앞글자 'J'의 위치를 알려준다
        System.out.println(str1.indexOf(" "));                 // 5
        System.out.println(str1.indexOf("bye"));               // -1 해당 문자 (열)이 없는 경우 -1 리턴
        System.out.println();

        // 문자열 변환 및 연결
        // String.valueOf() = 기본 자료형을 문자열로 바꾸는 메소드
        String str3 = String.valueOf(2.3);   // 2.3 String(문자) = 2.3(실수)는 타입이 맞지 않지만 valueOf가 바꿔줌
        String str4 = String.valueOf(false); // false
        System.out.println(str3);
        System.out.println(str4);
        System.out.println();

        // 문자열 연결
        // @.concat() = 2개의 문자열을 연결한다. '+'연산자와 동일
         String str5 = str3.concat(str4); // 2.3false
         System.out.println(str5);
        System.out.println();

         // 문자열을 byte[] 또는 char[]로 변환
         String str8 = "Hello Java!";
         String str9 = "안녕하세요";

         // 문자열 byte[] 변환
        // @.getBytes() = 문자열 ==> byte[] 변환
        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // 문자열 char[] 변환
        // @.toCharArray()
        char[] array3 = str8.toCharArray();  // [H, e, l, l, o,  , J, a, v, a, !]
        char[] array4 = str9.toCharArray();  // [안, 녕, 하, 세, 요]
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println();
    }
}
