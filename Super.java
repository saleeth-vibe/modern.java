import java.util.Scanner;

public class Solution {

    static int findmax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Maximum: " + findmax(a, b));
        scanner.close();
    }
}
