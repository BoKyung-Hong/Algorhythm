class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        // front : idx s 앞 문자들
        String front = my_string.substring(0, s);
        
        // back = front + overwrite_string를 뺀 나머지 
        String back = "";  // 일단 빈 문자열로 초기화
        
        if (s + overwrite_string.length() < my_string.length()) {
            back = my_string.substring(s + overwrite_string.length());
        }
    
        return front + overwrite_string + back;
    }
}