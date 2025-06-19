import java.util.Scanner; 

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Yarı çapı giriniz: ");
        int r = input.nextInt();

        System.out.println("Açıyı (alpha) giriniz: ");
        double a = input.nextDouble();

        double pi = 3.14;  

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double dilimAlan = (pi * (r * r) * a) / 360;

        System.out.println("Tam Dairenin Alanı : " + alan);
        System.out.println("Tam Dairenin Çevresi : " + cevre);
        System.out.println("Daire Diliminin Alanı (alpha = " + a + " derece): " + dilimAlan);
    }
}
