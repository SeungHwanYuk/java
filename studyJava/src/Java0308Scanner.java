import java.util.Scanner;

public class Java0308Scanner {
    public static void main(String[] args) {
        // 양의점수 10개를 입력  Scanner 입력 sc.nextInt for문으로 열번
        // 배열에 담는다
        // 3의 배수만 출력
        for(int i = 0 ; i < 11 ; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("양의 정수 10개를 입력 :");
            System.out.println( i +"개 입력하셨습니다");
            int[] numArr = new int[sc.nextInt()];
            boolean found = false;

        for (int j = 0 ; j < numArr.length;j++){
            if (numArr[j] % 3 == 0) {
                found = true;
            }


        }


        }


    }
}
