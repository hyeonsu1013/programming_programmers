package level_1.s136798;

import common.SolutionInterface;
import level_1.Level_1_Parameters;
import lombok.Data;

import java.util.Arrays;
import java.util.Objects;

@Data
public class Solution implements SolutionInterface {

    @Override
    public void solution() {
        Level_1_Parameters.Param136798[] values = Level_1_Parameters.Param136798.values();
        boolean flag = true;
        for(Level_1_Parameters.Param136798 p : values){
            long stTime = System.currentTimeMillis();
            int sAnswer = p.getAnswer();
            int pAnswer = solution(p.getNumber(), p.getLimit(), p.getPower());
            long edTime = System.currentTimeMillis();
            double milliseconds = edTime - stTime;
            flag = flag && Objects.equals(sAnswer, pAnswer);

            System.out.println(sAnswer == pAnswer ? "정답!!" : "오답!!");
            System.out.println("정답 : " + sAnswer + ", 풀이답 : " + pAnswer);
            System.out.println("소요시간 : " + (milliseconds / 1000) + "초\r\n");
        }
        System.out.println(flag ? "모두 정답!!" : "오답 존재!!");
    }

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divCnt = new int[number + 1];
        Arrays.fill(divCnt, 1);

        for(int i = 2; i <= number; i++) {
            for(int j = 1; j * i <= number; j++) {
                divCnt[i * j] = divCnt[i * j] + 1;
            }
        }

        for(int i = 1; i < divCnt.length; i++) {
            if(divCnt[i] > limit){
                answer += power;
            } else {
                answer += divCnt[i];
            }
        }

        return answer;
    }
}