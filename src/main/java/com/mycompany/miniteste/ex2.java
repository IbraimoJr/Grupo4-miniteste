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

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza o Raio");
        int r = input.nextInt();
        double p = 3.14159;
        
        double area = (r*r)* p ;
        System.out.printf("%.4f",area);
    }}

