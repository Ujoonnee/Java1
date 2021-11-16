import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
	public static void printTwoTimesA(String text, String delimiter) {
		
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	public static void writeFileTwoTimesA(String text, String delimiter) {
		
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	public static void main(String[] args) throws IOException {

		
		System.out.println(twoTimes("a", "-"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("b", "*"));
		fw.close();
	}

}
