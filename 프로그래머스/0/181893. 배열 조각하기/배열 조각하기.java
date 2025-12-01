import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        List<Integer> list = new ArrayList<>();
        for(int num : arr) list.add(num);   // 배열을 list화 (sublist 쓰려고)
        
        
        for(int i = 0; i < query.length; i++) {  // 일단 idx 구하기
            int idx = query[i];
            if(i % 2 == 0) {  // list = new ArrayList<>(list.subList()); -> 새로운 list 값이 나와야함
                list = new ArrayList<>(list.subList(0, idx + 1));
            } else {
                list = new ArrayList<>(list.subList(idx, list.size()));
            }
        }
        
        // list -> [] 배렬로 다시 바꾸기
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i ++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}