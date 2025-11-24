class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int answer = 0;
        
        // 일단 모든 항을 뽑기
        for(int i =0; i < included.length; i++){  // idx -> i++(O), i += d(X): 인덱스가 d만큼 증가하는 게 아님
            
            int num = a + (i * d);  // (i + 1)번째 항 
            
        
            if(included[i]) {  // 배열이라 included만 쓰면 안되고 [i]도 필요!
                answer += num;
            } 
        }
        return answer;
    }
}