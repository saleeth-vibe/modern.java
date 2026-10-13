import java.util.Scanner;

public class Solution {

    static int countDigits(int n) {
        int count = 0;

        while (n!= 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Number of digits: " + countDigits(n));
        scanner.close();
    }
}
