import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();  // 문자열 이어붙일 땐 StringBuilder 사용!!!
        for(int i = 0; i < n; i++) {
            sb.append(str);
        }
        
        System.out.println(sb.toString());  // sb는 toString()으로 출력
    }
}