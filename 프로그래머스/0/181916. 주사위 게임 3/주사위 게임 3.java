import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        
        int[] n = {a, b, c, d};  // 배열에 담기
        Arrays.sort(n);  // 더 쉽게 거르기 위해 오름차순으로 나열
        
        // 네 숫자가 모두 같을 때
        if(n[0] == n[3]){  // 오름차순으로 나열했기 때문에 이렇게만 설정 ok
            return 1111 * n[0];
        }
        
        // 세 숫자가 같을 때
        if(n[0] == n[2]) {
            return (10 * n[0] + n[3]) * (10 * n[0] + n[3]);
        }
        if(n[1] == n[3]) {
            return (10 * n[1] + n[0]) * (10 * n[1] + n[0]);
        }
        
        // 두 개씩 같을 때
        if(n[0] == n[1] && n[2] == n[3]){
            return (n[0] + n[2]) * Math.abs(n[0] - n[2]);
        }
        
        // 두 숫자가 같을 때(나머진 두 숫자는 다른 숫자)
        if(n[0] == n[1]){
            return n[2] * n[3];
        } 
        if(n[1] == n[2]){
            return n[0] * n[3];
        }
        if(n[2] == n[3]){
            return n[0] * n[1];
        }
    
        // 모두 다를 때 (나머지)
        return n[0];
        
    }
}