import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        // 문자를 통째로 대소문자 바꿔주는 함수는 없어!!!!
        // 쭉 나열해서 글자 하나씩
        StringBuilder sb = new StringBuilder();
        
        for(char c : a.toCharArray()) {
            
            sb.append(
                Character.isUpperCase(c) ? Character.toLowerCase(c) 
                                        : Character.toUpperCase(c)
            );  
        } 
        
        System.out.println(sb.toString());
    }
}