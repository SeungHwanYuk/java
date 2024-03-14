package SamsExample.Java0313Example;

public class Ex2 {
    public static void main(String[] args) {
        // 아래 문자열의 글자수를 카운트
        // 스페이스는 카운트하지 마시오
        String string = "The best of both worlds";
        int count = 0;

        string = string.replaceAll(" ","");
//        System.out.println(string);
//        String[] strArr = new String[string.length()];
//        System.out.println(Arrays.toString(strArr));
        for (int i = 0 ; i < string.length(); i++) {
            count = count + 1;
        }
        System.out.println("정답 : "+count);
    }
}

