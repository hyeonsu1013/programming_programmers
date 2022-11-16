package level_1.s135808;

import common.SolutionInterface;
import level_1.Level_1_Parameters;
import lombok.Data;

import java.util.Arrays;
import java.util.Collections;

@Data
public class Solution implements SolutionInterface {

    @Override
    public void solution() {
        Level_1_Parameters.Param135808[] values = Level_1_Parameters.Param135808.values();
        for(Level_1_Parameters.Param135808 p : values){
            long stTime = System.currentTimeMillis();
            int sAnswer = p.getAnswer();
            int pAnswer = solution(p.getK(), p.getM(), p.getScore());
            long edTime = System.currentTimeMillis();
            double milliseconds = edTime - stTime;

            System.out.println(sAnswer == pAnswer ? "정답!!" : "오답!!");
            System.out.println("sAnswer : " + sAnswer + ", pAnswer : " + pAnswer);
            System.out.println("소요시간 : " + (milliseconds / 1000) + "초\r\n");
        }
    }

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] conv = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(conv, Collections.reverseOrder());

        for(int i =0; i<conv.length; i+=m){
            if(i+m-1 < conv.length){
                answer += conv[i+m-1] * m;
            } else {
                break;
            }
        }

        return answer;
    }
}