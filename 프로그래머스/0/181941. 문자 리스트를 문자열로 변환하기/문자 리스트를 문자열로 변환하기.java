class Solution {
    public String solution(String[] arr) {
        
        StringBuilder sb = new StringBuilder();
        
        for(String s : arr) {  // 문자열 배열 -> String로 빼야해!
            sb.append(s);
        }
        
        return sb.toString();  // 문자열로 출력
    }
}