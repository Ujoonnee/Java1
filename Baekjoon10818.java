import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		int N = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String n = sc2.nextLine();
		sc1.close();
		sc2.close();
		
		String[] arr = n.split(" ");
		int[] array1 = new int[arr.length];
		
		for (int i = 0; i < N; i++) {
			array1[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(array1);
		
		
		System.out.println(Integer.toString(array1[0])+" "+Integer.toString(array1[N-1]));
		
	}
}
