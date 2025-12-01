import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = n - 1; i < num_list.length; i++) {  // n부터~ => n-1
            list.add(num_list[i]);
        }
        
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
