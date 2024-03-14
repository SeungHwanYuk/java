package Java0307Random;

import java.util.Arrays;
import java.util.Random;

public class Java0307Lotto {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] lottoList = new int[6];
        for (int i = 0; i < lottoList.length; i++) {
            int temp = rd.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lottoList[i] == temp) {
                    temp = rd.nextInt(45) + 1;
                    j = j - 1;
                }
            }
            lottoList[i] = temp;
        }
        System.out.print(Arrays.toString(lottoList));

        // 난수생성법 , Random 숫자 만드는법 !!!!!
        Random rd1 = new Random();
        int randNum1 = rd1.nextInt(45) + 1; // 0부터 입력한 (정수값 -1) 범위에서 랜덤
        int randNum2 = rd1.nextInt(45) + 1;
        int randNum3 = rd1.nextInt(45) + 1;
        int randNum4 = rd1.nextInt(45) + 1;
        int randNum5 = rd1.nextInt(45) + 1;
        int randNum6 = rd1.nextInt(45) + 1;
        int[] numlen = {randNum1, randNum2, randNum3, randNum4, randNum5, randNum6};
// for문을 다시 시작하기 위해서 이더레이터 값을 바꿔라
        for (int i = 0; i < numlen.length; i++)
            for (int j = 0; j < i; j++) {
                if (numlen[j] == numlen[i]) {
                    i = i - 1;
                }
            }
        System.out.print(Arrays.toString(numlen));
    }
}


// 선생님 답안
/*        int[] lottoList = new int[6];
        for (int i = 0; i < lottoList.length; i++) {
            int temp = rd.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lottoList[j] == temp) {
                    temp = rd.nextInt(45) + 1;
                    j = -1;
                }
            }
            lottoList[i] = temp;
        }
        System.out.print(Arrays.toString(lottoList));
    }
}*/


