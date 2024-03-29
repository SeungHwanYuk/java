package Entity0328;

import java.util.ArrayList;

public class Method {
    public boolean createReview(int reviewId, int rating, String text, String userLoginId, int lectureId) {
        ArrayList<Review> reviews = new ArrayList<>();
        if (rating >= 11 || rating < 0) {
            return false;
        } else {
            return reviews.add(new Review(reviewId, rating, text, userLoginId, lectureId));
        }
    }
}
