package Entity0328;

public class LectureRegistration {
    String userId;
    int lectureId;

    String lecName;

    public LectureRegistration() {
    }

    public LectureRegistration(String userId, int lectureId,String lecName) {
        this.lecName = lecName;
        this.userId = userId;
        this.lectureId = lectureId;
    }

    public String getLecName() {
        return lecName;
    }

    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }
}
