public class Java0305String {
    public static void main(String[] args) {
        // String 클래스의 첫번째 특징
        // 값의 변경이 불가능한 대신 새로운 주소에 새로 쓴다
        String str1 = new String("안녕");
        String str2 = str1;
        // str2 = str1 "리터럴" 형태로 값 변경시 새로운 메모리 위치에 생성
                    //  리터럴 = 변수의 값이 변하지 않는 데이터(메모리 안의 위치값)
                    //        = 리터럴로 입력되는 값은 런타임 이전(컴파일 타임)에 이미 메모리에 만들어짐
                    //      ex) ()괄호를 쓰지않고 직접 입력 str1
        str1 = "안녕하세요";
        System.out.println(str1);
        System.out.println(str2);

        // String 클래스의 두번째 특징
        // "리터럴"로 입력하는 경우 해당 문자열을 공유
        String str3 = "Start";
        String str4 = "Start";
        String str5 = new String("Start");
        System.out.println(str3 == str4); // 번지수가 같으므로 true
        System.out.println(str4 == str5); // 번지수가 다르므로 false

        System.out.println();

        // 문자열의 '+' 연산
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + " " + s2);

        // 문자열과 숫자의 '+' 연산
        System.out.println(1+ "Hi");
        System.out.println(1+2+ "Hi");
        System.out.println("Hi"+ 1+2);
    }
}
