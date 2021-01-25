class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char [] arr = s.toLowerCase().toCharArray();
        int pcount=0;
        int ycount=0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 'p') {
                pcount++;
            }
            else if (arr[i] == 'y') {
                ycount++;
            }
        }
        if (pcount != ycount) {
            answer = false;
        }
        return answer;
    }
}