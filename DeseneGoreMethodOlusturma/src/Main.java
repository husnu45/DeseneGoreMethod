import java.util.Scanner;

public class Main{

    // Recursive metot
    static void islemYap(int n, int originalN) {
        // Şu anki n değerini yazdır
        System.out.print(n + " ");

        // Temel durum: n negatif veya 0 ise işlemi sonlandır
        if (n <= 0) {
            return;
        }

        // 5 çıkar ve sonucu yazdır
        islemYap(n - 5, originalN);

        // Son adımda n değerini geri artır ve sonucu yazdır
        if (n == originalN) {
            return;
        }
        islemYap(n + 5, originalN);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir n değeri girin: ");
        int n = scanner.nextInt();

        islemYap(n, n);
    }

}