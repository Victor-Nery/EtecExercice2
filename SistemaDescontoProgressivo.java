/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadescontoprogressivo;

import java.util.Scanner;

/**
 *
 * @author VICTOR NERY
 */
public class SistemaDescontoProgressivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor total da compra
        System.out.print("Digite o valor total da compra: R$ ");
        double valorTotal = scanner.nextDouble();

        // Variáveis para desconto e valor final
        double desconto = 0;
        double valorComDesconto = 0;

        // Aplica as regras de desconto
        if (valorTotal < 200) {
            desconto = valorTotal * 0.05;
        } else if (valorTotal >= 200 && valorTotal < 300) {
            desconto = valorTotal * 0.10;
        } else {
            desconto = valorTotal * 0.15;
        }

        // Calcula o valor final com desconto
        valorComDesconto = valorTotal - desconto;

        // Exibe o desconto e o valor final
        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor total com desconto: R$ %.2f%n", valorComDesconto);

        scanner.close();
    }
}
