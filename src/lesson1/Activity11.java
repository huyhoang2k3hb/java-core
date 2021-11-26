package lesson1;

import java.util.Scanner;

public class Activity11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a:");
        int a = scanner.nextInt();
        System.out.println();
        System.out.print("Nhập số b:");
        int b = scanner.nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a mod b = " + (a % b));

    }
}
