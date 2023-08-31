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

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza o primeiro numero");
        int n1 = input.nextInt();
        System.out.println("Introduza o segundo numero");
        int n2 = input.nextInt();
        
        int soma = n1 + n2;
        
        System.out.println("A soma de "+n1+"+"+n2+" e igua a :"+soma);
    }
}
