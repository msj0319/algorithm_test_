//나머지 한 점

class Solution {
    public int[] solution(int[][] v) {
        
        int x, y;
        
        // x좌표값 찾기
        if (v[0][0]==v[1][0]){
            x = v[2][0];
        }
        else if (v[0][0]==v[2][0]){
            x = v[1][0];
        }
        else
            x = v[0][0];
        
        //y좌표값 찾기
        if(v[0][1] == v[1][1]){
            y = v[2][1];
        }
        else if(v[0][1]==v[2][1]){
            y = v[1][1];
        }
        else
            y = v[0][1];
        
        int[] answer = {x,y};
        return answer;
    }
}