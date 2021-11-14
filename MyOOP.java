
public class MyOOP {
	public static void main(String[] args) {
		// 1 million codes
		delimiter = "-----";
		printA();
		printA();
		printB();
		printB();
		
		delimiter = "*****";
		printA();
		printA();
		printB();
		printB();
		
		
	}
	public static String delimiter = "";
	private static void printA() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	private static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
