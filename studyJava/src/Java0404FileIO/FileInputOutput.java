package Java0404FileIO;

import java.io.*;
import java.nio.charset.Charset;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        File file = new File(FileObject.CURRENT + "/fileio.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        // 쓰기
        OutputStream os = new FileOutputStream(file, false);
        byte[] arrayByte1 = "Hello world. Let's study spring framework.\r\n".getBytes();
        byte[] arrayByte = "내 짝궁은 잠만보.\r\n".getBytes(Charset.forName("UTF-8"));
        os.write(arrayByte);
        os.flush();
        os.close();

        // 읽기
        InputStream is = new FileInputStream(file);
        int data;
        byte[] buffer = new byte[1000];
        String str = "";
        while ((data = is.read(buffer)) != -1) {
            str = str + new String(buffer, 0, data, Charset.forName("UTF-8"));
        }
        System.out.println(str);
        is.close();
    }
}
