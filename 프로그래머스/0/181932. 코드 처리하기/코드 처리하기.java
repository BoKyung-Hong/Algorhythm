class Solution {
    // mode 나누기 
    // 1인지 아닌지 나누기
    // 짝/홀수 나누기
    public String solution(String code) {
        
        String answer = "";
        int mode = 0;  // 초기화해주기
        
        for(int idx = 0; idx < code.length(); idx++){  // 전체 돌리기
            char c = code.charAt(idx);
            
            if(c == '1') mode = 1 - mode;  // 두가지를 묶어서 하나로 계산 가능
            
            else{
                if((mode == 0 && idx % 2 == 0) || (mode == 1 && idx % 2 == 1)) {
                answer += c; // 맨 뒤에 붙이는 code[idx] = 해당하는 한 글자 'c'
                 }
            }
            
        }
                   
            if(answer.isEmpty()){
                return "EMPTY";
            } else{
                return answer;
            }
    }
}