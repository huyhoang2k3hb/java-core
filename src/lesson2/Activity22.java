package lesson2;

import java.util.Scanner;

public class Activity22 {
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n:");
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        float tb = (float) s / n;
        System.out.println("Tổng từ 1 đến " + n + " là " + s);
        System.out.println("Trung bình là " + tb);
    }*/

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n:");
        int n = scanner.nextInt();
        int s = 0;
        int i = 1;
        while (i <= n) {
            s = s + i;
            i = i + 1;
        }
        float tb = (float) s / n;
        System.out.println("Tổng từ 1 đến " + n + " là " + s);
        System.out.println("Trung bình là " + tb);
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n:");
        int n = scanner.nextInt();
        int s = 0;
        int i = 0;
        do {
            i = i + 1;
            s = s + i;
        }
        while (i <= n - 1);
        float tb = (float) s / n;
        System.out.println("Tổng từ 1 đến " + n + " là " + s);
        System.out.println("Trung bình là " + tb);
    }
}

