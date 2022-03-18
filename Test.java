
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        int mesafe = 0;
        int age = 0;
        int tip =0;
        double yasIndirimOrani  = 0;
        double yasIndirimi      = 0;
        double normalTutar      ;
        //double yasIndirim       = normalTutar * yasIndirimOrani;
        double indirimliTutar,totalTutar,sonIndirim  ;



        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        mesafe = input.nextInt();

        System.out.println("Yasinizi giriniz : ");
        age = input.nextInt();

        System.out.println("Yolculuk tipini giriniz: 1 or 2 ");
        tip = input.nextInt();

        switch (tip){
            case 1:
                if(age < 12 && age >= 0){
                    normalTutar = (mesafe * 0.10)/2 ;// %50 indirim
                    System.out.println(normalTutar + "TL");
                }
                if(age >=12 && age <=24){
                    normalTutar    = (mesafe * 0.10) ;
                    indirimliTutar = normalTutar * 1/10;
                    totalTutar     = normalTutar - indirimliTutar;
                    System.out.println(totalTutar + "TL");
                }
                if (age > 65){
                    normalTutar = (mesafe * 0.10);
                    indirimliTutar = normalTutar * 3/10;
                    totalTutar     = normalTutar - indirimliTutar;
                    System.out.println(totalTutar + "TL");
                }
                if (age > 25 && age < 65){
                    normalTutar = (mesafe * 0.10);
                    System.out.println(normalTutar + "TL");
                }
            case 2:
                if(age < 12 && age >= 0){
                    normalTutar     = (mesafe * 0.10)/2 ;// %50 indirim
                    indirimliTutar  = normalTutar * 2/10;
                    totalTutar     =  (normalTutar - indirimliTutar) * 2;
                    System.out.println(totalTutar + "TL");
                }
                if(age >=12 && age <=24){
                    normalTutar    = (mesafe * 0.10) ;
                    indirimliTutar = normalTutar * 1/10;
                    sonIndirim     = ((normalTutar - indirimliTutar) * 2/10);
                    totalTutar     =  (normalTutar - indirimliTutar - sonIndirim) * 2 ;
                    System.out.println(totalTutar + "TL");
                }
                if (age > 65){
                    normalTutar = (mesafe * 0.10);
                    indirimliTutar = normalTutar * 3/10;
                    sonIndirim     = ((normalTutar - indirimliTutar) * 2/10);
                    totalTutar     = (normalTutar - indirimliTutar - sonIndirim) * 2 ;
                    System.out.println(totalTutar + "TL");
                }
                if (age > 25 && age < 65){
                    normalTutar = (mesafe * 0.10);
                    sonIndirim     = ((normalTutar ) * 2/10);
                    totalTutar     = (normalTutar  - sonIndirim) * 2 ;
                    System.out.println(totalTutar + "TL");
                }
            case 3:
                if (tip != 1 && tip!= 2){
                    System.out.println("Hatali giris yaptiniz");
                }

        }



    }
}
