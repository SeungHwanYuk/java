package Entity0328.ReplyInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static ArrayList<FreeBoard> freeBoards;
    static ArrayList<Reply> replies;

    public static void main(String[] args) {

        ReplyInfo.replyInfo();


//        System.out.println(replies.toString());
        System.out.println(freeBoards.get(1));
        System.out.println();

    }

//    public static boolean SetReplyToFreeBoard() {
//
//        for (int i = 0; i < replies.size(); i++) {
//            if (replies.get(i).freeBoardId == freeBoards.get(i).freeBoardId);
//
//        }
//    }
}


// setReplie 메서드 오버로딩 > replies.add(ReplyInfo.replyInfo());
