package Entity0328;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        // 유저 , 강의 , 수강관리 클래스 생성 > ArrayList 담기
        // 강의 1번 수강생의 loginId찾기
        // 유저의 loginId로 강의명 찾기
        public static void main(String[] args) {


                User tom = new User("T", "Tom", "Male", 20, 3, "Seoul"
                        , "asd123", "123asd", LocalDate.of(2003, 3, 23));
                User jessi = new User("J", "Jessi", "Male", 24, 6, "Seoul"
                        , "jess123", "123jess", LocalDate.of(1999, 12, 12));
                User yami = new User("Y", "Yami", "Used Male", 1, 1, "Ohjungdong"
                        , "iamcat", "notdog", LocalDate.of(2023, 6, 6));
                User steve = new User("S", "Steve", "Male", 30, 3, "Daejeon"
                        , "steve123", "123steve", LocalDate.of(1993, 1, 1));
                User maria = new User("M", "Maria", "Female", 25, 6, "Daejeon"
                        , "marry123", "123marry", LocalDate.of(1998, 2, 1));


                Lecture magicOfMath = new Lecture(1, "'Magic of Math'", "Voldmote"
                        , "60min", 3, "Math");
                Lecture howToCount10 = new Lecture(2, "'How To Easier counting to Ten'"
                        , "Kim SuJwong", "10sec", 1, "Math");
                Lecture doItJava = new Lecture(3, "'Do it! Real Edits for Java Tutorial'"
                        , "Seo HyungWon", "50min", 6, "PC");
                Lecture figmapigma = new Lecture(4, "'Figma Pigma'", "Cheon An"
                        , "30min", 1, "PC");


                ArrayList<Lecture> lectures = new ArrayList<>();
                Lecture lecture1 = new Lecture();


                ArrayList<LectureRegistration> lectureRegistrations = new ArrayList<>();
                LectureRegistration lectureRegistration1 = new LectureRegistration(tom.getUserLoginId(), magicOfMath.lectureId, magicOfMath.getLectureName());
                lectureRegistrations.add(lectureRegistration1);
                LectureRegistration lectureRegistration2 = new LectureRegistration(jessi.getUserLoginId(), howToCount10.lectureId, howToCount10.getLectureName());
                lectureRegistrations.add(lectureRegistration2);
                LectureRegistration lectureRegistration3 = new LectureRegistration(yami.getUserLoginId(), doItJava.lectureId, doItJava.getLectureName());
                lectureRegistrations.add(lectureRegistration3);
                LectureRegistration lectureRegistration4 = new LectureRegistration(steve.getUserLoginId(), magicOfMath.lectureId, magicOfMath.getLectureName());
                lectureRegistrations.add(lectureRegistration4);
                LectureRegistration lectureRegistration5 = new LectureRegistration(maria.getUserLoginId(), doItJava.lectureId, doItJava.getLectureName());
                lectureRegistrations.add(lectureRegistration5);

                System.out.println("1. 'Magic of Math' , Voldmote 교수님");
                System.out.println("2. 'How To Easier counting to Ten' , Kim SuJwong 교수님");
                System.out.println("3. 'Do it! Real Edits for Java Tutorial' , Seo HyungWon 교수님");
                System.out.println("4. 'Figma Pigma' , Cheon An 교수님");
                System.out.println();


                Scanner sc = new Scanner(System.in);
                System.out.print("찾고자하는 수강생의 강의실번호를 입력하세요 : ");
                int inputNumber = sc.nextInt();


    /*            ArrayList<LectureList> lectureList = new ArrayList<>();
                LectureList lectureList1 = new LectureList(magicOfMath.getLectureName(), "asd123");
                lectureList.add(lectureList1);
                LectureList lectureList2 = new LectureList(howToCount10.getLectureName(), "jess123");
                lectureList.add(lectureList2);
                LectureList lectureList3 = new LectureList(doItJava.getLectureName(), "iamcat");
                lectureList.add(lectureList3);
                LectureList lectureList4 = new LectureList(figmapigma.getLectureName(), null);
                lectureList.add(lectureList4);

                System.out.println(lectureRegistrations.get(0).getLectureId());
                String g;
                for (int i = 0; i < lectureRegistrations.size(); i++) {
                        if (lectureRegistrations.get(i).userId == "asd123") {
                                g = lectureRegistrations.get(i).userId;
                                System.out.println(g);
                                for (int j = 0; j < lectureList.size(); j++) {
                                        if (g == lectureList.get(j).userName) {
                                                System.out.println(lectureList.get(j).getLectureName());

*/

                for (int i = 0; i < lectureRegistrations.size(); i++) {
                        if (lectureRegistrations.get(i).lectureId == inputNumber) {
                                System.out.println(lectureRegistrations.get(i).getUserId());
                        }
                }


                Scanner sc1 = new Scanner(System.in);
                System.out.print("수강생의 아이디를 입력하세요 : ");
                String inputString = sc1.nextLine();

                String g;
                for (int i = 0; i < lectureRegistrations.size(); i++) {
                        if (inputString.equalsIgnoreCase(lectureRegistrations.get(i).userId)) {
                                g = lectureRegistrations.get(i).userId;
                             /*   for (int j = 0; j < lectureRegistrations.size(); j++) {
                                        if (g == lectureRegistrations.get(j).userId) {*/
                                                System.out.println(lectureRegistrations.get(i).getLecName());
                                        }
                                }
                        }
                }





