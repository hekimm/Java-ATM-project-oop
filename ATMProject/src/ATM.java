/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
          Login login = new Login();
        Scanner scanner  =new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz... ");
        System.out.println("***************************");
        System.out.println("Kullanıcı Girişi");
         System.out.println("***************************");
         int girisHakki = 3;
      while(true){
          if(login.login(hesap)){
          System.out.println("Giriş başarılı");
          break;
        }
          else {
                System.out.println("Giriş Başarısız...");
                girisHakki -= 1;
                System.out.println("Kalan Giriş Hakkı : " + girisHakki);
            }
                   if (girisHakki == 0 ){
                System.out.println("Giriş Hakkınız Bitti...");
                
                break;
                
            }
           

    }
      
      
        System.out.println("*********************************");
        String islemler = "1. Bakiye Görüntüle\n"
                          + "2. Para Yatırma\n"
                          + "3. Para Çekme\n"
                          + "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("**********************************");
        
        while(true){
            System.out.println("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
             if(islem.equals("q")){
                 break;
             }
             else if(islem.equals("1")){
                 System.out.println("Bakiyeniz " + hesap.getBakiye() );
             }
             
             else if(islem.equals("2")){
               
                 System.out.println("Ne kadar yatırmak istiyorsunuz");
                 int miktar =scanner.nextInt();
                 hesap.paraYatir(miktar);
             }
             else if(islem.equals("3")){
                 System.out.println("Ne kadar çekmek istiyorsunuz");
                 int miktar =scanner.nextInt();
                 hesap.paraCek(miktar);
             }
             
             else{
                 System.out.println("Hatalı işlem girdiniz !!");
             }
        }
    
}
}
