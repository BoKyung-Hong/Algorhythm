class Solution {
    // 현재 빈병 수로 교환 가능한 콜라 수를 계산
    // 마신 후 다시 생긴 빈 병을 포함하여 빈병 총합 갱신
    // 총 받은 콜라 수에 더하기
    // empty < a 가 되면 종료
    public int solution(int a, int b, int n) {  // a가져가면 b만큼 교환 
        
        int answer = 0;  // 총 받을 수 있는 콜라 (받은 콜라 : newCoke)
        int empty = n;  // 내가 마신 콜라
        
        while (empty >= a) {
            
            int newCoke = (empty / a) * b;  // 교환해서 얻는 콜라 수
            
            answer += newCoke;              // 총 받은 콜라
            
            empty = (empty % a) + newCoke;  // 못바꾼 콜라 + 받은 콜라 = 내가 갖고 있는 콜라 
        }
        return answer;
    }
}