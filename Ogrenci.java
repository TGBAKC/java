import java.util.Scanner;

public class Ogrenci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu girin: ");
        int matematik = input.nextInt();

        System.out.print("Lütfen fizik notunuzu girin: ");
        int fizik = input.nextInt();

        System.out.print("Lütfen kimya notunuzu girin: ");
        int kimya = input.nextInt();

        System.out.print("Lütfen tarih notunuzu girin: ");
        int tarih = input.nextInt();

        System.out.print("Lütfen müzik notunuzu girin: ");
        int muzik = input.nextInt();

        System.out.print("Lütfen Türkçe notunuzu girin: ");
        int turkce = input.nextInt();

        int ortalama = (matematik + fizik + kimya + tarih + muzik + turkce) / 6;
        System.out.println("Derslerin ortalaması: " + ortalama);

        String sonuc = (ortalama > 60) ? "Geçme durumunuz: Geçtiniz" : "Sınıfta kaldınız";
        System.out.println(sonuc);

        input.close();  
    }
}
