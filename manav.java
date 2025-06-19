import java.util.Scanner;

public class manav{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Fiyatlar
        double fiyatArmut = 2.14;
        double fiyatElma = 3.67;
        double fiyatDomates = 1.11;
        double fiyatMuz = 0.95;
        double fiyatPatlican = 5.00;

        // Kullanıcıdan kaç kilo aldığını sor
        System.out.print("Kaç kilo armut aldınız? : ");
        double kiloArmut = input.nextDouble();

        System.out.print("Kaç kilo elma aldınız? : ");
        double kiloElma = input.nextDouble();

        System.out.print("Kaç kilo domates aldınız? : ");
        double kiloDomates = input.nextDouble();

        System.out.print("Kaç kilo muz aldınız? : ");
        double kiloMuz = input.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız? : ");
        double kiloPatlican = input.nextDouble();

        // Hesaplama
        double toplamTutar = (kiloArmut * fiyatArmut) +
                             (kiloElma * fiyatElma) +
                             (kiloDomates * fiyatDomates) +
                             (kiloMuz * fiyatMuz) +
                             (kiloPatlican * fiyatPatlican);

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
