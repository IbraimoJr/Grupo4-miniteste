/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniteste;

/**
 *
 * @author Ibraimo JR
 */
import java.util.Scanner;

public class exe6parte2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza o  numero");
        int n = input.nextInt();
       if(n>= 0 && n < 26){
           System.out.println("O numero esta no intervalo de 0 a 25");
    } else if(n>= 26 && n <51 ){
           System.out.println("O numero esta no intervalo de 25 a 50");
    }   else if(n>= 51 && n < 76){
           System.out.println("O numero esta no intervalo de 50 a 75");
          
    }    else if(n>= 76 && n < 101){
           System.out.println("O numero esta no intervalo de 75 a 100");
    }
      
      
      
      
      
    }
}
