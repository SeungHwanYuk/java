package Entity0328.ReplyInfo;

import java.util.ArrayList;



public class ReplyInfo {

    public static void replyInfo() {

        Main.replies = new ArrayList<>();
        Main.replies.add(new Reply(101,CategoryFreeboard.TALKTALK,"ㅎㅇ","asd123",1));
        Main.replies.add(new Reply(102,CategoryFreeboard.TALKTALK,"ㅎㅇ2","asd123",1));
        Main.replies.add(new Reply(103,CategoryFreeboard.TALKTALK,"ㅎㅇ3","asd123",1));

        Main.freeBoards = new ArrayList<>();
        Main.freeBoards.add(new FreeBoard(1,CategoryFreeboard.TALKTALK,"자유게시판","VM777",Main.replies));
        Main.freeBoards.add(new FreeBoard(2,CategoryFreeboard.ASK,"QnA","VM777",Main.replies));
        Main.freeBoards.add(new FreeBoard(3,CategoryFreeboard.HOMEWORK,"과제게시판","VM777",Main.replies));






    }


}
