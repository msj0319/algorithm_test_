class Solution {
    public int[] solution(int[][] v) {
        
        int[] answer = {0,0};
        
        //좌표는 총 3개가 입력으로 주어지므로 반복을 3번 돌린다.
        for (int i=0; i<3; i++){
            answer[0] ^= v[i][0];
            answer[1] ^= v[i][1];
        }
        return answer;
    }
}