import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());
        
        for (int i=0; i<testcase; i++){
            st = new StringTokenizer(br.readLine());
            int people = Integer.parseInt(st.nextToken());

            float[] score = new float[people];
            float avg = 0;
            float sum = 0;
            float count = 0;

            for (int j=0; j<people; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
                avg = sum / people;
            }
            for (int k=0; k<people; k++) {
                if (avg < score[k])
                    count++;
            }
            System.out.printf("%.3f%c\n", (count/people) * 100, '%');
        }
    }
}