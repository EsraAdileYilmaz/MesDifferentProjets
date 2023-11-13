package day04_projetDeATM;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C01_ProjetDeATM {


    static double bakiye;
    static String kartNo = "1234123412341234";//16 haneli bir kart no.
    static int sifrem = 1234;

    static Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.println("Java Bank'a hosgeldiniz !\n");
        int sifre;

        do {
            System.out.println("Lutfen kart numaranizi giriniz: ");
            kartNo = scan.nextLine();

            System.out.println("Lutfen sifrenizi giriniz: ");
            sifre = scan.nextInt();
            scan.nextLine();//nextline satir atlama problemini asmak icin yapildi.//dummy satiri
            //yoksa kart no almadan direk sifreye geciyor.
            if(sifre != sifrem || kartNo.replace(" ", "").length() != 16)  {
                //kullanicinin giciklik hakki tesbit edilmis.
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Islem Basarisiz !");
                System.out.println("Hatali tuslama yaptiniz !");		}
        }while(sifre != sifrem || kartNo.replace(" ", "").length() != 16);

        atmPanel();
    }


    public static void atmPanel() {
        System.out.println("Ｋｏｎｔｒｏｌ ｅｄｉｌｉｙｏｒ．．．");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Sifreniz dogrulandi... !\n");


        char islem =' ';
        do {
            System.out.println("Lutfen yapmak istediginiz islemi giriniz ↓ "
                    + "\nA->Bakiye sorgula\nB->Para yatirma\nC->Para cekme\nD->Para gonderme"
                    + "\nE->Sifre degistirme \nF->Cikis\n");
            islem = scan.next().toUpperCase().charAt(0);//A girerse bakiye,B girerse para yatirma vb..
            switch (islem) {
                case 'A':
                    bakiyeSorgula();
                    break;
                case 'B':
                    paraYatir();
                    break;
                case 'C':
                    paraCekme();
                    break;
                case 'D':
                    paraGonder();
                    break;
                case 'E':
                    sifreDegistir();
                    break;
                case 'F':
                    System.out.println("Bilgi fisi almak ister misiniz\nEvet icin 'E' Dogayi korumak icin 'H'");
                    char a = scan.next().toUpperCase().charAt(0);//fis almada 'E' ve 'H' yi icine kaydetmek icin
                    if (a=='E') {//bilgi fisi almak istersek=Evet icin 'E'
                        fatura();// fis almak icin yapilmis bir methoddur.
                    }else {//bilgi fisi almak istemezsek=Dogayi korumak icin 'H'
                        System.out.println("TESEKKURLER DOGA'YA KATKIDA BULUNDUNUZ !!!");
                    }
                    break;

                default:
                    System.out.println("Lutfen gecerli bir islem seciniz !\n");
                    break;
            }
        }while(islem !='F');//F'ye basilmadigi surece devam et

        System.out.println("Cikis yapildi");

    }


    public static void sifreDegistir() {

        System.out.println("Lutfen eski sifrenizi dogrulayiniz..!");
        int sifre  = scan.nextInt();


        if (sifrem == sifre) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Sifreniz dogrulandi! Lutfen yeni sifrenizi giriniz...");
            sifre=scan.nextInt();
            System.out.println("Islem tamamlandi !\n");

        }else {// (sifrem != sifre) ise
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Islem Basarisiz !");
            System.out.println("Sifreler eslesmiyor !");

        }

    }


    public static void paraGonder() {

        System.out.println("Lutfen gondermek istediginiz kisinin hesap numarasini (IBAN) giriniz...");
        scan.nextLine();//nextline satir atlama problemini asmak icin yapildi.
        String IBAN = scan.nextLine();

        if (IBAN.startsWith("TR") && IBAN.replaceAll("\\s", "").length() == 26 ) {

            System.out.println("IBAN kontrol ediliyor...\nIBAN dogrulandi !");
            System.out.println("\nLutfen gondermek istediginiz tutari giriniz...");
            double havaleTutari = scan.nextDouble();
            if (havaleTutari>bakiye) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Islem Basarisiz !");
                System.out.println("Maalesef bakiyenden fazla bir tutar gonderemezsin !\n");
            }else {//havaleTutari<bakiye ise
                bakiye-=havaleTutari;
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Islem tamamlandi !\n");
            }



        } else {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Gecersiz IBAN !\n");
        }



    }


    public static void fatura() {
        LocalDateTime lcd = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy"+" HH.mm");
        lcd.format(dtf);
        System.out.println("+-------------------+\r\n"
                + "|  "+lcd.format(dtf)+  "|\r\n"
                + "|                   |\r\n"
                + "|     JAVA BANK     |\r\n"
                + "|                   |\r\n"
                + "|                   |\r\n"
                + "|                   |\r\n"
                + "|                   |\r\n"
                + "|                   |\r\n"
                + "|                   |\r\n"
                + "|                   |\r\n"
                + "|    TESEKKURLER    |\r\n"
                + "+-------------------+");


    }


    public static void paraCekme() {
        System.out.println("Lutfen cekmek istediginiz tutari giriniz: ");
        double cekilenTutar = scan.nextDouble();
        if (bakiye>= cekilenTutar) {
            bakiye-=cekilenTutar;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Islem tamamlandi !\n");

        }else {//bakiye <= cekilenTutar ise
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Islem Basarisiz !");
            System.out.println("Maalesef bakiyenden fazla bir tutar cekemezsin !\n");
        }

    }


    public static void paraYatir() {
        System.out.println("Yatirmak istediginiz tutari giriniz...");
        double yatirilanTutar = scan.nextDouble();
        bakiye+=yatirilanTutar;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Islem tamamlandi !\n");

    }


    public static void bakiyeSorgula() {
        System.out.println("Bakiyeniz = "+ bakiye+"\n€'dur.");



        }
}
