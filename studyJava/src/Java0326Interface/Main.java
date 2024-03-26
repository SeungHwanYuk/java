package Java0326Interface;

public class Main {
    public static void main(String[] args) {
        ChildA a = new ChildA();
        a.abc();
        a.bcd();
        System.out.println(A.a);
        System.out.println(B.a);

        // 인터페이스 생성방법 1
        // 자식 클래스 (ChildA)를 선언하고 해당 인터페이스를 상속하게 하면
        // 아래와 같이 동일한 코드 내용 (=메서드 오버라이딩 내용)을 계속해서 사용할 수 있음
        ChildA c2 = new ChildA();
        ChildA c3 = new ChildA();
        ChildA c4 = new ChildA();

        // 인터페이스 생성방법 2
        // 익명 이너클래스 생성
        // 방법 1에서와 같이 재사용할 수 있는 클래스 이름이 없으므로
        // 동일한 코드 내용 (=메서드 오버라이딩 내용)을 매번 복사, 붙여넣기 해야함
        A a2 = new A() {
            public void abc() {
                System.out.println("나는 익명 이너클래스");
            }
        };
        A a3 = new A() {
            public void abc() {
                System.out.println("나는 익명 이너클래스");
            }
        };
        A a4 = new A() {
            public void abc() {
                System.out.println("나는 익명 이너클래스");
            }
        };
        a2.abc();
        a3.abc();
        a4.abc();
    }
}
