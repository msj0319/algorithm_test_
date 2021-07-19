import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 1000 - sc.nextInt();
        int[] array = {500,100,50,10,5,1}; 
        int i = 0;
        int answer = 0;

        while (money != 0) {
            int change = money / array[i];
            money -=  change * array[i++];
            answer += change;
        }
        System.out.println(answer);
    }
}

//입력값이 380엔일 때
//        1.
//        620 / 500 -> 1 : change
//        620 - 1 * 500 -> 120 : money
//        1 = answer
//
//        2.
//        120 / 100 -> 1 : change
//        120 - 1 * 100 -> 20 : money
//        2 = answer
//
//        3.
//        20 / 50 -> 0 : change
//        20 - 0 * 50 -> 20 : money
//        2 = answer
//
//        4.
//        20 / 10 -> 2 : change
//        20 - 2 * 10 -> 0 : money
//        answer = 4