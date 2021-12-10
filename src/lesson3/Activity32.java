package lesson3;

public class Activity32 {
    public static void main(String[] args) {
        int[] s = {20, 20, 30, 40, 50, 50, 50};
        int[] s1 = new int[s.length];
        s1[0] = s[0];  // vị trí đầu tiên luôn đúng
        int a = 1;     // biến chạy của s1
        int dem = 1;      // đếm số lầm xuất hiện
        for (int i = 1; i < s.length; i++) {   //Chạy từng vị trí của s
            for (int j = 0; j < a; j++) {      //Chạy từng vị trí của s1
                if (s[i] == s1[j]) {           //Nếu s[i] == các phần tử trong s1 thì n tăng 1
                    dem++;
                }
            }
            if (dem == 1) {                      //Nếu n > 1 thì sẽ có lặp phần tử nhau ở trong s
                s1[a] = s[i];
                a++;
            }
            dem = 1;                             //Chuyển sang vòng for ms thì phải gán lại số đếm là 1
        }
        a--;
        System.out.println("Độ dài mới của mảng là: " + a);
        System.out.println("Các phần tử của mảng là: ");
        for (int i = 0; i <= a; i++) {
            System.out.print(s1[i] + "   ");
        }
    }
}
