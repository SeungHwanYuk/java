package SamsExample;

import java.util.Arrays;
import java.util.Random;

public class Java0307Q7_Q8 {
    public static void main(String[] args) {
        // 6. 아래 배열에서 입력받은 값보다 큰 수만 출력하시오
/*        int[] intList1 = {1,2,3,4,5,6,7,8,9,10};
        Scanner scan = new Scanner(System.in);
        System.out.print("0~10까지 숫자를 입력해주세요 : ");
        int num = scan.nextInt();*/
/*        for (int i = 0; i < intList1.length; i++) {
            if ( intList1[i] > num) {
                System.out.print(intList1[i] + " ");*/


        // 새로운 배열에 담기
 /*       int[] intList2 = new int[intList1.length];
            int count = 0;
            for (int i = 0 ; i <intList1.length;i++) {*/

        // 새로운 배열에 담기 : ArrayList 사용하기 !!!!!
/*            ArrayList<Integer> intList3 = new ArrayList<Integer>();
            for(int i = 0 ; i < intList1.length; i++) {
                if (intList1[i] > num ) {
                    intList3.add(intList1[i]);
                }
            }
        System.out.print(intList3.toString());*/

        // 7. 아래 배열의 총합과 평균을 구하시오
/*
        float plusAll = 0;
        int[] numberList = {12,34,56,32,84,99,73,69};
        for (int i = 0 ; i < numberList.length ; i++)
            plusAll += numberList[i];
        System.out.println(plusAll);
        float average = plusAll / numberList.length;
        System.out.println(average);
*/

        // 8. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
        // 예) hello 를  olleh 출력

     /*   Scanner scan = new Scanner(System.in);
        System.out.print("문자를 입력하세요 :");
        String inputStr = scan.nextLine();
        char[] arrChar1 = inputStr.toCharArray();
        char[] arrChar2 = new char[arrChar1.length];
        int len = arrChar2.length - 1;
        for (int i = 0; i < arrChar1.length ; i++) {
            arrChar2[len] = arrChar1[i];
            len = len -1;
        }
        System.out.println(Arrays.toString(arrChar2));*/
    }
}
