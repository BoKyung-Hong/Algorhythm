import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        list.add(n);  // 초기값 추가
        
        while(n != 1) {
            
            if(n % 2 == 0) {
                n = n / 2;
            } else if(n % 2 == 1) {
                n = 3 * n + 1;
            } 
            list.add(n);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}