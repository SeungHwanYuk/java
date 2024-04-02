package Entity0328;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreateInfo {

    public static void createInfo() {


        Main.users = new ArrayList<>();
        Main.users.add(new User("Tom", "Male", 20, 3, "Seoul"
                , "asd123", "123asd", LocalDate.of(2003, 3, 23)));
        Main.users.add(new User("Jessi", "Male", 24, 6, "Seoul"
                , "jess123", "123jess", LocalDate.of(1999, 12, 12)));
        Main.users.add(new User("Yami", "Used Male", 1, 1, "Ohjungdong"
                , "iamcat", "notdog", LocalDate.of(2023, 6, 6)));
        Main.users.add(new User("Steve", "Male", 30, 3, "Daejeon"
                , "steve123", "123steve", LocalDate.of(1993, 1, 1)));
        Main.users.add(new User("Maria", "Female", 25, 6, "Daejeon"
                , "marry123", "123marry", LocalDate.of(1998, 2, 1)));
        Main.users.add(new User("VoldMote", "Male", 255, 10, "Daejeon"
                , "VM777", "777VM", LocalDate.of(1665, 2, 1)));
        Main.users.add(new User("KimSuJwong", "Male", 25, 6, "Daejeon"
                , "KSJ", "KSJ123", LocalDate.of(1999, 2, 1)));
        Main.users.add(new User("SeoHyougWon", "Male", 50, 10, "Daejeon"
                , "bestteacher", "best123", LocalDate.of(1972, 2, 1)));
        Main.users.add(new User("ChenAn", "Male", 50, 6, "Daejeon"
                , "Ananan", "an123", LocalDate.of(1972, 2, 1)));
        Main.users.add(new User("김알바", "Female", 20, 1, "Daejeon"
                , "알바입니다", "part123", LocalDate.of(2003, 2, 1)));


        Main.lectures = new ArrayList<>();
        Main.lectures.add( new Lecture(1,"'Magic of Math'", "Voldmote"
                , "60min", 3, Category.MATH));
        Main.lectures.add( new Lecture(2,"'How To Easier counting to Ten'"
                , "KimSuJwong", "10sec", 1, Category.MATH));
        Main.lectures.add( new Lecture(3,"'Do it! Real Edits for Java Tutorial'"
                , "SeoHyungWon", "50min", 6, Category.PC));
        Main.lectures.add( new Lecture(4,"'Figma Pigma'", "CheonAn"
                , "30min", 1,Category.PC));

        Main.lectureRegistrations = new ArrayList<>();
        Main.lectureRegistrations.add(new LectureRegistration("asd123",1));
        Main.lectureRegistrations.add(new LectureRegistration("asd123",2));
        Main.lectureRegistrations.add(new LectureRegistration("asd123",3));
        Main.lectureRegistrations.add(new LectureRegistration("jess123",3));
        Main.lectureRegistrations.add(new LectureRegistration("iamcat",3));
        Main.lectureRegistrations.add(new LectureRegistration("steve123",2));
        Main.lectureRegistrations.add(new LectureRegistration("marry123",3));

        Main.reviews = new ArrayList<>();
        Main.reviews.add(new Review(10001, 10,"nice","asd123",1));
        Main.reviews.add(new Review(10002, 9,"nice2","asd123",2));
        Main.reviews.add(new Review(10003, 8,"nice3","asd123",3));
        Main.reviews.add(new Review(10004, 7,"nice4","jess123",3));
        Main.reviews.add(new Review(10005, 6,"nice5","steve123",2));

        Main.teachers = new ArrayList<>();
        Main.teachers.add(new Teacher("VM777","VoldMote" ,"lovepotter@gmail.com" ));
        Main.teachers.add(new Teacher("KSJ","KimSuJwong" ,"iamdeepwater@naver.com" ));
        Main.teachers.add(new Teacher("bestteacher","SeoHyungWon" ,"Javamaster@gmail.com" ));
        Main.teachers.add(new Teacher("Ananan","ChenAn" ,"notleavingcheonan@gmail.com" ));
        Main.teachers.add(new Teacher("알바입니다","김알바","parttime@naver.com"));

        Main.lectureTeachers = new ArrayList<>();
        Main.lectureTeachers.add(new LectureTeacher("VM777",1));
        Main.lectureTeachers.add(new LectureTeacher("알바입니다",2));
        Main.lectureTeachers.add(new LectureTeacher("알바입니다",1));
        Main.lectureTeachers.add(new LectureTeacher("알바입니다",3));
        Main.lectureTeachers.add(new LectureTeacher("알바입니다",4));
        Main.lectureTeachers.add(new LectureTeacher("KSJ",2));
        Main.lectureTeachers.add(new LectureTeacher("Ananan",4));
        Main.lectureTeachers.add(new LectureTeacher("bestteacher",3));

    }


}
