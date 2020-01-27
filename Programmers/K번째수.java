import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
       
        for (int index = 0; index<commands.length; index++){
            int i = commands[index][0];
            int j = commands[index][1];
            int k = commands[index][2];
            
            int[] array2 = Arrays.copyOfRange(array,i-1,j);                                                                                     //마지막 index는 포함 안함 
            Arrays.sort(array2);
            answer[index] = array2[k-1];

            }
        return answer;
    }
}