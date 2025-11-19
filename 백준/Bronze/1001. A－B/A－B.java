import java.util.Scanner;

public class Main{
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int diff = A - B;
        
        System.out.println(diff);
    }
}