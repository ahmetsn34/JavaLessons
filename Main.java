import java.util.Scanner;

public class Main 
  {
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in); //bir sistem tarayıcısı oluşturdum 
      System.out.print("Boyunu Gir (cm) : "); //boy bilgisi için bilgilendirme metni yazdırdım 
      double x = scanner.nextDouble(); // tarayıcıya bunu sayır verisi olarak alması için komut verdim

      System.out.print("Kilonu Gir (kg) : "); //üsteki işlemlerin aynısını kilo için yaptırıyorum 
      double y = scanner.nextDouble(); // ""

      x=x/100;
      double endeks = y/(x*x); //boy kilo endeksinin matematiksle olarak hesaplamasını yaptırdım
       System.out.println(endeks); // ve cıktısını veren komutu yazdırdım . 
    }
  }