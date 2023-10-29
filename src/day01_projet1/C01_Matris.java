package day01_projet1;

public class C01_Matris {

    public static void main(String[] args) {

          /*SORU:
         5*5 bir matris olusturun ve
         bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.
         rastgele sayilar icin Math class'indan Math.random() kullanabilirsiniz :)
         */
        //ic ice array int
        int [][] matrix = new int[5][5];
        int toplam = 0;
        int toplam2 = 0;

        for (int satir = 0; satir < 5; satir++) {

            for (int sutun = 0; sutun< 5; sutun++) {
                matrix[satir][sutun] = (int)(Math.random() * 10);
                System.out.print(matrix[satir][sutun]+" ");
                if(satir==sutun){
                    toplam+=matrix[satir][sutun];
                }
                if (satir+sutun==4){
                    toplam2+= matrix[satir][sutun];
                }

            }
            System.out.println();


        }
        System.out.println("toplam --> "+ toplam);
        System.out.println("toplam2 --> "+ toplam2);





    }
    }

