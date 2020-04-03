package br.com.source2it;

import java.util.Scanner;

/*Dois números inteiros não negativos são chamados de irmãos se eles podem ser obtidos uns
 dos outros, apenas
● entrada: N (inteiro)
● saída: inteiro */

/*
 * Classe entrada e saída de dados
 * Data: 28/03/2020  13:10
 * Author: José Walter 
 */

public class EntradaSaidaDados {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		int ban;// flag

		do {
			try {
				ban = 0;
				Integer entrada; // variável de entrada de dados
				Integer saida; // variável de saída de dados

				System.out.println("Digite um número interiro!"); // Mensagem para o usuário de quais os dados que devem
																	// ser digitados.
				entrada = dados.nextInt(); // Entrada de dados.
				saida = entrada;
				System.out.println("Este foi o número que você digitou, " + saida + ", ele é um número inteiro "); // mostrando
																													// os
																													// dados
																													// na
																													// tela
																													// para
																													// o
																													// usuário.

				dados.close(); // Encerrando o programa.
			} catch (Exception e) { // Gera a exceção caso o usuario digite uma letra
				System.out.println("Este campo não aceita caracteres, frações etc...!!");
				ban = 1;
				dados.nextLine();
			}
		} while (ban != 0);
	}

}
