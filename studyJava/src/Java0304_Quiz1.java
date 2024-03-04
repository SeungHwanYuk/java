public class Java0304_Quiz1 {
    public static void main(String[] args) {
        //다음 for 문과 동일한 기능을 수행하는 while 문을 작성하시오.
        for (int i = 10; i > 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        {
            int j = 10;
            while (j > 0){
                System.out.print(j + " ");
            j -= 2;}
        // while() 입력후 증감식이 아닌 실행문이 먼저 와야함
        // while(){} 중괄호 안에서 계속 돌고있기 때문에 증감식이 맨 마지막으로 가야함
        }
    }
}