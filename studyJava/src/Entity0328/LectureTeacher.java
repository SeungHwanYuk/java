package Entity0328;

public class LectureTeacher {
    String teacherId;
    int lectureId;

    public LectureTeacher() {
    }

    public LectureTeacher(String teacherId, int lectureId) {
        this.teacherId = teacherId;
        this.lectureId = lectureId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    @Override
    public String toString() {
        return "LectureTeacher{" +
                "teacherId='" + teacherId + '\'' +
                ", lectureId=" + lectureId +
                '}';
    }
}

