class Solution {
    public String solution(String cipher, int code) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < cipher.length(); i++) {
            
            if((i + 1) % code == 0) {  // i는 0부터 시작 : (i + 1)로 사용 -> 첫번째(i = 0)글자는 code가 1이어야함 => 1의 배수는 무시 가능
                sb.append(cipher.charAt(i));
            }
        }
        
        return sb.toString();
    }
}