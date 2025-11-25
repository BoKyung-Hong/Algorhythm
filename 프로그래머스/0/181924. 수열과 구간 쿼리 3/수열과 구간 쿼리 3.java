class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        // queries에서 하나씩 꺼내서 idx로 쓰기
        for(int[] q : queries) {
            int i = q[0];  // q -> arr의 idx
            int j = q[1];
            
            //swap 사용
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        return arr;
    }
}