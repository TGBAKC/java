import java.util.Scanner;

public class kiloHesabi{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde, örn: 1.69) giriniz: ");
        double boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = input.nextDouble();

        double kitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + kitleIndeksi);
    }
}
