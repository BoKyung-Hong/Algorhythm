class Solution {
    public int solution(String number) {
        
        int answer = 0;
        
        for(int i = 0; i < number.length(); i++){
            answer += number.charAt(i) - '0'; // '0'을 빼서 실제 숫자로 변환
        }
         return answer % 9;
    }
}