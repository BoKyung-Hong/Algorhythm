import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        HashSet<String> hs = new HashSet<>();
        
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            String action = sc.next();
            
            if(action.equals("enter")) {
                hs.add(name);
            } else {
                hs.remove(name);
            }
        }
        
        ArrayList<String> list = new ArrayList<>(hs);
        Collections.sort(list, Collections.reverseOrder());
        
        for(String name : list) {
            System.out.println(name);
        }
    }
}