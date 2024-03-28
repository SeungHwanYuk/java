package Entity0328;

public class LectureList {
    String lectureName;
    String userName;

    public LectureList() {
    }

    public LectureList(String lectureName, String userName) {
        this.lectureName = lectureName;
        this.userName = userName;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
