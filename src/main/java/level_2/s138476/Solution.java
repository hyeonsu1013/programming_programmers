package level_2.s138476;

import common.SolutionInterface;
import level_2.Level_2_Parameters;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class Solution implements SolutionInterface {

    @Override
    public void solution() {
        Level_2_Parameters.Param138476[] values = Level_2_Parameters.Param138476.values();
        boolean flag = true;
        for(Level_2_Parameters.Param138476 p : values){
            long stTime = System.currentTimeMillis();
            int sAnswer = p.getAnswer();
            int pAnswer = solution(p.getK(), p.getTangerine());
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



    public int solution(int k, int[] tangerine) {
        int answer = 0;
        List<Integer> list = Arrays.stream(tangerine)
                                    .boxed()
                                    .collect(Collectors.toList());
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        List<Long> cntList = map.values()
                                    .stream()
                                    .sorted(Comparator
                                            .comparing(Long::longValue)
                                            .reversed())
                                    .collect(Collectors.toList());
        long sum = 0;
        for(Long cnt : cntList){
            answer++;
            sum += cnt;
            if(sum >= k){
                break;
            }
        }

        return answer;
    }

}