package SamsExample;

public class Java0311Test {


    public Java0311Test() {
    }

    public static void main(String[] args) {
        print();
        print(3);
        print(5.8);
        print("안녕");
    }

    public static void print() {
        System.out.println("데이터가 없습니다");
    }

    public static void print(int a) {
        System.out.println("정수 입력값 :" + a);
    }

    public static void print(double a) {
        System.out.println("실수 입력값 :" + a);
    }

    public static void print(String a) {
        System.out.println("문자열 입력값 :" + a);
    }
}

