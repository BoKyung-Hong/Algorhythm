import java.util.*;  // 까먹지마!!

class Solution {
    public int[] solution(String my_string) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(Character.isDigit(ch)){
                list.add(ch - '0');  // 문자열 -> 숫자로 바꿔주기!! 
            }
        }
        
        
        Collections.sort(list);  // list를 오름차순 정렬 
        
        // return 타입 확인!! -> return list; 안돼! int[] 반환해야해!
        // 리스트 -> 배열
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}