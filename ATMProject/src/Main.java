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

public class Main {
    public static void main(String[] args) {
        
        ATM atm = new ATM();
     Hesap hesap = new Hesap("hekimcanaktas","123456",2000);
      
     Login login = new Login();
      atm.calis(hesap);
      
        System.out.println("Programdan çıkılıyor...");
      
      
    }
    
}
