package Entity0328.ReplyInfo;

//1. FreeBoard 클래스 (자유게시판 엔티티)
//1-1) id, title, content, loginId 필드 필수. 나머지 필요하다고 생각되는 필드는 각자 추가.
//        1-2) List<Reply> replies 필드 사용
//     : Reply 클래스와의 관계를 따로 외부 클래스로 작성하지 않고 내부에 List 타입으로 저장
//
//2. Reply 클래스 (답글 엔티티)
//1-1) id, content, loginId 필드 필수. 나머지 필요하다고 생각되는 필드는 각자 추가.
//        1-2) freeBoardId 필드 사용
//     : 댓글이 자유게시판의 어느 글의 댓글인지 저장
//1-3) Reply 객체가 생성될때 1-2의 해당 글의 객체에 있는 replies에 등록이 되어야 한다!!!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class FreeBoard {
    int freeBoardId;
    CategoryFreeboard categoryFreeboard;
    String content;
    String userLoginId;
    List<Reply> replies;

    public FreeBoard() {
    }

    public FreeBoard(int freeBoardId, CategoryFreeboard categoryFreeboard, String content, String userLoginId, List<Reply> replies) {
        this.freeBoardId = freeBoardId;
        this.categoryFreeboard = categoryFreeboard;
        this.content = content;
        this.userLoginId = userLoginId;
        this.replies = replies;
    }

    public int getFreeBoardId() {
        return freeBoardId;
    }

    public void setFreeBoardId(int freeBoardId) {
        this.freeBoardId = freeBoardId;
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

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }


    @Override
    public String toString() {
        return "FreeBoard{" +
                "freeBoardId=" + freeBoardId +
                ", categoryFreeboard=" + categoryFreeboard +
                ", content='" + content + '\'' +
                ", userLoginId='" + userLoginId + '\'' +
                ", replies=" + replies +
                '}';
    }
}
