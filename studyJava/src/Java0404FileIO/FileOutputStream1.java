package Java0404FileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream1 {
    public static void main(String[] args) throws IOException {
        // 파일 데이터 출력
        // 1. 파일 대상 설정
        File outFile = new File(FileObject.CURRENT+"/file2.txt");
        if(!outFile.exists()) {
            outFile.createNewFile();
        }
        // 2. 대상에 연결되는 stream 생성
        OutputStream os = new FileOutputStream(outFile);

        // 3. 데이터 쓰기 ( 1 byte씩 쓰기 )
        os.write('J'); // write() 쓰기 <-> read() 읽기
        os.write('A');
        os.write('V');
        os.write('A');
        os.write('\r'); // 캐리지 리턴 (carriage return)
        os.write('\n'); // 라인 피드 (line feed)
        os.write('S');  // 줄을 바꿔서 S가 입력됨
        os.write('\r');
        os.write('\n');

        os.flush(); // write()의 버퍼에 담았던 데이터(문자)를 flush()로 stream(out)해준다
        os.close(); // 4. 닫기

        // 여러 byte를 한꺼번에 쓰는 예제
        OutputStream os2 = new FileOutputStream(outFile, true); // false는 기존 파일에 있던 데이터를 삭제후 새로 쓰고, true는 이어쓰기.
        byte[] byteArray = "My class mate is JamManBo".getBytes();  // getBytes()를 사용함으로 문자를 byte단위로 변환후 byte[] 배열로 변경
        // write()는 매개변수에 바이트배열 형태로 넣어주면 배열에 담긴 데이터를 모두 쓴다.
        os2.write(byteArray);
        os2.write('\r'); // "My class mate is JamManBo\r\n" 문자열에 추가함으로써 생략가능
        os2.write('\n');

        os2.flush();
        os2.close();
    }
}
