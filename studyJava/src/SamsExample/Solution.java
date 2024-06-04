package SamsExample;

public class Solution {
    //    public static void main(String[] args) {
//        System.out.println('\uC120'+""+'\uC0DD'+""+'\uB2D8');
//
//        System.out.println('\uAC10'+""+'\uC0AC'+""+'\uD574'+""+'\uC694');
//    }

    public static int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                answer = answer + 1;
            }
        }
        return answer;
    }


    public static int solution2(int price) {
        int answer = 0;
        double num = 0;
        if (price >= 150000 && price < 300000) {
            num = price * 0.95;
        }
        if (price >= 300000 && price < 500000) {
            num = price * 0.90;
        }
        if (price >= 500000) {
            num = price * 0.80;
        }
        answer = (int) num;

        return answer;
    }

        public double solution(int[] numbers) {
            double answer = 0;
            int temp = 0;
            for(int i = 0 ; i < numbers.length ; i++) {
                temp = temp + numbers[i];
            }
            answer = temp / numbers.length;
            return answer;
        }

    public int solution(int angle) {
        int answer = 0;
        if (angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        } else {
            answer = 0;
        }
        return answer;
    }




    

    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(solution2(580000));
    }
}



