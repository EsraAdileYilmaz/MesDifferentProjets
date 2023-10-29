public class calisma extends calismaParent {

    public  void method2() {
        System.out.println("guncellendi");
    }

    String isim="gulnur";


        public static void main (String[] args){


            calismaParent obj = new calisma();

            System.out.println(obj.isim);

            obj.method2();
        }
    }

