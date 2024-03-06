import java.util.Arrays;
import java.util.Scanner;

public class Java0306_3 {
    public static void main(String[] args) {
        // Q1 길이가 10인 배열에 1부터 10까지 입력
        int[] intArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(intArray1[3]);

        int[] intArray2 = new int[10];
        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;
        intArray2[3] = 4;
        intArray2[4] = 5;
        intArray2[5] = 6;
        intArray2[6] = 7;
        intArray2[7] = 8;
        intArray2[8] = 9;
        intArray2[9] = 10;
        System.out.println(intArray1[3]);

        int[] intArray3 = new int[10];
        for (int i = 0; i < 10; i++) {
            intArray3[i] = i + 1;
        }
        System.out.println(Arrays.toString(intArray3));

        // Q2 길이가 10인 배열에 10부터 1까지 역순으로 입력
        int[] intArray4 = new int[10];
        int len = intArray4.length;
        for (int i = 0; i < intArray4.length; i++) {
            intArray4[i] = len;
            len = len - 1;
        }
        System.out.println(Arrays.toString(intArray4));

        // Q3
        String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박", "사과"};
        String apple = "사과";
        int count = 0;
        for (int i = 0; i < fruitList.length; i++) {
            if (fruitList[i] == apple)
                count = count + 1;
        }
        System.out.println(count);

        // 자바에서 입력값을 받는 방법
     /*   Scanner sc = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해주세요 : ");
        int inputNumber = sc.nextInt();

        if ( inputNumber >= 0 && inputNumber <= 6) {
            System.out.println(inputNumber);
        } else {
            System.out.println("잘못 입력 하셨습니다.");
        }

        // 자바에서 문자열을 입력 받는 방법
        Scanner sc2 = new Scanner(System.in);
        System.out.print("이름을 입력해 주세요 : ");
        String inputString = sc2.nextLine();
        System.out.println(inputString);
        */

        // Q4 사용자로부터 0~6까지 숫자를 입력받아 아래  배열에해당하는 요일을 출력

     /*   char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        Scanner scan = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해 주세요 :");
        int num = scan.nextInt();
        for (int i = 0 ; i <= week.length ; i++ ) {;
            if (num >= 0 && num <= 6 ) {
                System.out.print(123123);
            } else {
                System.out.print(33);
            }

*/

        // Q5 사용자로부터 이름을 입력받아 아래 회원 배열에 있는 이름이면
        // "~~~님 환영합니다"를 출력하고
        // 없으면 "회원가입해주세요"를 출력

        String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
            Scanner scan2 = new Scanner(System.in);
        System.out.print("사용자의 이름을 입력하세요 :");
        String inputStr = scan2.nextLine();

        for (int i = 0 ; i <= members.length ; i++ ) {
            if ()) {
                System.out.print
                break;
            } else {
                System.out.print("회원가입해주세요");
            }
        }
    }
}

