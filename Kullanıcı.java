import java.util.Scanner;

public class Kullanıcı {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        //DEĞİŞKENLERİ TANIMLADIK

        String userName,passoword,hata,cevap,yensifre;
        //KULLANICIDAN BİLGİLERİNİ ALDIK

        System.out.print("KULLANICI ADINI GİRİNİZ:");
        userName= inp.nextLine();

        System.out.print("ŞİFRENİZİ GİRİNİZ:");
        passoword= inp.nextLine();
        //ŞİFRE İLE İLGİLİ İŞLEMLERİ SAĞLADIK

        if(userName.equals("FARUK")&&(passoword.equals("1234"))) {
            System.out.print("GİRİŞ YAPTINIZ");
        }else {
            System.out.print("HATALI GİRİŞ ŞİFREYİ SIFIRLAMAK İSTERMİSİNİZ?\n(EVET/HAYIR):");
            cevap = inp.nextLine();

            if (cevap.equalsIgnoreCase("EVET")) {
                System.out.print("YENİ ŞİFRENİZİ GİRİNİZ:");
                yensifre = inp.nextLine();

                if (yensifre.equals("1234")) {
                    System.out.print("ŞİFRE OLUŞTURULMADI LÜTFEN YENİ ŞİFRE DENEYİNİZ");

                } else {
                    System.out.print("YENİ ŞİFRE OLUŞTURULDU");
                    passoword = yensifre;
                }
            } else {
                System.out.print("İŞLEM İPTAL EDİLDİ");
            }






        }









    }
    }

