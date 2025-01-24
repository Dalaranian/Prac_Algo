import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        new Scanner(System.in)
            .next()
            .chars()
            .mapToObj(c -> (char) c)
            .forEach(System.out::println);
    }
}