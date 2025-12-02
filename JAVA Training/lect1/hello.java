// pallindrome or not

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;     // last digit
            rev = rev * 10 + digit; // reverse number
            n = n / 10;             // remove last digit
        }

        if (original == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
    }
}
