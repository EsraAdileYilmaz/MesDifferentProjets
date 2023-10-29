package day02_projet2;

public class C02 {

    public static void main(String[] args) {
        /*Bir matrisin her satırının ve her sütununun toplamını bulan Java Programı yazin
         beklenilen output
         verilen matris
         1 2 3
         4 5 6
         7 8 9
         ise
         1. satırın toplamı: 6
         2. satırın toplamı: 15
         3. satırın toplamı: 24
         1. sütunun toplamı: 12
         2. sütunun toplamı: 15
         3. sütunun toplamı: 18
        seklinde olmalidir*/


        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int satirUzunlugu = matrix.length;
        int sutunUzunlugu = matrix[0].length;
        int satirToplami=0;
        int sutunToplami=0;


        for (int i = 0; i < satirUzunlugu; i++) {
            satirToplami=0;

            for (int j = 0; j < sutunUzunlugu; j++) {
                satirToplami+= matrix[i][j];


            }

            System.out.println(i+1+". satirin indexlerinin toplami = "+ satirToplami);
        }

        for (int i = 0; i < satirUzunlugu; i++) {
            sutunToplami=0;

            for (int j = 0; j < sutunUzunlugu; j++) {
                sutunToplami+= matrix[j][i];
            }
            System.out.println(i+1+". sutunun indexlerinin toplami = "+ sutunToplami);

        }





    }
}
