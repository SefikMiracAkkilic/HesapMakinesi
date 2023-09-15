import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1,n2,select;

        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch (select){
            case 1 :
                System.out.print("Toplam : " + (n1 + n2));
                break;
            case 2 :
                System.out.print("Çıkarma : " + (n1 - n2));
                break;
            case 3 :
                System.out.print("Çarpma : " + (n1 * n2));
                break;
            case 4 :
                System.out.print("Bölme : " + (n1 / n2));
                break;
            default:
                System.out.println("İŞLEMİNİZ YANLIŞTIR");1

        }



    }
}