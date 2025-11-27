import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        
        StringBuilder sb = new StringBuilder();
        
        int index = 0;
        
        while(index < my_string.length()){
            
            String row = my_string.substring(index, index + m);
            
            sb.append(row.charAt(c - 1));  // 각 줄마다 c번째 문자 뽑기
                
                index += m;  // 다음줄
        }
        return sb.toString();
    }
}