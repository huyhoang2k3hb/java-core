package lesson1;

import java.util.Scanner;

public class Activity12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n:");
        int n = scanner.nextInt();
        System.out.print(n + "+" + n*11 + "+" + n*111 + "=" + (n + n*11 + n*111));
    }
}
