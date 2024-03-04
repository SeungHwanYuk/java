public class Java0304 {
    public static void main(String[] args) {
/*        for (초기식; 조건식; 증감식) {
            System.out.println(i);
        }
        // 무한루프 조건식이 false 가 될 수 있는지 여부를 반드시 확인
        for (int i=0 ; i>=0; i++){
            System.out.println(i);
            break;
           // 상황에 따라 break 키워드 사용 가능 (조건식을 정수로 판단할 수 없을 때)
        }
*/
        /*
        for문을 풀어 써본다면?
        for ( ; ; ) {
            if (a <5){
                System.out.print(a + " ");
                a++;
            } else {
                break;
            }
        }
        */

        int a; // for문의 반복횟수를 지정하는 변수를 외부에서 선언
        for (a = 0; a < 3; a++) {
            System.out.print(a + " ");
        }

        System.out.println();
        // for문의 반복 횟수를 지정하는 변수를 초기식에서 선언
        for (int i = 0; i < 3; i++ ){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i=0 ; i<100 ;i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i =10; i>0;i--){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i =0; i<10;i += 2){
            System.out.print(i + " ");
        }
        System.out.println();

        // 다수의 초기식도 사용 가능 (쉼표 사용)
        for (int c = 0,d = 0 ; c < 5 || d<5 ; c++, d++){
            System.out.print(c + "_" + d +" ");
        }
        /*
        for (int i = 0;  ; i++ ) {
            System.out.print(i + " ");
        }
        for(;;){
        System.out.print("무한 루프")
        }
        */
        System.out.println();

        for (int i =0 ;  ; i++) {
            if (i> 10) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("무한 루프 탈출");

        //while 문
        int count = 0; //초기식
        while (count < 5) { //조건식
            System.out.print(count + " ");
            count++; // 증감식
        }
        System.out.println();

        //의도적인 무한루프에서 while문은 자주 쓰임
      /*  while (true) {
            // 무한루프
            // 유저가 버튼 클릭할때 까지 대기
            // if (esc버튼 클릭)
            // break;
        }
        */

        // do ~ while 문
        int cnt1 = 5; // 초기식
        do {
            System.out.print(cnt1 + " ");
            cnt1++;
        } while (cnt1 < 5);
        // while 문과 비교하면 ,
        // 반복문의 조건이 처음부터 flase인 경우,
        // do~ while문은 실행코드가 1회 실행되는 반면, while문은 실행되지 않음.
        int cnt2 = 5;
        while (cnt2 < 5) {
            System.out.print(cnt2 + " ");
            cnt2++;
        }
        System.out.println();

        //이중 루프, 이중 반복문
        for ( int k=0; k<3; k++) {
            for (int j=0 ; j<5 ; j++) {
                System.out.println("[k=" + k + ",j="+j + "]");
            }
        }
    }
}