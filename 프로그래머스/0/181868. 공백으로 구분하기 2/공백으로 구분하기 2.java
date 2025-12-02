class Solution {
    public String[] solution(String my_string) {
        // 앞뒤 공백 제거 후 -> 공백 1개 이상 기준으로 단어 나누기
        String[] answer = my_string.trim().split(" +"); 
        return answer;
    }
}
