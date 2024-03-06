import java.util.Arrays;

public class Java0306_3 {
    public static void main(String[] args) {
        // 길이가 10인 배열에 1부터 10까지 입력
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

        // 길이가 10인 배열에 10부터 1까지 역순으로 입력
        int[] intArray4 = new int[10];
        int len = intArray4.length;
        for (int i = 0; i < intArray4.length; i++) {
            intArray4[i] = len;
            len = len - 1;
        }
        System.out.println(Arrays.toString(intArray4));

        String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박", "사과"};
        String apple = "사과";
        int count = 0;
        for (int i = 0; i < fruitList.length; i++) {
            if (fruitList[i] == apple)
                count = count +1;
            }
            System.out.println(count);
        }
    }
