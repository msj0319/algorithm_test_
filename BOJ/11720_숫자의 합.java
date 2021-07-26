import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();

        char[] num = new char[n];
        int i, sum = 0;

        for (i=0; i<input.length(); i++) {
            num[i] = input.charAt(i);
            sum += Character.getNumericValue(num[i]); //char to int
        }

        System.out.println(sum);
    }
}