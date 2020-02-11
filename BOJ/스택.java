import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int top = -1;
		int[] stack = new int[num];

		for (int i=0; i<num; i++){
			String input = sc.next();
			if (input.equals("push")){
				stack[++top] = sc.nextInt();
			}
			else if (input.equals("pop")) {
				if (top == -1) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack[top]);
					top--;
				}
			}
			else if (input.equals("size")) {
				System.out.println(top+1);
			}
			else if (input.equals("empty")) {
				if (top == -1){
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			else if (input.equals("top")){
				if (top == -1) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack[top]);
				}
			}
		}
	}
}