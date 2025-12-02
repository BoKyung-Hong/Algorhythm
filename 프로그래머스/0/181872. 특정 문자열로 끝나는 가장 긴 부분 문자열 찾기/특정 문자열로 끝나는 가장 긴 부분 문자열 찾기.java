class Solution {
    public String solution(String myString, String pat) {
        String answer = "";

        for (int i = 0; i < myString.length(); i++) {
            String sub = myString.substring(0, i + 1);  //글자수 하나씩 늘려서 추출

            if (sub.endsWith(pat)) {
                answer = sub;
            }
        }
        return answer;
    }
}
