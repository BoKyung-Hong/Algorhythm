class Solution {
    public long solution(String numbers) {
        String[] eng = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i = 0; i < eng.length; i++) {
            
            // 숫자 문자열로 바꾸기
            numbers = numbers.replaceAll(eng[i], String.valueOf(i));
        }
        
        // 숫자 문자열 -> 정수로 변환 
        // 큰 숫자일수도 있으니 Integer 대신 Long으로!
        return Long.parseLong(numbers);
    }
}