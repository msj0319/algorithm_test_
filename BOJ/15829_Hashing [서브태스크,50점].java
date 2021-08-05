import java.io.*;

public class Main {
    private static long hash_value;
    private static final int r = 31;
    private static final int MOD = 1_234_567_891;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();

        //해시값 계산
        long temp = 1;
        for (int i=0; i< input.length(); i++) {
            //hash_value += ctoi[i] * Math.pow(31, i);    //서브태스크 50점
            hash_value += ((input.charAt(i) - 'a' + 1) * temp) % MOD;
            temp *= r;
            temp %= MOD;
        }
        System.out.println(hash_value);
    }
}