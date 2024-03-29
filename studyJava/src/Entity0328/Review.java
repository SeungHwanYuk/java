package Entity0328;

public class Review {
    int reviewId;
    int rating;
    String text;
    String userLoginId;
    int lectureId;

    public Review() {
    }

    public Review(int reviewId, int rating, String text, String userLoginId, int lectureId) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.text = text;
        this.userLoginId = userLoginId;
        this.lectureId = lectureId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }
}
