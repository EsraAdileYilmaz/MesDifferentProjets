package day01_projet1;

import java.util.Scanner;

public class C03_ProjetArray {

    /* SORU:
    Kullanıcının girdiği öğrenci sayısı ve kullanıcının girdiği toplam
    soru sayısına bağlı olarak, öğrencilerin soruya verdiği cevapları
    tutan bir matris düzenleyin. Bu değerleri rastgele olarak olusturun.
    Değerler A,B,C,D,E olmalı.
    Bir de doğru cevapları tutan tek boyutlu bir diziniz olsun. Bu da
    rastgele oluşturulmalı.
    Sonrasında bu değerleri karşılaştırarak her bir öğrencinin kaç doğru
    ve yanlışı olduğunu gösteren programı yazınız.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Siniftaki ogrenci sayisini giriniz --> ");
        int ogrenciSayisi = scan.nextInt();
        System.out.println("Sinavdaki soru sayisini giriniz --> ");
        int soruSayisi = scan.nextInt();

        char ogrenciCevaplari[][] = new char[ogrenciSayisi][soruSayisi];
        char[] cevapAnahtari = new char[soruSayisi];

        for (int i = 0; i < soruSayisi; i++) {
            cevapAnahtari[i] = cevapOlustur();
            System.out.println(i + 1 + ". Sorunun cevabi " + cevapAnahtari[i]);
        }
        int dogruSayisi = 0;

        for (int ogrenci = 0; ogrenci < ogrenciSayisi; ogrenci++) {

            for (int soru = 0; soru < soruSayisi; soru++) {


                ogrenciCevaplari[ogrenci][soru] = cevapOlustur();
                System.out.println(ogrenci + 1 + " numarali ogrenci " + (int) (soru + 1) + ". soruya cevabi --> " + ogrenciCevaplari[ogrenci][soru]);
                if (cevapAnahtari[soru] == ogrenciCevaplari[ogrenci][soru]) {
                    dogruSayisi++;
                }

            }
            System.out.println(ogrenci + 1 + " numarali ogrencinin dogru sayisi --> " + dogruSayisi + " yanlis sayisi --> " + (soruSayisi - dogruSayisi));

            dogruSayisi = 0;


        }
    }

    private static char cevapOlustur2() {

        char[] secenekler = new char[5];
        secenekler[0] = 'A';
        secenekler[1] = 'B';
        secenekler[2] = 'C';
        secenekler[3] = 'D';
        secenekler[4] = 'E';
        int rastgeleSecenek = (int) (Math.random() * 5);
        return secenekler[rastgeleSecenek];


    }

    private static char cevapOlustur() {

        int rastgeleSecenek = (int) (Math.random() * 5);
        if (rastgeleSecenek == 0) {
            return 'A';
        } else if (rastgeleSecenek == 1) {
            return 'B';
        } else if (rastgeleSecenek == 2) {
            return 'C';
        } else if (rastgeleSecenek == 3) {
            return 'D';
        } else
            return 'E';


    }
}




