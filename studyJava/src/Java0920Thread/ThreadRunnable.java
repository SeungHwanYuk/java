package Java0920Thread;

class SMIFileRunnable implements Runnable {
    @Override
    public void run() {
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("(자막번호) " + strArray[i]);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
            }
        }
    }
}

class VideoFileRunnable implements Runnable {
    @Override
    public void run() {
        int[] intArray = {1,2,3,4,5};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("(비디오프레임) " + intArray[i]);
            try { Thread.sleep(400); } catch (InterruptedException e) {}
    }
    }
}
public class ThreadRunnable {
    public static void main(String[] args) {

        // 자막 쓰레드
        Runnable smiFileRunnable = new SMIFileRunnable();
        Thread thread1 = new Thread(smiFileRunnable);
        thread1.start();

        // 비디오 쓰레드
        Runnable videoFileRunnable = new VideoFileRunnable();
        Thread thread2 = new Thread(videoFileRunnable);
        thread2.start();
    }
}
