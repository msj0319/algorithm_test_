import java.util.Collections;
import java.util.LinkedList;

class Solution {

    public static int max(LinkedList<Integer> score) {
        int max = score.get(0);
        for (int i=0; i< score.size(); i++) {
            if (max < score.get(i)) {
                max = score.get(i);
            }
        }
        return max;
    }

    public static int min(LinkedList<Integer> score) {
        int min = score.get(0);
        for (int i=0; i< score.size(); i++) {
            if (min > score.get(i)) {
                min = score.get(i);
            }
        }
        return min;
    }

    public static StringBuilder resultRank(float[] avg, StringBuilder sb) {
        for (int i=0; i< avg.length; i++) {
            if (avg[i] >= 90)
                sb.append("A");
            else if (avg[i] >= 80 && avg[i] < 90)
                sb.append("B");
            else if (avg[i] >= 70 && avg[i] < 80)
                sb.append("C");
            else if (avg[i] >= 50 && avg[i] < 70)
                sb.append("D");
            else
                sb.append("F");
        }
        return sb;
    }

    public String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();
        LinkedList<Integer>[] score = new LinkedList[scores.length];
        float[] sum = new float[scores.length];
        float[] avg = new float[scores.length];

        for (int i=0; i<scores.length; i++) {
            score[i] = new LinkedList<>();
            for (int j=0; j<scores.length; j++) {
                score[i].add(scores[j][i]);
            }
        }

        for (int i=0; i < score.length; i++) {
            for (int j=0; j < score[i].size(); j++) {
                if (score[i].get(j) == max(score[i]) && Collections.frequency(score[i], max(score[i])) == 1 && i == j
                        || score[i].get(j) == min(score[i]) && Collections.frequency(score[i], min(score[i])) == 1 && i == j) {
                    score[i].remove(j);
                }
            }
        }

        for (int i=0; i< score.length; i++) {
            for (int j=0; j<score[i].size(); j++) {
                sum[i] += score[i].get(j);
                avg[i] = sum[i] / score[i].size();
            }
        }

        return String.valueOf(resultRank(avg, answer));
    }
}
