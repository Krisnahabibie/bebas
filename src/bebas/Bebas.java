/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bebas;

import java.util.Scanner;

/**
 *
 * @author krisn
 */
public class Bebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int  gg;
        
        Scanner input = new Scanner(System.in);
          System.out.println("plat nomor ganjil & genap");
          System.out.println("masukkan plat nomor");
          gg = input.nextInt();
          
          if (gg%2==0){
              System.out.println("plat nomor tersebut "+gg+"nomor genap");
          }else{
              System.out.println("plat nomor tersebut "+gg+" nomor ganjil");
          }
    }
    
}
