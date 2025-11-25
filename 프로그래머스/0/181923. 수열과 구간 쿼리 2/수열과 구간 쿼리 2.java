class Solution {
    
    // s ≤ i ≤ e 범위에서 -> idx
    // arr[i] 중
    // k < arr[i] + 가장 작은 arr[i] 
    public int[] solution(int[] arr, int[][] queries) {
        
       int[] result = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {

            // 쿼리 하나를 통째로 꺼내기
            int[] query = queries[q];

            // 쿼리 안에서 s, e, k 꺼내기
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int min = Integer.MAX_VALUE;  // 정수가 가질 수 있는 가장 큰 값

            // s~e 구간에서 k보다 큰 가장 작은 값 찾기
            for(int i = s; i <= e; i++){
                if(arr[i] > k && arr[i] < min){
                    min = arr[i];
                }
            }

            // 못 찾으면 -1
            if(min == Integer.MAX_VALUE){
                result[q] = -1;
            } else {
                result[q] = min;
            }
        }

        return result;
    }
}