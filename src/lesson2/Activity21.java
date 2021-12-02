package lesson2;

import java.util.Scanner;

public class Activity21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài fibonacci:");
        int n = scanner.nextInt();
        int t = 1;
        int s = 0;
        for (int i=1; i <=n; i++ ) {
            int a = s;
            s = s + t;
            t = a;
            System.out.print(s + ", ");
        }
    }
}
