public class Java0305_quiz2 {
    public static void main(String[] args) {
        // 다음과 같이 출력되도록 if문과 break,continue를 이용해 for문 코드를 완성하시오
        // 0 , 2, 4 ,6 , 8, 10
        for (int i = 0; ; i++) {
            if (i == 1)
                continue;
            if (i == 3)
                continue;
            if (i == 5)
                continue;
            if (i == 7)
                continue;
            if (i == 9)
                continue;
            if ( i == 11)
                break;
            System.out.println(i);
            }
        }
    }
