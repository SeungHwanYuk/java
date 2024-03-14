package Java0308Scanner;

import java.util.Scanner;

public class Java0308Scanner1 {
    public static void main(String[] args) {

        // 자바에서 입력값을 받는 방법
        Scanner sc = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해주세요 : ");
        int inputNumber = sc.nextInt();

        if (inputNumber >= 0 && inputNumber <= 6) {
            System.out.println(inputNumber);
        } else {
            System.out.println("잘못 입력 하셨습니다.");
        }

        // 자바에서 문자열을 입력 받는 방법
        Scanner sc2 = new Scanner(System.in);
        System.out.print("이름을 입력해 주세요 : ");
        String inputString = sc2.nextLine();
        System.out.println(inputString);
    }
}
