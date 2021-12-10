package lesson2;

import java.util.Scanner;

public class Activity21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài fibonacci:");
        int n = scanner.nextInt();
        int truoc = 1;  //Số hạng trước
        int sau = 0;    //Số hạng sau
        for (int i=1; i <=n; i++ ) {
            int tam = sau;          //Gán giá trị hiện tại vào 1 biến nhớ
            sau = sau + truoc;      //Tính giá trị sau = giá trị trước + giá trị vừa rồi --> (được giá trị hiện tại mới
            truoc = tam;            //Lúc này gán lại thì giá trị trước là giá trị hiện tại cũ
            System.out.print(sau + ", ");
        }
    }
}
