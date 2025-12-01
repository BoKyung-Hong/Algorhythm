import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        List<Integer> list = new ArrayList<>();
        
        // n번째 이후부터 앞에 적기
        for(int i = n; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        
        // n번째까지의 원소
        for(int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }
        
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}