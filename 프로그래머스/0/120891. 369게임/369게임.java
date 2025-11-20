class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String s = String.valueOf(order); // 숫자를 문자로 바꾸기
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9'){
                answer++;
            } 
        }
        return answer;
    }
}