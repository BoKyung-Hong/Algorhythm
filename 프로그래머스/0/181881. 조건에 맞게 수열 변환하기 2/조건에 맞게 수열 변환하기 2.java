class Solution {
    public int solution(int[] arr) {
        int x = 0;

        while (true) {
            boolean changed = false;

            for (int i = 0; i < arr.length; i++) {
                int before = arr[i];

                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }

                if (arr[i] != before) {  // 변환 후의 값(arr[i])과 변환하기 전의 값(before)
                    changed = true;
                }
            }

            // 변화가 없으면 arr(x) == arr(x+1)  -> x번 했다고 x를 반환
            if (!changed) return x;

            x++;
        }
    }
}
