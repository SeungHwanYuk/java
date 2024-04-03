package Java0403Lambda;

interface CC {
    MyClass method();
}
interface CC2 {
    MyClass method(int k);
}


class MyClass {
    int k;
    MyClass() {
        System.out.println("MyClass 기본 생성자");
    }
    MyClass(int k) {
        System.out.println("매개변수 생성자" + k );
        this.k = k;
    }
}
public class ClassConstructor {
    public static void main(String[] args) {
        // 함수 인터페이스 메서드가 외부클래스를 리턴하는 경우
        // 메서드 내에서 외부클래스의 생성자를 이용하여 객체를 생성해야함
        CC a1 = new CC() { // 익명 이너클래스 (축약 전)
            @Override
            public MyClass method() {
                return new MyClass();
            }
        };
        CC a2 = () -> new MyClass(); // 람다식 단축형 1
        CC a3 = MyClass::new; // 람다식 단축형 2
        a3.method(); // 기본 생성자

        CC2 c2 = (int k) -> new MyClass(k); // 매개변수 생성자를 출력하려면
        CC2 c3 = MyClass::new; // 인터페이스 CC 내의 method()가 비어 있기에 축약되면서 타입을 선언할 공간이 없어짐
        c3.method(5); // 새로운 인터페이스 CC2 내의 method()에 int타입이 선언되었으므로 매개변수 생성자 출력이 가능해진다
    }
}
