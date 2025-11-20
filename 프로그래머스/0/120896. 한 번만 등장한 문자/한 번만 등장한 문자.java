import java.util.*;

class Solution {
    public String solution(String s) {
        
        // 각 문자가 몇번 등장하는지 CHK 
        // 한번만 등장한 문자 추출 -> Map을 순회하면서 value가 1인 키만 모으기
        // 사전 순으로 정렬 -> char 배열로 바꾼 후 Arrays.sort() 사용
        // 문자열로 변환
        
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        
        
        ArrayList<Character> list = new ArrayList<>();
        for (char c : map.keySet()){
            if (map.get(c) == 1) {
                list.add(c);
            }
        }
        
        
        
        Collections.sort(list);
        
        
        
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        
        
        
        return sb.toString();
        
    }
}