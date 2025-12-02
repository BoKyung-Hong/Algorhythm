class Solution {
    public int[] solution(String myString) {
        // "x"를 기준으로 문자열 나누기
        String[] parts = myString.split("x", -1);

        // 각 문자열 길이를 저장할 배열
        int[] answer = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            answer[i] = parts[i].length();
        }

        return answer;
    }
}
