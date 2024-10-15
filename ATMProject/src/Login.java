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
public class Login {
    
    
    public boolean login(Hesap hesap){
   Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz: ");
   String kullaniciAdi = scanner.nextLine();
     System.out.println("Parolanızı  giriniz: ");

   String parola = scanner.nextLine();
   
   if(hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola))  {
       return true;
   }
   else
   {
       System.out.println("Kullanıcı adı veya parola yanlış");
       return false;
   }
   
}
    
}
