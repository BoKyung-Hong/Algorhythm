import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int idx : indices) {
            set.add(idx);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++){
            if(!set.contains(i)){
                sb.append(my_string.charAt(i));  // charAt()로 뽑기
            }
        }
        return sb.toString();
    }
}