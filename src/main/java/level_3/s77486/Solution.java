package level_3.s77486;

import common.SolutionInterface;
import level_3.Level_3_Parameters;
import lombok.Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class Solution implements SolutionInterface {

    @Override
    public void solution() {
        Level_3_Parameters.Param77486[] values = Level_3_Parameters.Param77486.values();
        boolean flag = true;
        for(Level_3_Parameters.Param77486 p : values){
            long stTime = System.currentTimeMillis();
            int[] sAnswer = p.getAnswer();
            int[] pAnswer = solution(p.getEnroll(), p.getReferral(), p.getSeller(), p.getAmount());
            long edTime = System.currentTimeMillis();
            double milliseconds = edTime - stTime;
            boolean isAns = Arrays.equals(sAnswer, pAnswer);
            flag = flag && isAns;

            System.out.println(isAns ? "정답!!" : "오답!!");
            System.out.println("정답 : " + Arrays.toString(sAnswer) + ", 풀이답 : " + Arrays.toString(pAnswer));
            System.out.println("소요시간 : " + (milliseconds / 1000) + "초\r\n");
        }
        System.out.println(flag ? "모두 정답!!" : "오답 존재!!");
    }

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];

        Map<String, Integer> nameMap = new LinkedHashMap<>();
        Map<Integer, String> numMap = new LinkedHashMap<>();
        Map<Integer, Integer> refMap = new HashMap<>();

        for(int i = 0; i < enroll.length; i++){
            nameMap.put(enroll[i], i);
            numMap.put(i, enroll[i]);
            if(nameMap.containsKey(referral[i])){
                refMap.put(i, nameMap.get(referral[i]));
            }
        }

        for(int i = 0; i < seller.length; i++){
            this.sumAmount(seller[i], amount[i] * 100, answer, nameMap, numMap, refMap);
        }

        return answer;
    }

    public void sumAmount(String s, int a, int[] answer, Map<String, Integer> nameMap, Map<Integer, String> numMap, Map<Integer, Integer> refMap) {
        int num = nameMap.get(s);
        if(a < 10){
            answer[num] += a;
        } else {
            int sum = a / 10;
            answer[num] += (a - sum);

            if(refMap.containsKey(num)){
                String ref = numMap.get(refMap.get(num));
                this.sumAmount(ref, sum, answer, nameMap, numMap, refMap);
            }
        }
    }

}