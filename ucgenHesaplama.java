
import java.util.Scanner;





 


 public class ucgenHesaplama{

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 System.out.println("birinci kenari giriniz : ");
int a=input.nextInt();
 System.out.println("ikinci kenari giriniz : ");
int b=input.nextInt();
 System.out.println("ucuncu kenari giriniz : ");
int c=input.nextInt();

int cevre = (a+b+c);

System.out.println("ucgenin cevresi :"  + cevre  );
/*   eger ucgen 90 derecelik aciya sahipse      */ 
int alan =a*b/2;
System.out.println("ucgenin alani :"  + alan );

}
 }