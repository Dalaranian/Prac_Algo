import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        StringBuilder builder = new StringBuilder();
        
        builder.append(a);
        builder.append(b);
        
        System.out.println(builder.toString());
    }
}