import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat, fizik, tur, kimya, tarih, toplam = 0, sayac = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        mat = input.nextInt();
        if (mat <= 100 && mat >= 0) {
            toplam += mat;
            sayac++;
        }

        System.out.print("Fizik Notu: ");
        fizik = input.nextInt();
        if (fizik <= 100 && fizik >= 0) {
            toplam += fizik;
            sayac++;
        }

        System.out.print("Türkçe Notu: ");
        tur = input.nextInt();
        if (tur <= 100 && tur >= 0) {
            toplam += tur;
            sayac++;
        }

        System.out.print("Kimya Notu: ");
        kimya = input.nextInt();
        if (kimya <= 100 && kimya >= 0) {
            toplam += kimya;
            sayac++;
        }

        System.out.print("Tarih Notu: ");
        tarih = input.nextInt();
        if (tarih <= 100 && tarih >= 0) {
            toplam += tarih;
            sayac++;
        }

        System.out.println("----------------");
        System.out.println("");
        if (toplam / sayac >= 55) {
            System.out.println("Sınıfı Geçtiniz!\nOrtalamanız: " + (toplam / sayac));
        } else {
            System.out.println("Sınıfta Kaldınız! \nOrtalamanız: " + (toplam / sayac));
        }

    }

}