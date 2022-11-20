package level_1.s92334;

import common.SolutionInterface;
import level_1.Level_1_Parameters;
import lombok.Data;

import java.util.*;

@Data
public class Solution implements SolutionInterface {

    @Override
    public void solution() {
        Level_1_Parameters.Param92334[] values = Level_1_Parameters.Param92334.values();
        boolean flag = true;
        for(Level_1_Parameters.Param92334 p : values){
            long stTime = System.currentTimeMillis();
            int[] sAnswer = p.getAnswer();
            int[] pAnswer = solution(p.getId_list(), p.getReport(), p.getK());
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

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        Map<String, Set<String>> recvMap = new HashMap<>();
        Map<String, Integer> mailMap = new HashMap<>();
        for(String id : id_list){
            mailMap.put(id, 0);
        }

        for(String str : report) {
            String[] split = str.split(" ");
            String send = split[0];
            String recv = split[1];

            if(recvMap.containsKey(recv)){
                recvMap.get(recv).add(send);
            } else {
                Set<String> set = new HashSet<>();
                set.add(send);
                recvMap.put(recv, set);
            }
        }

        for(String key : recvMap.keySet()){
            if(recvMap.get(key).size() >= k) {
                for(String send : recvMap.get(key)){
                    mailMap.put(send, mailMap.get(send) + 1);
                }
            }
        }

        answer = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++){
            answer[i] = mailMap.get(id_list[i]);
        }

        return answer;
    }
}