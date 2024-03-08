public class Java0308Class {
    public static void main(String[] args) {
        Students tom = new Students("Tom",18,"Daejeon","123456");
        Students steve = new Students("Steve", 25,"Seoul","246810");
        Students paul = new Students();// 기본생성자의 null이 출력되지만,
//        paul.name = "paul";           // 클래스 밖의 main 안에서도 직접 할당 가능
//        paul.age = 22;                // 단 , getter 사용 불가능
//        paul.address = "Incheon";

        // getter , setter
        paul.setName("Paul");
        paul.setAge(22);
        paul.setAddress("Incheon");
//        tom.personalNum() = "323123"; // 필드에서 setter를 지워서 수정이 불가능한 수치를 만들수 있다. (주민번호 등)

        tom.displayAll();
        steve.displayAll();
        paul.displayAll();
        System.out.println(tom.getPersonalNum());

        // 메소드 호출
        int[] numberList = {12,34,56,32,84,99,73,69};
        int[] numberList2 = {15,15,15,125,125,125,125};
        getSumAvr(numberList);
        getSumAvr(numberList2);
    }
    // 지역 변수
     public static void getSumAvr(int[] numberList) {
         // 7. 아래 배열의 총합과 평균을 구하시오
        float plusAll = 0;
//        int[] numberList = {12,34,56,32,84,99,73,69};
        for (int i = 0 ; i < numberList.length ; i++)
            plusAll += numberList[i];
        System.out.println(plusAll);
        float average = plusAll / numberList.length;
        System.out.println(average);
     }

}
