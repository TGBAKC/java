import java.util.Scanner;

public class ders {

    public static void main(String[] args) {

        String kullanici;
        System.out.println("kullanici adi yaziniz");
        Scanner input = new Scanner(System.in);
        kullanici = input.nextLine();

        int sifre = 1234;
        System.out.println("sifreyi giriniz:");

        int no = input.nextInt();
        input.nextLine();

        if (no == sifre) {
            System.out.println("giris basarili");
        } else {

            System.out.println("Sifreniz yanlis. Sifrenizi sifirlamak istermisiniz? (evet/hayir)");
            String cevap = input.nextLine();

            if (cevap.equals("evet")) {
                System.out.println("yeni bir sifre girin:");
                int yeniSifre = input.nextInt();
                input.nextLine();

                if (yeniSifre == sifre) {
                    System.out.println("sifre olusturulmadi, lutfen baska sifre giriniz.");
                } else {
                    System.out.println("sifre olusturuldu.");
                }
            } else {
                System.out.println("sifre sifirlanmadi.");
            }
        }
    }
}













    


