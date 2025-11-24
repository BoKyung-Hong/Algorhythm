import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        // 선수 이름별로 현재 위치를 저장할 map
        Map<String, Integer> positions = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            positions.put(players[i], i);
        }

        // callings 순서대로 처리
        for (String call : callings) {
            int idx = positions.get(call); // call 선수 현재 위치
            if (idx == 0) continue; // 이미 1등이면 추월 불가능

            // 바로 앞 선수와 swap
            String first = players[idx - 1];
            players[idx - 1] = call;
            players[idx] = first;

            // map에 위치 갱신
            positions.put(call, idx - 1);
            positions.put(first, idx);
        }

        return players;
    }
}
