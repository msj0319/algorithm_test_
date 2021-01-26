import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i=0; i<count; i++) {
            int _2017 = sc.nextInt();
            int _2018 = sc.nextInt();
            int sum = 0;

            if (_2017 == 1) {
                sum += 5000000;
            } else if (_2017 == 2 || _2017 == 3) {
                sum += 3000000;
            } else if (_2017 >= 4 && _2017 < 7) {
                sum += 2000000;
            } else if (_2017 >= 7 && _2017 < 11) {
                sum += 500000;
            } else if (_2017 >= 11 && _2017 < 16) {
                sum += 300000;
            } else if (_2017 >= 16 && _2017 < 22) {
                sum += 100000;
            }

            if (_2018 == 1) {
                sum+= 5120000;
            } else if (_2018 == 2 || _2018 == 3) {
                sum+= 2560000;
            } else if (_2018 >= 4 && _2018 < 8) {
                sum+= 1280000;
            } else if (_2018 >= 8 && _2018 < 16) {
                sum+= 640000;
            } else if (_2018 >= 16 && _2018 <= 31) {
                sum+= 320000;
            }
            System.out.println(sum);
        }
    }
}