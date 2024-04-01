package Java0401Generic;


class AA {
    public <T extends Number> void method1(T t) {  // Number는 wrapper 클래스의 부모 (숫자)
        System.out.println(t.doubleValue());  // Number를 상속받았으므로 Object의 메소드 외에 다른 클래스의 메소드를 상속받아 사용가능
    }
}

class CC implements MyInterface {  // 인터페이스의 구현체
    @Override
    public void print() {
        System.out.println("print() 구현2");
    }
}

interface MyInterface {
    public abstract void print();

}
class BB {
    public <T extends MyInterface> void method1(T t) {
        // 사용자가 정의한 MyInterface의 자식만 제네릭T의 위치에 올 수 있음
        // 이렇게 정의 함으로써 사용자 정의 메서드인 print()를 사용할 수 있게 됨
        t.print();
    }
}

public class GenericMethodExtends {
    public static void main(String[] args) {
        AA a = new AA();
        a.method1(5.8);  // <Double>

        BB b = new BB();
        b.method1(new MyInterface() { // 1) 익명 이너 클래스 사용한 경우
            @Override
            public void print() {
                System.out.println("print() 구현");
            }
        });
        b.method1(new CC());  // 2) MyInterface의 구현체를 사용한 경우
    }
}
