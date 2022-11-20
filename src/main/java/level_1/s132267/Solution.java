package level_1.s132267;

import common.SolutionInterface;
import level_1.Level_1_Parameters;
import lombok.Data;

import java.util.Objects;

@Data
public class Solution implements SolutionInterface {

    @Override
    public void solution() {
        Level_1_Parameters.Param132267[] values = Level_1_Parameters.Param132267.values();
        boolean flag = true;
        for(Level_1_Parameters.Param132267 p : values){
            long stTime = System.currentTimeMillis();
            int sAnswer = p.getAnswer();
            int pAnswer = solution(p.getA(), p.getB(), p.getN());
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

    public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp;

        while(n >= a){
            int rcve = (n / a) * b;
            tmp = n % a;
            answer += rcve;

            n = rcve + tmp;
        }

        return answer;
        // return (n-b) / (a-b) * b;
    }
}