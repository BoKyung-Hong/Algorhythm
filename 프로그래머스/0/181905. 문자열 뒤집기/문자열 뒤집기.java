class Solution {
    public String solution(String my_string, int s, int e) {
        
        char[] c = my_string.toCharArray();
        
        while(s < e) {
            char temp = c[s];
            c[s] = c[e];
                c[e] = temp;
            s++;
            e--;
        }
        
        return new String(c);  // 다시 문자열로 변환하기!
    }
}