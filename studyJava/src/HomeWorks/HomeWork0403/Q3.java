package HomeWorks.HomeWork0403;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        // 사용자로부터 문자열 5개를 입력받아 컬렉션 구현체에 저장하고
        // 저장된 문자열들을 화면에 출력하시오.
        // 단, 중복 문자열은 저장하지 말아야 함

        // 여기 코드 작성 !!
        ArrayList<String> tempStrList = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세요.");
        for (int i = 0; result.size() < 5 ; i++) {
            String inputStr = sc.nextLine();
            System.out.println((result.size()+1) + "개 입력하셨습니다. "+ (result.size()+1) + "/5");
            tempStrList.add(inputStr);
            for (String str : tempStrList) {
                if (!result.contains(str)) {
                    result.add(str);
                }
                }
            }
        System.out.println(result);
        }
    }
    // 주말 사이에 몇 시간동안 짜봤는데 막히는 부분이 너무 많아서 구글에 ArrayList 중복 제거하는 법을
    // 검색, 참고하여 contain 추가로 겨우 만들었습니다....ㅠㅠ




//        for (int i = 0; i < 5; ) {
//            String inputStr = sc.nextLine();
//            for (int j = 0; true; j++) {
//                str.add(inputStr);
//                if (!str.get(j).equals(inputStr)) {
//                    str.add(inputStr);
//                    i++;
//                    break;
//                } else {
//
////                    if (!str.get(j).equals(inputStr)) {
//                    System.out.println("중복");
//                    inputStr = sc.nextLine();
//                    }
//                }
//                System.out.println(str);
//            }
//        }
//    }



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
