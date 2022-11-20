package level_1.s133502;

import common.SolutionInterface;
import level_1.Level_1_Parameters;
import lombok.Data;

import java.util.Objects;
import java.util.Stack;

@Data
public class Solution implements SolutionInterface {

    @Override
    public void solution() {
        Level_1_Parameters.Param133502[] values = Level_1_Parameters.Param133502.values();
        boolean flag = true;
        for(Level_1_Parameters.Param133502 p : values){
            long stTime = System.currentTimeMillis();
            int sAnswer = p.getAnswer();
            int pAnswer = solution(p.getIngredient());
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

    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> bergers = new Stack<>();

        for(int i : ingredient) {
            bergers.add(i);

            if(bergers.size() < 4){
                continue;
            }

            if(i == 1){
                bergers.pop();
                int ingd3 = bergers.pop();
                if(ingd3 == 3) {
                    int ingd2 = bergers.pop();
                    if(ingd2 == 2) {
                        int ingd1 = bergers.pop();
                        if (ingd1 == 1) {
                            answer++;
                        } else {
                            bergers.add(ingd1);
                            bergers.add(ingd2);
                            bergers.add(ingd3);
                            bergers.add(i);
                        }
                    } else {
                        bergers.add(ingd2);
                        bergers.add(ingd3);
                        bergers.add(i);
                    }
                } else {
                    bergers.add(ingd3);
                    bergers.add(i);
                }
            }
        }

        return answer;
    }
}