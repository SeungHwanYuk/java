package Java0327Exception;


class MyException extends Exception {
    // 1. 사용자 일반 예외
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }
}

class MyRTException extends RuntimeException {
    // 2. 사용자 실행 예외
    public  MyRTException() {
        super();
    }
    public  MyRTException(String message) {
        super(message);
    }
}

class A {
    // 3. 사용자 정의 예외 객체 생성
    MyException me1 = new MyException();
    MyException me2 = new MyException("예외 메시지 : MyException");

    MyRTException mre1 = new MyRTException();
    MyRTException mre2 = new MyRTException("예외 메시지 : MyRTException");

    // 4. 예외 던지기 (throw) : 던진 시점에서 예외 발생
    // 방법 a. 예외를 직접 처리
    void abc_1(int num) {
        try {
            if (num > 70)
                System.out.println("정상 작동");
            else
                throw new MyException("나이가 70이하임 : "+num);  // 예외를 던진 시점에 예외 발생
        } catch (MyException e) {
            System.out.println("예외 처리 1");
            System.out.println(e.getMessage());
        }
    }
    void  bcd_1() {
        abc_1(65);
    }
    // 방법 b. 예외 전가
    void abc_2(int num) throws MyException {
        if (num>70)
            System.out.println("정상 작동");
        else
            throw me1;
    }
    void bcd_2() {
        try {
            abc_2(65);
        } catch (MyException e) {
            System.out.println("예외 처리 2");
        }
    }
}
public class CreateUserException {
    public static void main(String[] args) {
        A a = new A();
        a.bcd_1();
        a.bcd_2();
    }
}