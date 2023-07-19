import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] dizi = {2, 4, 6, 8, 10}; // Dizi örneği

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Girin : ");
        int girilenSayi = scanner.nextInt();

        int enYakinKucuk = Integer.MIN_VALUE; // En küçük en yakın sayıyı tutmak için başlangıç değeri
        int enYakinBuyuk = Integer.MAX_VALUE; // En büyük en yakın sayıyı tutmak için başlangıç değeri

        for (int eleman : dizi) {
            if (eleman < girilenSayi && eleman > enYakinKucuk) {
                enYakinKucuk = eleman;
            }
            if (eleman > girilenSayi && eleman < enYakinBuyuk) {
                enYakinBuyuk = eleman;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinBuyuk);

    }
}