import java.util.*;

public class Main {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        Queue<Integer> q = new ArrayDeque<>();
        
        // N(마지막 사람)까지
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        
        // 요세푸스 문제 출력 형식 : '<'로 시작 + '>'로 끝남
        System.out.print("<");
        
        while(!q.isEmpty()) {
            
            for(int i = 1; i < K; i++) {
                q.offer(q.poll());
            }
            
            
            System.out.print(q.poll());
            
            // 큐가 남아있을 경우에만 ", " 출력
            if (!q.isEmpty()) {
                System.out.print(", ");
            }
        }
        
        System.out.print(">");
        
        sc.close();
    }
}