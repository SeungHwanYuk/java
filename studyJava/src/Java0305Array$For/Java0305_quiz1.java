package Java0305Array$For;

import java.util.Arrays;

public class Java0305_quiz1 {
    public static void main(String[] args) {
//        다음 코드의 출력 결과물을 쓰시오
        double[] a1 = {1.2,3.4,5.6};
        double[] b1 = a1;
        b1[0] = 7.8;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(b1));

//        실행 결과를 쓰시오
        String a = "방가";
        String b = new String("방가");
        String c = "방가";
        String d = new String("방가");
        String e = "방가";
        String f = new String("방가");

        System.out.println( a==b);
        System.out.println( a==c);
        System.out.println( a==d);
        System.out.println( a==e);
        System.out.println( a==f);
        System.out.println();

        System.out.println( b==c);
        System.out.println( b==d);
        System.out.println( b==e);
        System.out.println( b==f);


    }
}
