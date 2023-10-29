package day01_projet1;

import java.util.Scanner;

public class C02_ClassRandom {

    /*SORU:
    Kullanicidan kac tane sayinin ortalamasini bulmasini istedigini sorun
    ve buna bagli olarak aldiginiz degerleri bir array'de saklayin.
    Kullancidan verileri aldiktan sonra
    tum sayilari ve ortalamasini yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac tane sayinin ortalamasini istersiniz: ");
        int sayiSayisi = scan.nextInt();
        int sayiListesi[]= new int[sayiSayisi];

        for (int i = 0; i < sayiSayisi ; i++) {

            System.out.println(i+1+". sayiyi girin: ");
            sayiListesi[i] = scan.nextInt();


        }
        int toplam = 0;
        System.out.println("Sayilar:");
        for (int i = 0; i < sayiSayisi; i++) {
            System.out.println(sayiListesi[i]+" ");
            toplam+=sayiListesi[i];
        }
        System.out.println("Sayilarin ortalamasi: "+ ((double)toplam/sayiSayisi));

    }

}
