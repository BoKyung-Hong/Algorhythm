class Solution {
    public int solution(int a, int b) {
        
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);
        int ab = Integer.parseInt(sb.toString());
        int abab = 2 * a * b;
        
        return Math.max(ab, abab);
    }
}