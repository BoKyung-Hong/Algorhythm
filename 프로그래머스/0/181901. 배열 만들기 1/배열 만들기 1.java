import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        
        int size = n / k; // k의 배수 개수
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++){
            answer[i] = k * (i + 1);
        }
        
        return answer;
    }
}