package day03_projetDeLivre;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {

    /*
    ====================KİTAPÇI PROJESİ==============================
  * Bir kitapci icin program yazalim kitap no 1000'den baslayacak
   sirali no olsun program baslayinca menu isminde bir method calissin
   Menude olacak özellikler
   * 1-kitap ekle
   * 2-numara ile kitap goruntule
   * 3-kitap adı ile kitap goruntule
   * 4-numara ile kitap sil
   * 5-tum kitaplari listele
   * 6-cikis
 ************************************
   * 1-her kitaba ait kitap no, kitap adi, yazar adi, kitap fiyati ve kayıt tarihi olacak
   * 2-kitap numarasi 1000'den baslamali,
   her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir (count=1000);
   * 3-menu isminde bir method olusturmaliyim ve
   menüye ait özellikler bu metod içinde metodlar seklinde oluşturulmalıdır.
   * 4-Kitaba ait özellikler farklı bir classta tutulmalıdır.

     */

    Scanner scanner = new Scanner(System.in);
    int kitapNo = 1005;
    static ArrayList<Kitap> kitapList = new ArrayList<>(); // bu array içinde kitap classından oluşturulan objeler tutulacak

    public void kitapEkleme() {
        System.out.print("KİTAP ADI GİRİNİZ: ");
        String kitapAdi = scanner.nextLine();
        System.out.print("YAZARI ADI GİRİNİZ: ");
        String yazarAdi = scanner.nextLine();
        System.out.print("KİTAP FİYATI GİRİNİZ: ");
        double kitapFiyati = scanner.nextDouble();
        scanner.nextLine(); // dummy
        Kitap kitap = new Kitap(kitapNo++, kitapAdi, yazarAdi, kitapFiyati, LocalDateTime.now()); //kitap sınıfından parametreli cons. kullanarak bir obje oluşturuldu
        kitapList.add(kitap);// oluşturduğumuz bu objeyi list in sıradaki indexine ekledik
        System.out.println(kitap.toString());
    }

    public void kitapNoIleArama(int aranacakKitapNo) {
        boolean flag = false;
        int i;
        for (i = 0; i < kitapList.size(); i++) {
            if (aranacakKitapNo == kitapList.get(i).getKitapNo()) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println(aranacakKitapNo + " NOLU KİTAP BİLGİLERİ: " + kitapList.get(i));
        } else {
            System.out.println(aranacakKitapNo + " NOLU KİTAP YOKTUR...");
        }
    }

    public void kitapAdiIleArama() {
        System.out.print("ARANACAK KİTAP ADINI GİRİNİZ: ");
        String aranacakKitaoAdi = scanner.nextLine();
        boolean flag = false;
        int i;
        for (i = 0; i < kitapList.size(); i++) {
            if (aranacakKitaoAdi.equalsIgnoreCase(kitapList.get(i).getKitapAdi())) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println(aranacakKitaoAdi + " KİTAP BİLGİLERİ: " + kitapList.get(i));
        } else {
            System.out.println(aranacakKitaoAdi + " İSİMDE KİTAP YOKTUR...");
        }
    }

    public void kitapNoIleSilme() {
        System.out.print("SİLİNECEK KİTAP NUMARASINI GİRİNİZ: ");
        int silinecekKitapNo = scanner.nextInt();
        boolean flag = false;
        int i;
        for (i = 0; i < kitapList.size(); i++) {//silme işlemini yaparken index numarasına ihtiyacımız olduğu için fori döngüsünü kullandık
            if (silinecekKitapNo == kitapList.get(i).getKitapNo()) {
                flag=true;
                break;
            }
        }
        if (flag) {
            System.out.println(silinecekKitapNo + " KİTAP BİLGİLERİ: " + kitapList.get(i));
            kitapList.remove(i);
        } else {
            System.out.println(silinecekKitapNo + " NOLU KİTAP YOKTUR...");
        }
    }

    public void tumKitaplariListele() {
        if (kitapList.size() == 0)
            System.out.println("LİSTE BOŞ...");
        else {
            for (Kitap each : kitapList) {
                System.out.println(each);
            }
        }
    }


}
