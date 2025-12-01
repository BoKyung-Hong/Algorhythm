import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int first = -1;  // 배열에서 처음으로 2가 나타나는 위치 (-1 : 아직 2를 발견하지 못한 상태)
        int last = -1;  // 배열에서 마지막으로 2가 나타나는 위치
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (first == -1) first = i; // first == -1이면 처음 발견한 2니까 처음발견할때 -> first에 저장
                last = i; // 2를 발견할 때마다 갱신 -> 마지막 2의 위치 추적
            }
        }
        
        if (first == -1) { // 2가 없는 경우
            return new int[]{-1};
        }
        
        // first ~ last 구간 추출
        int[] answer = new int[last - first + 1];
        for (int i = first; i <= last; i++) {
            answer[i - first] = arr[i];  // i -first = 해당 배열은 0부터 시작함  
        }
        
        return answer;
    }
}

