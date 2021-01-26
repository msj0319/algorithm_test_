import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i=1; i<=count; i++) {  //1~N행까지 가장 큰 틀의 반복문 구성
            for (int j=1; j<=count-i; j++) {  //1번째 행엔 n-1개의 공백, N번째 행엔 N-n개의 공백
                System.out.print(" ");
            }
           for (int k=1; k<=i; k++) { //별찍기. 1행에 1개의 별 ~ N행에 N개의 별.
               System.out.print("*");
           }
            System.out.println(); //힌 행의 출력이 끝나면 개행
        }
    }
}