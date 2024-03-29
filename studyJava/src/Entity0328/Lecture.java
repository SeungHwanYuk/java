package Entity0328;

public class Lecture {

    int lectureId; // 중복되지 않은 유니크한 값을 필드에 하나 이상 꼭 있어야한다.
                       // 없다면 다른 클래스를 생성하고 고유번호를 부여해주자.
    private String lectureName;
    private String lectureProfessor;
    private String lecturePlayDuration;
    private int lectureLevel;
    private Category lectureContents;

    public Lecture() {
    }

    public Lecture(int lectureId, String lectureName, String lectureProfessor, String lecturePlayDuration, int lectureLevel, Category lectureContents) {
        this.lectureId = lectureId;
        this.lectureName = lectureName;
        this.lectureProfessor = lectureProfessor;
        this.lecturePlayDuration = lecturePlayDuration;
        this.lectureLevel = lectureLevel;
        this.lectureContents = lectureContents;
    }


    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getLectureProfessor() {
        return lectureProfessor;
    }

    public void setLectureProfessor(String lectureProfessor) {
        this.lectureProfessor = lectureProfessor;
    }

    public String getLecturePlayDuration() {
        return lecturePlayDuration;
    }

    public void setLecturePlayDuration(String lecturePlayDuration) {
        this.lecturePlayDuration = lecturePlayDuration;
    }

    public int getLectureLevel() {
        return lectureLevel;
    }

    public void setLectureLevel(int lectureLevel) {
        this.lectureLevel = lectureLevel;
    }

    public Category getLectureContents() {
        return lectureContents;
    }

    public void setLectureContents(Category lectureContents) {
        this.lectureContents = lectureContents;
    }

    public void displayLecInfoAll() {
        System.out.println(this.lectureName + " " + this.lectureProfessor + " " + this.lectureLevel + " " + this.lectureContents
                + " " + this.lecturePlayDuration);
    }
}
