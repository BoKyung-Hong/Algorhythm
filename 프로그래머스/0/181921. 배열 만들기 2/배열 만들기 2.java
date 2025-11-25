import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        
        // 범위가 안정해져 있으니 list
        List<Integer> list = new ArrayList<>();

        for(int num = l; num <= r; num++){
            String s = String.valueOf(num);
            boolean ok = true;
            
            for(char c : s.toCharArray()){
                if(c != '0' && c != '5') {
                    ok = false;
                    break;
                }
            }
            if(ok) list.add(num);
    }
        if(list.isEmpty()) {
            return new int[]{-1}; 
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
}
}