class Solution {
    public int solution(String A, String B) {
        
        // 일단 둘이 길이가 다르면 -1
        if(A.length() != B.length()) return -1;
        
        int len = A.length();
        
        // 임의의 변수 만들기
        String temp = A;

        // 길이가 같다면 -> 밀기
        for(int i = 0; i < len; i++) {
            if(temp.equals(B)) {
                return i;  // 최소 밀기 횟수
            }
            
            //오른쪽으로 한 칸 밀기 (끝 문자 앞으로 가져오기 + 나머지 문자들 그 뒤에 붙이기)
            temp = temp.charAt(len -1) + temp.substring(0, len -1);
        }
        
        return -1;
    }
}