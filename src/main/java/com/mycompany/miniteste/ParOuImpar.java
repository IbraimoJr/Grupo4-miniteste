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

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza o  numero");
        int n1 = input.nextInt();
       
        if(n1%2 == 0){
          System.out.println("e par");
        }else {
           System.out.println("e impar");
        }
        
      
      
    }
}
