class Solution {
    public String solution(int[] numLog) {
        
        // 문자 받아서 이어붙이기 위해
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < numLog.length; i++) {  // length() -> X
            
            int diff = numLog[i] - numLog[i - 1];  // 이전 값과의 차이
            
            if (diff == 1) sb.append('w');
            else if (diff == -1) sb.append('s');
            else if (diff == 10) sb.append('d');
            else if (diff == -10) sb.append('a');
        }
        
        return sb.toString();
    }
}
