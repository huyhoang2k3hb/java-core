package lesson1;

import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n:");
        int n = scanner.nextInt();
        System.out.println();
        for (int i = 1; i <= 10; i +=1) {
            System.out.println(n + "x" + i + "=" + (n * i));
        }
    }
}

