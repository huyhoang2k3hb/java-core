package lesson1;

import java.util.Scanner;

public class Activity12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n:");
        int n = scanner.nextInt();
        System.out.println();
        System.out.print(n + "+" + n + n + "+" + n + n + n + "=" + (n + n*11 + n*111));
    }
}
