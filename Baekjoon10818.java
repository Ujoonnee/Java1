import java.util.Scanner;

public class Q10818 {
	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		String N = sc.nextLine();
//		String[] array = N.split(" ");
//		int[] numArray = new int[array.length];
//		
//		int n = array.length;
//		
//		for (int i=0; i<n;i++) {
//			numArray[i] = parseInt(array[i]);
//		}
//		
//		System.out.println(Integer.toString(min(numArray))+Integer.toString(max(numArray)));
//		
//		
//	}
//	
//	public static int parseInt(String a) {
//		int num = Integer.parseInt(a);
//		return num;
//	}
//	
//	public static int min(int[] a) {
//		int minValue = 0;
//		a[0] = 0;
//		for (int i = 1; i<a.length; i++) {
//			if (a[i-1] > a[i]) {
//				a[i-1] = a[i];
//			}
//			minValue = a[i-1];
//		}
//		return minValue;
//	}
//	
//	public static int max(int[] a) {
//		int maxValue = 0;
//		a[0] = 0;
//		for (int i = 1; i<a.length; i++) {
//			if (a[i-1] < a[i]) {
//				a[i-1] = a[i];
//			}
//			maxValue = a[i-1];
//		}
//		return maxValue;
//	}
//}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] array = (sc.nextLine()).split(" ");
		int[] numarr;
		
		// array casting string to int
		for (int i = 0; i < array.length; i++) {
			numarr[i] = Integer.parseInt(array[i]);
		}
		
		// min
		for (int i = 1; i < numarr.length; i++) {
			if (numarr[i] > numarr[i-1]) {
				numarr[i] = numarr[i-1];
			}
		}
		String min = Integer.toString(numarr[numarr.length-1]);
		
		// max
		for (int i = 1; i < numarr.length; i++) {
			if (numarr[i] < numarr[i-1]) {
				numarr[i] = numarr[i-1];
			}
		}
		String max = Integer.toString(numarr[numarr.length-1]);
		
		
		
		System.out.println(min+" "+max);
		
		
		
	}
}
























