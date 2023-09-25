package com.mycompany.miniteste;
import java.util.Scanner;

public class Peca {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int codePec1, codePec2;
    int numero;
    double valorUnit, valorAPagarPec1, valorAPagarPec2;
    
    System.out.println("Qual é a peça que deseja? /n 1-peca 1 n/ 2- peca 2");
    byte peca = sc.nextByte();
    switch(peca){
        case 1:
        System.out.println("Digite o codigo da peça");
        codePec1 = sc.nextInt();
        System.out.println("Digite o numero de peças desejadas");
        numero =sc.nextInt();
        System.out.println("Digite o valor unitario da peca 1");
        valorUnit = sc.nextDouble();

        
        valorAPagarPec1 = numero * valorUnit;
        System.out.println(" O valor total a ser pago pela peça 1 é " + valorAPagarPec1 );
        break;

        case 2:
        System.out.println("Digite o codigo da peça");
        codePec2 = sc.nextInt();
        System.out.println("Digite o numero de peças desejadas");
        numero =sc.nextInt();
        System.out.println("Digite o valor unitario da peca 1");
        valorUnit = sc.nextDouble();
        
        valorAPagarPec2 = numero * valorUnit;
        System.out.println(" O valor total a ser pago pela peça 2 é " + valorAPagarPec2 );
    }
        



    
}    
}
