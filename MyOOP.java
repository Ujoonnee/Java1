
public class MyOOP {
	public static void main(String[] args) {
		// 1 million codes
		PrintOOP p1 = new PrintOOP();
		p1.delimiter = "-----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		PrintOOP p2 = new PrintOOP();
		p2.delimiter = "*****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
		
	}
}
