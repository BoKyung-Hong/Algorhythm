class Solution {
    public int[] solution(String my_string) {
        
        int[] count = new int[52]; 
        
        for(char c : my_string.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                count[c - 'A']++; // 문자를 숫자화해서 인덱스로 사용
            } else {
                count[(c - 'a') + 26]++;
            }
        }
        
        return count;
    }
}