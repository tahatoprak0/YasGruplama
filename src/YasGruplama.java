public class YasGruplama {
    public static void main(String[] args) {

        int yas=(int)(Math.random()*120+1);
        int bebek=0;
        int cocuk=0;
        int ergen=0;
        int genc=0;
        int ortaYas=0;
        int yasli=0;

        while(yas<120){

            System.out.println("Üretilen Yaş:"+yas);
            if (yas<0 | yas > 120){
                System.out.println("ÇIK");
            } else if (yas>=0 & yas <=3) {
                System.out.println("BEBEK");
            } else if (yas>=4 & yas <=12) {
                System.out.println("ÇOCUK");
            } else if (yas>=13 & yas <=19) {
                System.out.println("ERGEN");
            } else if (yas>=20 & yas <=30) {
                System.out.println("GENÇ");
            } else if (yas>=31 & yas <=59) {
                System.out.println("ORTA YAŞ");
            } else if (yas>=60 & yas <=120) {
                System.out.println("YAŞLI");
            }


            if (yas>=0 & yas<=3 ){
                bebek++;

            } else if (yas>=4 & yas <=12) {
                cocuk++;
            } else if (yas>=13 & yas <= 19) {
                ergen++;
            }else if (yas>=20 & yas <=30) {
                genc++;
            }else if (yas>=31 & yas <=59) {
                ortaYas++;
            }else if (yas>=60 & yas <=120) {
                yasli++;
            }
            yas=(int)(Math.random()*130);

        }

        System.out.println("Gruptaki Toplam Bebek Sayısı:"+bebek);
        System.out.println("Gruptaki Toplam Cocuk Sayısı:"+cocuk);
        System.out.println("Gruptaki Toplam Ergen Sayısı:"+ergen);
        System.out.println("Gruptaki Toplam Genc Sayısı:"+genc);
        System.out.println("Gruptaki Toplam Orta Yaşlı Sayısı:"+ortaYas);
        System.out.println("Gruptaki Toplam Yaşlı Sayısı:"+yasli);


    }
}