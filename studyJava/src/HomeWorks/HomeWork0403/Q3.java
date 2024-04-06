package HomeWorks.HomeWork0403;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        // 사용자로부터 문자열 5개를 입력받아 컬렉션 구현체에 저장하고
        // 저장된 문자열들을 화면에 출력하시오.
        // 단, 중복 문자열은 저장하지 말아야 함

        // 여기 코드 작성 !!
        ArrayList<String> str = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
//        String inputStr = sc.nextLine();
//        str.add(inputStr);

        for (int i = 0; i < 5; ) {
            String inputStr = sc.nextLine();
            for (int j = 0; true; j++) {
                if (str.get(j).equals(inputStr)) {
                    j = 0;
                    System.out.println("중복");
                    inputStr = sc.nextLine();
                } else {
                    if (!str.get(j).equals(inputStr)) {
                        str.add(inputStr);
                        i++;
                        break;
                    }
                }
                System.out.println(str);
            }
        }
    }
}

















//
//        for (int i = 0; i < strArray.length; ) {
//            inputStr = sc.nextLine();
//            for (int j = 0 ; j < strArray.length ; j++) {
//                if(!strArray[j].equals(inputStr)) {
//                    strArray[i] = inputStr;
//                    i++;
//                    break;
//                }else {
//                    System.out.println("중복된 값을 입력함");
//                    i=i-1;
//                    j=6;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(strArray));
//    }
//}
