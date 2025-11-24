class Solution {
    public int solution(int[] num_list) {
        
        String odd = "";  // 순서대로 나열하기 위해 문자열로 선언
        String even = "";
        
        for(int num : num_list) {
            if(num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        
        // 0일 경우 -> 처리
        int oddNum = odd.equals("") ? 0 : Integer.parseInt(odd);
        int evenNum = even.equals("") ? 0 : Integer.parseInt(even);
        
        return oddNum + evenNum;
    }
}