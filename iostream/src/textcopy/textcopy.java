package textcopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class textCopy {
	public static void main(String[] args) {
		copytextFile();
	}
	
	public static void copytextFile() {
		String source = "textfile.txt";
		String target = "textfile_copied.txt";
		
		try (InputStream fis = new FileInputStream(source);
			OutputStream fos = new FileOutputStream(target);
		) {
			while (true) {
				byte[] dataArr = new byte[128];
				int result = fis.read(dataArr);
				if (result == -1) break;
				fos.write(dataArr);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
}
