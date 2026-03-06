import java.util.Scanner;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++) {
            hs.add(sc.nextInt());
        }
        
        int m = sc.nextInt();
        
        // 1,0을 출력할 모음집 만들기 
        StringBuilder sb = new StringBuilder(); 
        for(int i = 0; i < m; i++) {
            int num = sc.nextInt();
            if(i > 0) {
                sb.append(" ");
            }
            sb.append(hs.contains(num) ? 1 : 0);
        }
        
        System.out.println(sb);
    }
}