//첫 글자를 x로 설정
//x의 등장 횟수(countX), x가 아닌 문자 등장 횟수(countOther)를 센다.
//두 횟수가 처음 같아지는 순간 문자열 하나를 분리
//분리된 이후 남은 문자열에서 다시 반복
//끝까지 반복하면 분리된 문자열 개수를 반환

class Solution {
    public int solution(String s) {
        
        int answer = 0; //분해한 문자열 개수
        char x = s.charAt(0);
        int countX = 0;
        int countOhrer = 0;
        
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        
        // 초기화
        if (countX == 0 && countOhrer == 0) {
                x = c;
            }
        
        if(c ==x) countX++;
        else countOhrer++;
        
        if(countX == countOhrer) {
            
            answer++;
            
            countX = 0;
            countOhrer = 0;
        }
        }
        
        // 끝까지 했는데 countX != countOther -> 마지막 묶음 1개 추가
        if(countX != 0 || countOhrer != 0) {
            
            answer++;
        }
        
        return answer;
    }}