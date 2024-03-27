package SamsExample.Java0327;

public class Example1 {
    public static void main(String[] args) {

        // 문제 1. 아래 2차원 배열의 모든 값의 합과 평균을 구하시오
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float average = 0;
        int width = 0;
        int height = 0;

        for(int i = 0;i<arr.length;i++) {
            height = height + 1;
            for(int j = 0; j < arr[i].length;j++) {
                width = width + 1;

                total = total + arr[i][j];
            }
        }
      width = width - height;


        /*int arrTotal = arr.length * arr[0].length;*/
        int arrTotal = height + width;
        average = (float) total /arrTotal;
        System.out.println(width);
        System.out.println(height);
        System.out.println(arrTotal);
        System.out.println("total="+total);
        System.out.println("average="+average);
    }
}