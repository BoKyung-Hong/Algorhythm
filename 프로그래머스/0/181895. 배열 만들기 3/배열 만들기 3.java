import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int[] inter : intervals) {
            int a = inter[0];
            int b = inter[1];
            
            for(int i = a; i <= b; i++) {
            list.add(arr[i]);
            }
        }
        
       // list -> []로 변환
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}