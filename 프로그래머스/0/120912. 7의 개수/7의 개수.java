class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int a : array) {
            String str = String.valueOf(a);  // 숫자 -> 문자열 (문자열 한 글자씩 뽑아서 7이 있는지 확인해야하기 때문에)
            
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}