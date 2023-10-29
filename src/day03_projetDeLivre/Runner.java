package day03_projetDeLivre;

import java.time.LocalDateTime;

public class Runner {

    public static void main(String[] args) {


        Islemler islemler=new Islemler();
        Kitap kitap1=new Kitap(1000,"SERENAD","ZÜLFÜ LİVANELİ",150, LocalDateTime.now());
        islemler.kitapList.add(kitap1);
        Kitap kitap2=new Kitap(1001,"EMPATİ","ADAM FAWER",200, LocalDateTime.now());
        islemler.kitapList.add(kitap2);
        Kitap kitap3=new Kitap(1002,"MELEKLER VE ŞEYTANLAR","DAN BROWN",170, LocalDateTime.now());
        islemler.kitapList.add(kitap3);
        Kitap kitap4=new Kitap(1003,"BEYAZ ZAMBAKLAR ÜLKESİNDE","GRİGORİY PETROV",100, LocalDateTime.now());
        islemler.kitapList.add(kitap4);
        Kitap kitap5=new Kitap(1004,"UÇURTMA AVCISI","KHALED HOSSEİNİ",150, LocalDateTime.now());
        islemler.kitapList.add(kitap5);
        Menu menu = new Menu();
        menu.liste();
    }
}
