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
    }
}


