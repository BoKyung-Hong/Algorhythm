import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        my_string = my_string.toLowerCase();
        
        // 정렬하기 위해 문자열 -> 문자 배열
        char[] ch = my_string.toCharArray();
        
        Arrays.sort(ch);
        
        // 배열 -> 문자열로 다시 변환해서 반환
        return new String(ch);
    }
}