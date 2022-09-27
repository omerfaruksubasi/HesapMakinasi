import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    String islem ;
        int sayi1,sayi2;
        float sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("isleme giricek sayiyi giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("isleme giricek sayiyi giriniz: ");
        sayi2= input.nextInt();
        System.out.print("yapicaginiz islemi giriniz: ");
        islem = input.next();
        switch (islem){
            case "+":
                sonuc=sayi1+sayi2;
                System.out.println("sonuc: "+sonuc);
                break;
            case "-":
                sonuc=sayi1-sayi2;
                System.out.println("sonuc: "+sonuc);
                break;
            case "*":
                sonuc=sayi1*sayi2;
                System.out.println("sonuc: "+sonuc);
                break;
            case "/":
                sonuc=sayi1/sayi2;
                System.out.println("sonuc: "+sonuc);
                break;
            default:
                System.out.println("yanlis deger girdiniz");
                break;
        }
    }
}
