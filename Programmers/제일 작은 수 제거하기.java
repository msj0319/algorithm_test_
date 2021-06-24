import java.util.*;
public class Main {
    public static int min(int[] arr) {
        int a = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (a > arr[i])
                a = arr[i];
        }
        return a;
    }
    public static int[] solution(int[] arr) {
        int min = min(arr);
        ArrayList<Integer> num = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if (min != arr[i])
                num.add(arr[i]);
        }
        if (arr.length == 1) {
            num.add(-1);
        }
        //ArrayList를 int[]로 변환
        return num.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println((Arrays.toString(solution(arr))));
    }
}
