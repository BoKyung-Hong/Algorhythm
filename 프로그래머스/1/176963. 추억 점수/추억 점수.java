import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);  // Map에 값을 넣는 방법 확인!
        }
        
        // 합을 넣을 배열 만들기
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {  // 배열 하나씩 꺼내고
                
                int sum = 0;
                
                for(String p : photo[i]) {  // 그 배열에서 이름 하나씩 꺼내기
                    sum += map.getOrDefault(p, 0);  // Map에 p가 있으면 p의 점수를 꺼내서 더하기
                }
            answer[i] = sum;
            }
        return answer;
    }
}