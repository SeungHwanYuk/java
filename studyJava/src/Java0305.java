public class Java0305 {
    public static void main(String[] args) {
        // break = 제어문의 중괄호를 탈출시키는 키워드
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i > 5) {
                break;
            }
        }
        System.out.println();


        // 이중 for 문에서의 브레이크 사용법
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    i = 999999; // 매우 큰 수를 넣어서 바깥 for문 탈출
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println();

        //바깥 for 문까지 탈출하는 방법
        out:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    break out; // out 은 특별한 의미가 있진 않으므로 (aaa:)등으로 사용가능
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println();

        // coutinue 사용법
        for ( int i= 0 ; i < 10 ; i++) {
            if ( i %2 == 1) { // 홀수의 경우 아래 출력문을 실행하지 않음
                continue;
            }
            System.out.println(i);

        }
        System.out.println();

        for (int i=0; i<5 ;i++) {
            for (int k = 0 ;  k < 5 ; k++) {
                if ( k == 3) {
                    continue; // continue는 모든 반복을 실행하되, 단지 코드실행을 하지 않는다
                }
                System.out.println(i + " "+ k);
            }
        }
    }
}