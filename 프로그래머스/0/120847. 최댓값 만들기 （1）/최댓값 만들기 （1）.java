import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        
       ArrayList<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(num);
        }
        
        Collections.sort(list);
        int size = list.size();
        int answer = list.get(size -1) * list.get(size -2);
        return answer;
        
    }
}