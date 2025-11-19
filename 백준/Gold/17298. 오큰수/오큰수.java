import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // Scanner 대신 BufferedReader 사용 (시간초과 때문)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //  StringBuilder -> 한 줄씩 숫자로 변환
        int n = Integer.parseInt(br.readLine()); 
        
        // 나누기
        String[] input = br.readLine().split(" ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        
        // 답 저장할 배열 
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        
        Stack<Integer> stack = new Stack<>();
        
        // 하나씩 꺼내서 chk
        for (int i = 0; i < n; i++) {
            int curr = numbers[i];
            
            // 그 숫자(curr)가 오큰수인지 확인 
            while (!stack.isEmpty() && numbers[stack.peek()] < curr) {
                int idx = stack.pop();  // 위치는?
                answer[idx] = curr;  // 그 위치의 값 = curr
            }
            
            // 일단 스택에 쌓기 
            stack.push(i);
        }
        
        // 출력도  StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(answer[i]);
            if (i < n - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}