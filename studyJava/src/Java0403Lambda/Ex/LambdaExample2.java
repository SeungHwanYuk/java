package Java0403Lambda.Ex;

import java.util.ArrayList;
import java.util.List;

interface Condition {
    boolean test(String str);
}

public class LambdaExample2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Grape");
        strings.add("Orange");
        strings.add("Kiwi");

        // 길이가 5 이상인 문자열을 필터링하는 기능
        System.out.println("길이가 5 이상인 문자열 : ");
        filterAndPrint(strings, (str) -> str.length() > 5);

        // 문자열이 'a'로 시작하는 아이템을 필터링하는 기능
        System.out.println("a로 시작하는 문자열 : ");
        filterAndPrint(strings, (str) -> str.startsWith("A"));
    }
    public static void filterAndPrint(List<String> items, Condition condition){
        for(String item : items) {
            if (condition.test(item)) {
                System.out.println(item);
            }
        }
        // 항수형 프로그래밍으로 반복문을 처리하는 예시 (결과는 위와 동일)
        items.stream().filter(condition::test).forEach(System.out::println);
        // stream() : 컬렉션을 순서대로 공급(반복)해주는 컬렉션 메서드
        // filter() : 참과 거짓의 결과가 나옴 ( true인 값만을 배열로 입력 )
        // forEach() : filter의 배열(true인 컬렉션)을 for문으로 돌려서 ()안의 내용 실행
    }
}
