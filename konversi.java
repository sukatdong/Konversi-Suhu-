/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class konversi {
    double c,f,r,k;

    konversi() {
        this.c = c;
    
    }
    
    void operasi(){
    r=(4*c)/5;
    f=(9*c)/5+32;
    k=c+273.15;
        System.out.println("Suhu Dalam Celcius      = " + c + " °C");
        System.out.println("Suhu Dalam Fahrenheit   = " + f + " °F");
        System.out.println("Suhu Dalam Reamur       = " + r + " °R");
        System.out.println("Suhu Dalam Kelvin       = " + k + " K");
        
        if(c>0 && c<100){
             System.out.println("Kondisi Air Normal");
         }
         else if(c <=0){
             System.out.println("Kondisi Air Beku");
         }
         else if (c >= 100){
             System.out.println("Kondisi Air Mendidih");
         }
         System.out.println("------------------------------------------\n\n");

    }
    }
    

