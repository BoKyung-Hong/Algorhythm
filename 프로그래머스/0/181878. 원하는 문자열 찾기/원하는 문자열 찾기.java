class Solution {
    public int solution(String myString, String pat) {
        
        // 대소문자 구분 없이 -> 한가지로 통일시키기
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if(myString.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}