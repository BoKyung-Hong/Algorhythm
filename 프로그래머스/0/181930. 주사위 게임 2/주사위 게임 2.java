class Solution {
    public int solution(int a, int b, int c) {
        
        // 모두 같은 것부터! <- 두번째 조건에서 모두 같은 거 제외하기 위해(더 좁은 조건을 먼저 검사)
        if(a == b && b == c) {  // 정수 비교 -> ''==' 사용
            return (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        } else if(a == b || b == c || a == c){
            return (a + b + c) * (a*a + b*b + c*c);
        } else {
            return a + b + c;
        }
    }
}