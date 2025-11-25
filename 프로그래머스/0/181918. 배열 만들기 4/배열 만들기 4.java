import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        
        // i를 조건에 따라만 증가 -> while문
        while(i < arr.length){
        
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else if(stk.get(stk.size() - 1) < arr[i]){
                stk.add(arr[i]);
                i++;
            }else if(stk.get(stk.size() - 1) >= arr[i]){
                stk.remove(stk.size() - 1);
            }
        
        }
        
        int[] answer = new int[stk.size()];
        
        for(int j = 0; j < stk.size(); j++){
            answer[j] = stk.get(j);
        }
        return answer;
    }
}