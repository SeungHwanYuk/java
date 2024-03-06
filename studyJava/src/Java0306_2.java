import java.util.Arrays;

public class Java0306_2 {
    public static void main(String[] args) {
        // 문자열 수정
        // @.toLowerCase() = 영문 문자를 모두 소문자로 변환한다.
        // @.toUpperCase() = 영문 문자를 모두 대문자로 변환한다.
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); // java study
        System.out.println(str1.toUpperCase()); // JAVA STUDY

        // @.replace() = 일부 문자열을 다른 문자열로 대체한다.
        System.out.println(str1.replace("Study", "공부")); // Java 공부 = "Study" 문자열을 "공부"로 변경
        System.out.println(str1.replace("bye", "공부")); // Java Study = Study를 못찾으면 변경하지않고 원본 그대로 둠

        // @.substring() = 문자열의 일부만을 포함하는 새로운 문자열 객체를 생성한다.
        System.out.println(str1.substring(0,5)); // Java <== (0 <= 인덱스 < 5) 의 문자열
                                                 // * 프로그래밍에선 시작범위 0 은 포함, 끝범위 5는 포함시키지 않는다

        // @.split() = 특정 기호를 기준으로 문자열을 분리한다.
        // *** split 메소드의 리턴형은 String[] 즉 문자열의 배열이다.
        String[] strArray = "Name:Michael/Man".split(":|/"); // [Name, Michael, Man] = 연산자를 이용하여 ':' 와 '/' 기준으로 분리시킴
        System.out.println(Arrays.toString(strArray));             // 분리된 것은 배열로 취급되므로 사전에 배열형으로 만들어줘야함 (String[])

        // "앞뒤" 공백지우기
        String _str1 = "   abc def   ";
        _str1 = _str1.trim();
        System.out.println(_str1);

        // 모든 공백 지우기
        System.out.println(_str1.replaceAll(" ", ""));
                                                               // 문자를 '없는것'으로 표현할 때 "" (" "와 같은 공백도 문자로 인식하기 때문)
    }
}
