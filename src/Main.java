import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, yas, tutar = 0, gelis, gidis;

        System.out.print("Yaşınız: ");
        Scanner input = new Scanner(System.in);
        yas = input.nextDouble();

        System.out.print("Mesafe (Km Cinsinden): ");
        km = input.nextDouble(); 

        tutar = km * 0.10; // km başına ücret 0.10 TL

        if (yas < 12) {
            tutar = tutar * 0.5; 
        } else if (yas >= 12 && yas < 24) { 
            tutar= tutar * 0.9; 
        } else if (yas >= 65) { 
            tutar = tutar * 0.7;
        }

        System.out.print("Yolculuk Tipini Seçin (1 = Tek Yön, 2 = Gidiş Dönüş): ");
        int yolculukTipi = input.nextInt();

        if (yolculukTipi == 2) {
            tutar= tutar * 1.6; 
        }

        System.out.println("Toplam Tutar: " + tutar + " TL");
    }
}
