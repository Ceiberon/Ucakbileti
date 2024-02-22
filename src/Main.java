import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, yas, tutar = 0, gelis, gidis;

        System.out.print("Yaşınız: ");
        Scanner input = new Scanner(System.in);
        yas = input.nextDouble(); // nextInt() yerine nextDouble() kullanılmalı

        System.out.print("Mesafe (Km Cinsinden): ");
        km = input.nextDouble(); // nextInt() yerine nextDouble() kullanılmalı

        tutar = km * 0.10; // km başına ücret 0.10 TL

        if (yas < 12) {
            tutar = tutar * 0.5; // 12 yaşından küçükse indirim uygula
        } else if (yas >= 12 && yas < 24) { // '12' dahil edilmeli, '>=' kullanılmalı
            tutar= tutar * 0.9; // 12 yaşından büyük ve 24 yaşından küçükse indirim uygula
        } else if (yas >= 65) { // 'else if' bloğu başlangıcı hatalıydı
            tutar = tutar * 0.7; // 65 yaşından büyükse indirim uygula
        }

        System.out.print("Yolculuk Tipini Seçin (1 = Tek Yön, 2 = Gidiş Dönüş): ");
        int yolculukTipi = input.nextInt();

        if (yolculukTipi == 2) {
            tutar= tutar * 1.6; // Gidiş-dönüş yapılacaksa tutara %20 indirim uygula
        }

        System.out.println("Toplam Tutar: " + tutar + " TL");
    }
}
