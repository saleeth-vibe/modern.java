import java.util.Scanner;

public class Solution {

    static int square(int n) {
        return n * n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(square(n));
        scanner.close();
    }
}
