import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        
        char[] arr = my_string.toCharArray();
        
        for(int[] quer : queries) {  // queries는 이중배열 -> int[]
            
            int s = quer[0];
            int e = quer[1];
            
            while(s < e) {
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        return new String(arr);
    }
}