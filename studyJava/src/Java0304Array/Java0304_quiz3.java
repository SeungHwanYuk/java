package Java0304Array;

public class Java0304_quiz3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                //레이블을 사용하지 않고 i=3, j=2 일 때 이중 for문을 한 번에 탈출하는 코드를 완성하시오
                if (j==2) {
                    i = 100;
                    break;
                }
                System.out.print(i + " "+j);
            }
        }
    }
}
