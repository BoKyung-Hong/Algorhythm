import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        
        List<String> list = new ArrayList<>();

        
        for(int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {   // l이면 왼쪽
                for (int j = 0; j < i; j++) {
                    list.add(str_list[j]);
                }
                break;  // 첫 발견 후 종료
            } 
            
            else if (str_list[i].equals("r")) {  // r이면 오른쪽
                for (int j = i + 1; j < str_list.length; j++) {
                    list.add(str_list[j]);
                }
                break;  // 첫 발견 후 종료
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}