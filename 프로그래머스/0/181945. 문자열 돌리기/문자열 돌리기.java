import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next().chars().mapToObj(c -> (char) c).forEach(System.out::println);
    }
}