package day03_projetDeLivre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu extends Islemler {

    /*
Menude olacak özellikler

* 1-kitap ekle
* 2-numara ile kitap goruntule
* 3-kitap adı ile kitap goruntule
* 4-numara ile kitap sil
* 5-tum kitaplari listele
* 6-cikis
 */
    Scanner scanner = new Scanner(System.in);

    public void liste() {
        System.out.print("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ: \n" +
                "1. KİTAP EKLEME\n" +
                "2. KİTAP NUMARASI İLE ARAMA\n" +
                "3. KİTAP ADI İLE ARAMA\n" +
                "4. KİTAP NUMARASI İLE SİLME\n" +
                "5. TÜM KİTAPLARI LİSTELE\n" +
                "6. ÇIKIŞ\n" +
                "SEÇİMİNİZ: ");
        int secim = scanner.nextInt();

        try {
            switch (secim) {
                case 1: {
                    kitapEkleme();
                    liste();
                }
                case 2: {
                    System.out.print("ARANACAK KİTAP NUMARASINI GİRİNİZ: ");
                    kitapNoIleArama(scanner.nextInt()); //method parametreli oluşturulduğu için method çağırma da parametre verilmesi gerekir!!!
                    liste();
                }
                case 3: {
                    kitapAdiIleArama();
                    liste();
                }
                case 4: {
                    kitapNoIleSilme();
                    liste();
                }
                case 5: {
                    tumKitaplariListele();
                    liste();
                }
                case 6: {
                    System.exit(1);// derleyici bu satıra geldiğinde çıkış yapacaktır.
                }
                default: {
                    System.out.println("HATALI GİRİŞ YAPTINIZ...");
                    liste();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("gGEÇERLİ KARAKTER GİRİNİZ....");
            liste();
        }
    }





    }
