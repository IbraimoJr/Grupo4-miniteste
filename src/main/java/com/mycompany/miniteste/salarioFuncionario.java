package com.mycompany.miniteste;
import java.util.Scanner;

public class salarioFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numFuncionario, numHoraTrabalhadas; 
        double valorPorHoras, salario;

        System.out.println("Digite numero do funcionario");
        numFuncionario = sc.nextInt();
        System.out.println("Digite o numero de horas Trabalhadas pelo funcionario");
        numHoraTrabalhadas = sc.nextInt();

        System.out.println("Introduza o valor a pagar por hora");
        valorPorHoras = sc.nextInt();

        salario = valorPorHoras*numHoraTrabalhadas;
        System.out.println("mumero: " + numFuncionario + "Salario " + salario);
    }
}
