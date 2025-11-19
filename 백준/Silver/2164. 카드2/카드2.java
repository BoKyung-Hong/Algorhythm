import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // 직접 입력 x -> BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 정수로 변환

        // 큐 생성
        Queue<Integer> queue = new ArrayDeque<>();

        // 1부터 N까지 큐에 넣기
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        // 카드가 1장 남을 때까지 반복
        while (queue.size() > 1) {
            queue.poll();             // 맨 위 카드 버리기
            queue.offer(queue.poll()); // 다음 카드 맨 뒤로 보내기
        }

        // 마지막 남은 카드 출력
        System.out.println(queue.poll());
    }
}

