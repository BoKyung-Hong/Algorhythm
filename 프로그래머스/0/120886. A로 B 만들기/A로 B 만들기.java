import java.util.*;  // Arrays -> import해주기!!

class Solution {
    public int solution(String before, String after) {
        
        // reverse() : 그냥 문자열을 통째로 거꾸로 뒤집는 것! asc -> csa만 가능
        // 이 문제는 문자의 개수, 종류가 같아야함 >> 같은 순서로 배열해서 같은지 비교하기
        
        char[] bArr = before.toCharArray();
        char[] aArr = after.toCharArray();
        
        // 알파벳 순서대로 정렬 (equals 쓰기 위해서)
        Arrays.sort(bArr);
        Arrays.sort(aArr);
        
        
        return Arrays.equals(bArr, aArr) ? 1 : 0;
    }
}