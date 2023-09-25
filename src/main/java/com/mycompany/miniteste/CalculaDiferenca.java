package com.mycompany.miniteste;

import java.util.Scanner;

public class CalculaDiferenca {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int A, B, C, D, diferenca;
        System.out.println("Digite os valor de A");
        A = sc.nextInt();
        System.out.println("Digite os valor de B");
        B =sc.nextInt();
        System.out.println("Digite os valor de C");
        C =sc.nextInt();

        diferenca = (A*B-C*D);
        System.out.println("A diferenca é " + diferenca);
    }
}
