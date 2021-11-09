 /* goal
  * write an txt file with java
  */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class InstanceApp_MyVer {

	public static void main(String[] args) {

		try {
			String content = "내가 이겼다 후";
			String path = "C:\\Users\\이우준\\Desktop\\Java1\\result1.txt";
			File file = new File(path);
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(content);
			
			bw.close();			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
