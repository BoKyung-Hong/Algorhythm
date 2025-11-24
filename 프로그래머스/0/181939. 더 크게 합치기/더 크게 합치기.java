class Solution {
    public int solution(int a, int b) {
        
        StringBuilder sb1 = new StringBuilder();
        sb1.append(a).append(b);
        int ab = Integer.parseInt(sb1.toString());
        
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b).append(a);
        int ba = Integer.parseInt(sb2.toString());
        
        return Math.max(ab, ba);  // Math : 대문자로 시작!
        
    }
}