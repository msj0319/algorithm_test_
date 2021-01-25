import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		int n,x;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = sc.nextInt();
		
		int num[] = new int[n];
		for (int i=0; i<n; i++) {
			num[i] = sc.nextInt();
			if (x > num[i]) {
				System.out.print(num[i]+" ");
			}
		}
	}
}