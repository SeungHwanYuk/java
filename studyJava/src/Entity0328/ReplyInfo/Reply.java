package Entity0328.ReplyInfo;

//1-1) id, content, loginId 필드 필수. 나머지 필요하다고 생각되는 필드는 각자 추가.
//        1-2) freeBoardId 필드 사용
//     : 댓글이 자유게시판의 어느 글의 댓글인지 저장
//1-3) Reply 객체가 생성될때 1-2의 해당 글의 객체에 있는 replies에 등록이 되어야 한다!!!

public class Reply {
    int replyId;
    CategoryFreeboard categoryFreeboard;
    String content;
    String userLoginId;
    int freeBoardId;

    public Reply() {
    }

    public Reply(int replyId, CategoryFreeboard categoryFreeboard, String content, String userLoginId, int freeBoardId) {
        this.replyId = replyId;
        this.categoryFreeboard = categoryFreeboard;
        this.content = content;
        this.userLoginId = userLoginId;
        this.freeBoardId = freeBoardId;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public CategoryFreeboard getCategoryFreeboard() {
        return categoryFreeboard;
    }

    public void setCategoryFreeboard(CategoryFreeboard categoryFreeboard) {
        this.categoryFreeboard = categoryFreeboard;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public int getFreeBoardId() {
        return freeBoardId;
    }

    public void setFreeBoardId(int freeBoardId) {
        this.freeBoardId = freeBoardId;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", categoryFreeboard=" + categoryFreeboard +
                ", content='" + content + '\'' +
                ", userLoginId='" + userLoginId + '\'' +
                ", boardingId=" + freeBoardId +
                '}';
    }
}
