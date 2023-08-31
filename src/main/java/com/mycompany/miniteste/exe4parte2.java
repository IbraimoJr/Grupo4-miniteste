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

public class exe4parte2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int n;
      int n2;
  
      do{
            System.out.println("Introduza a hora de inicio");
         n = input.nextInt();
         System.out.println("Introduza a hora de termino");
        n2 = input.nextInt();
    
          
          
      }while(n<1&&  n>n2  && n2>24);
      int duracao = n2 -n;
        System.out.println("A duracaco do e:"+duracao);
    }
}
