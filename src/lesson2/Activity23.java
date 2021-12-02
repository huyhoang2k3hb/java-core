package lesson2;

import java.util.Scanner;

public class Activity23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thập phân n:");
        int n = scanner.nextInt();
        System.out.print("Số nhị phân là: " + Integer.toBinaryString(n));
    }
}
