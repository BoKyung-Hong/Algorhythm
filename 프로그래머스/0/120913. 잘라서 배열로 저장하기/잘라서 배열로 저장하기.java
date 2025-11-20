class Solution {
    public String[] solution(String my_str, int n) {
        
        // 필요한 배열 크기 (n만큼씩 자르기)
        int size = (my_str.length() + n - 1) / n;
        
        String[] answer = new String[size];
        
        
        for(int i = 0; i < size; i++) {
            // 시작 인덱스
            int start = i * n;
            // 끝 인덱스
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);  // 잘라서 배열에 저장
            
        }
        
        return answer;
    }
}