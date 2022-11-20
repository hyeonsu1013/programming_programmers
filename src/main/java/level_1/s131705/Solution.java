package level_1.s131705;

import common.SolutionInterface;
import level_1.Level_1_Parameters;
import lombok.Data;

import java.util.Arrays;
import java.util.Objects;

@Data
public class Solution implements SolutionInterface {

    @Override
    public void solution() {
        Level_1_Parameters.Param131705[] values = Level_1_Parameters.Param131705.values();
        boolean flag = true;
        for(Level_1_Parameters.Param131705 p : values){
            long stTime = System.currentTimeMillis();
            int sAnswer = p.getAnswer();
            int pAnswer = solution(p.getNumber());
            long edTime = System.currentTimeMillis();
            double milliseconds = edTime - stTime;
            boolean isAns = Objects.equals(sAnswer, pAnswer);
            flag = flag && isAns;

            System.out.println(isAns ? "정답!!" : "오답!!");
            System.out.println("정답 : " + sAnswer + ", 풀이답 : " + pAnswer);
            System.out.println("소요시간 : " + (milliseconds / 1000) + "초\r\n");
        }
        System.out.println(flag ? "모두 정답!!" : "오답 존재!!");
    }

    public int cnt = 0;

    public int solution(int[] number) {
        cnt = 0;
        int[] triple = new int[3];
        this.choose(number, triple, 0, 0);
        return cnt;
    }

    public void choose(int[] number, int[] triple, int n, int m) {
        if(n == 3){
            if(Arrays.stream(triple).sum() == 0) {
                cnt++;
            };
            return;
        }

        for(int i = m; i < number.length; i++){
            triple[n] = number[i];
            choose(number, triple, n+1, i+1);
        }
    }
}