import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
  
        String[] temp = myString.split("x");

        // 빈 문자열이 아닌 것 카운트 -> 배열만들기 위해
        int count = 0;
        for (String s : temp) {
            if (!s.equals("")) {
                count++;
            }
        }

        // 배열 만들어서 값 넣기
        String[] answer = new String[count];
        int idx = 0;
        for (String s : temp) {
            if (!s.equals("")) {
                answer[idx] = s;
                idx++;
            }
        }

        // 사전순으로 정렬
        Arrays.sort(answer);

        return answer;
    }
}
