import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        int Mat, Fizik,Kimya,Turkce,Tarih,Muzik;
        Scanner input=new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        Mat=input.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        Fizik=input.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        Kimya=input.nextInt();

        System.out.println("Turkce notunuzu giriniz:");
        Turkce=input.nextInt();

        System.out.println("Tarih notunuzu giriniz:");
        Tarih=input.nextInt();


        System.out.println("Muzik notunuzu giriniz:");
        Muzik=input.nextInt();

        int total=(Mat+Fizik+Kimya+Turkce+Tarih+Muzik);
        double sonuc=total/6;
        System.out.println("ORTALAMANIZ:"+sonuc);

        boolean kosul=sonuc>=60;
        String gectiMi=kosul?"SINIFI GEÇTİ":"SINIFTA KALDI";
        System.out.println(gectiMi);


    }
}
