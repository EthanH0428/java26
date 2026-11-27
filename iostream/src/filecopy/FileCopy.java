package filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
    public static void main(String[] args) {
        copyImageFile();
    }

    public static void copyImageFile() {
        String source = "Curi_01.jpg";
        String target = "Curi_01_copy.jpg";

        try (
            // 입력파일로 입력 스트림 객체 생성
            InputStream fis = new FileInputStream(source);

            // 출력 파일로 출력스트림 객체 생성
            OutputStream fos = new FileOutputStream(target);
        ){
            // 입력 스트림 객체로부터 데이터를 읽어 옴
            while(true) {
                // int data = fis.read();
                // if(data == -1) break;
                // 읽어온 데이터를 출력 스트림 객체로 출력
                // fos.write(data);

                byte[] dataArr = new byte[128];
                int result = fis.read(dataArr);
                if(result == -1) break;
                fos.write(dataArr);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static void copyTextFile() {

    }
}