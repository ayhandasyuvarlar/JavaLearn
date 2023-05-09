import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double total , kdvValue = 0.18 , kdvIndirimi = 0.8 ;
        double kdvliFiyat ;
        double kdvTutar ;
        Scanner input = new Scanner(System.in);
        System.out.println("Toplam ödemiş olduğunuz tutar ne kadar ");
        total = input.nextDouble() ; 

        String indirim = total > 1000 ?  "uygulansın" : "uygulanmasın"  ;
        
        if(indirim == "uygulansın"){
            kdvTutar = total * kdvIndirimi ; 
            kdvliFiyat = total + kdvTutar ; 
            System.out.println("KDV'li Fiyat  : " + kdvliFiyat);
            System.out.println("Kdv Tutari  : " + kdvIndirimi);
        }else {
            kdvTutar = total * kdvValue ; 
            kdvliFiyat = total + kdvTutar ; 
            System.out.println("KDV'li Fiyat  : " + kdvliFiyat);
            System.out.println("Kdv Tutari  : " + kdvValue);
        }     

    }
}
