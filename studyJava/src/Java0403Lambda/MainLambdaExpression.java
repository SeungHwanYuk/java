package Java0403Lambda;

interface A {
    void method1();  // 입력이 없고 리턴도 없다
}

interface B {
    void method2(int x); // 입력이 있고 리턴은 없다
}

interface C {
    int method3(); // 입력은 없고 리턴이 있다
}

interface D {
    double method4(int x, double y); // 입력이 있고 리턴도 있다
}

public class MainLambdaExpression {
    public static void main(String[] args) {
        A a0 = new A(){  // 익명 이너 클래스 (축약 전)
            public void method1(){
                System.out.println("pattern 1");

            }
        };
        a0.method1();

        A a = () -> System.out.println("pattern 1");  // 람다식 단축형 (축약 후)
        a.method1();

        B b = (int x) -> System.out.println("pattern 2 : " + x);
        B b1 = (x) -> System.out.println("pattern 2 : "+ x);
        B b2 = x -> System.out.println("pattern 2 : "+ x);  // 매개변수가 하나인 경우만 소괄호 삭제
        b2.method2(5);

        C c = () -> { return 4; };  // return이 있으므로 중괄호가 필요
        C c1 = () -> 4;  // return을 생력하려면 중괄호도 같이 생략
        System.out.println(c1.method3());

        D d = (int x, double y) -> { return x + y;};
        D d1 = (int x, double y) -> x+y;
        D d2 = (x,y) -> x+y;
        System.out.println(d2.method4(10,5.5));
    }
}
