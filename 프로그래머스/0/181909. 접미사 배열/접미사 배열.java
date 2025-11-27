import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            list.add(my_string.substring(i));  // substring(start) -> idx = start부터 끝까지 자르기
        }
        
        Collections.sort(list); // Collections
        
        return list.toArray(new String[0]);  // list를 배열로 + String[] 타입으로 지정
    }
}