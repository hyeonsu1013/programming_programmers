package level_1.s134240;

import common.SolutionInterface;
import level_1.Level_1_Parameters;
import lombok.Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

@Data
public class Solution implements SolutionInterface {

    @Override
    public void solution() {
        Level_1_Parameters.Param134240[] values = Level_1_Parameters.Param134240.values();
        for(Level_1_Parameters.Param134240 p : values){
            long stTime = System.currentTimeMillis();
            String sAnswer = p.getAnswer();
            String pAnswer = solution(p.getFood());
            long edTime = System.currentTimeMillis();
            double milliseconds = edTime - stTime;

            System.out.println(Objects.equals(sAnswer, pAnswer) ? "정답!!" : "오답!!");
            System.out.println("sAnswer : " + sAnswer + ", pAnswer : " + pAnswer);
            System.out.println("소요시간 : " + (milliseconds / 1000) + "초\r\n");
        }
    }

    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        String answer = "";

        for(int i = 1; i < food.length; i++) {
            food[i] = food[i] / 2;
            sb.append(String.valueOf(i).repeat(Math.max(0, food[i])));
        }

        answer = sb.toString();

        sb.append("0");
        sb.reverse();
        answer += sb.toString();

        return answer;
    }
}