/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner(System.in);
        int temp=1;
        System.out.println("+==============================+");
        System.out.println("|   Program Konversi Suhu Air  |");
        System.out.println("+==============================+");
        System.out.println(" Input Data ");
        System.out.println("============");
        System.out.print("Suhu Dalam Celcius : ");
        double celcius = Input.nextDouble();
        konversi konversi = new konversi();
        konversi.c = celcius;
        
        while(temp!=3){
        System.out.println("----------");
        System.out.println("Opsi");
        System.out.println("----------\n");
        System.out.println("1.Lihat Data Konversi ");
        System.out.println("2.Edit Data Konversi ");
        System.out.println("3.Exit\n");
        System.out.print("Masukkan Opsi = ");
        int opsi = Input.nextInt();
        
        switch(opsi){
            case 1 : konversi.operasi();
            break;
            case 2 : System.out.println("\n\nInput Data");
                     System.out.println("============");
                     System.out.print("Suhu Dalam Celcius : ");
                     double input1 = Input.nextDouble();
                     konversi.c = input1;
            break;
            case 3 : System.out.println("\nProgram Selesai ! "); System.exit(0);
            break;
            default : System.out.print("Masukkan Pilihan Dengan Benar !! \n");
                   
            
        }
    }
        
        
        
        
    }
    
}
