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

public class negativoOuPositivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza o  numero");
        int n1 = input.nextInt();
       
        if(n1<0){
          System.out.println("Numero negativo");
        }else {
           System.out.println("Numero positivo");
        }
      
        
      
    }
}
