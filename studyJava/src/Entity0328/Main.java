package Entity0328;

import java.time.LocalDate;
import java.util.*;

import static Entity0328.CreateInfo.createInfo;

public class Main {
        // 유저 , 강의 , 수강관리 클래스 생성 > ArrayList 담기
        // 강의 1번 수강생의 loginId찾기
        // 유저의 loginId로 강의명 찾기
        static ArrayList<User> users;
        static ArrayList<Lecture> lectures;
        static ArrayList<LectureRegistration> lectureRegistrations;
        static ArrayList<Review> reviews;
        static ArrayList<Teacher> teachers;
        static ArrayList<LectureTeacher> lectureTeachers;

        public static void main(String[] args) {

                System.out.println("1번 강의실 : 'Magic of Math'");
                System.out.println("2번 강의실 : 'How To Easier counting to Ten'");
                System.out.println("3번 강의실 : 'Do it! Real Edits for Java Tutorial'");
                System.out.println("4번 강의실 : 'Figma Pigma'");
                System.out.println();


                CreateInfo.createInfo();


                getTeacherByLectureId(3);
                System.out.println();

                getLectureTitleListByTeacherId("voldmote");
                System.out.println();


                /*User tom = new User("T", "Tom", "Male", 20, 3, "Seoul"
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
                        , "30min", 1, "PC");*/


            /*    ArrayList<Lecture> lectures = new ArrayList<>();
                Lecture lecture1 = new Lecture();


                ArrayList<LectureRegistration> lectureRegistrations = new ArrayList<>();
                LectureRegistration lectureRegistration1 = new LectureRegistration(tom.getUserLoginId(), magicOfMath.lectureId);
                lectureRegistrations.add(lectureRegistration1);
                LectureRegistration lectureRegistration2 = new LectureRegistration(jessi.getUserLoginId(), howToCount10.lectureId);
                lectureRegistrations.add(lectureRegistration2);
                LectureRegistration lectureRegistration3 = new LectureRegistration(yami.getUserLoginId(), doItJava.lectureId);
                lectureRegistrations.add(lectureRegistration3);
                LectureRegistration lectureRegistration4 = new LectureRegistration(steve.getUserLoginId(), magicOfMath.lectureId);
                lectureRegistrations.add(lectureRegistration4);
                LectureRegistration lectureRegistration5 = new LectureRegistration(maria.getUserLoginId(), doItJava.lectureId);
                lectureRegistrations.add(lectureRegistration5);*/


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

                int g;
                for (int i = 0; i < lectureRegistrations.size(); i++) {
                        if (inputString.equalsIgnoreCase(lectureRegistrations.get(i).userId)) {
                                g = lectureRegistrations.get(i).lectureId;
                                for (int j = 0; j < lectures.size(); j++) {
                                        if (g == lectures.get(j).lectureId) {
                                                String title = lectures.get(j).getLectureName();
                                                System.out.println(title);
                                        }
                                }
                        }
                }
        }

    public static void getTeacherByLectureId(int lectureId) {
            for (int i = 0; i < lectureTeachers.size(); i++) {
                    if (lectureTeachers.get(i).getLectureId() == lectureId) {
                            for (int j = 0; j < teachers.size(); j++) {
                                    if (lectureTeachers.get(i).getTeacherId() == teachers.get(j).teacherId)
                                            System.out.println(lectureId + "번 강의실은 " + teachers.get(j).teacherName + " 교수님 강의입니다");
                            }
                    }
            }
    }

    public static void getLectureTitleListByTeacherId(String teacherName) {
                List<String> lectureList = new ArrayList<>();
                String teacherId;
                int lecId;
                for (int i = 0; i<teachers.size(); i++) {
                        if (teacherName.equalsIgnoreCase(teachers.get(i).teacherName)) {
                                teacherId = teachers.get(i).teacherId;
                                for (int j = 0;j < lectureTeachers.size() ; j++) {
                                        if (teacherId == lectureTeachers.get(j).teacherId){
                                                lecId = lectureTeachers.get(j).lectureId;
                                                for(int k = 0;k<lectures.size();k++){
                                                        if(lecId == lectures.get(k).lectureId)
                                                                lectureList.add(lectures.get(k).getLectureName());
                                                }
                                        }
                                }
                        }
                }
            System.out.println(teacherName+" 교수님의 강의목록은 "+ lectureList+" 입니다.");
    }


    public static boolean createReview(int reviewId, int rating, String text, String userLoginId, int lectureId) {
                /*ArrayList<Review> reviews = new ArrayList<>();*/
                if (rating >= 11 || rating < 0) {
                        return false;
                } else {
                        return reviews.add(new Review(reviewId, rating, text, userLoginId, lectureId));
                }
        }
}





