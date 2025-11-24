class Solution {
    public int[] solution(int[] num_list) {
        
        int len = num_list.length;
        int last = num_list[len - 1];
        int second = num_list[len - 2];
        int add = 0;
        
        if(last > second) {
           add = last - second;
        } else {
            add = last * 2;
        }
        
        // 새 배열 만들기
        int[] result = new int[len + 1];
        
        // 기존 배열 넣기
        for (int i = 0; i < len; i++) {
            result[i] = num_list[i];
        }
        
        // add를 새 배열에 추가로 담기 (마지막 idx = len)
        result[len] = add;
        
        return result;
    }

}