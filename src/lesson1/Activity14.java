package lesson1;


public class Activity14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i +=1) {
            System.out.println("Bảng cửu chương " + i);
            for (int a = 1; a <= 10; a +=1) {
                System.out.println(i + "x" + a + "=" + (a * i));
            }
        }
    }
}
