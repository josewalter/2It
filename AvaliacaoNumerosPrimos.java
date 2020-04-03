package br.com.source2it;

import java.util.Scanner;

/* Est� classe analisa  o parentesco entre n�meros primos  
 * 
 */

/*
 * Classe de compara��o de n�meros primos
 * Data: 02/04/2020  10:51
 * Author: Jos� Walter 
 */

public class AvaliacaoNumerosPrimos {

	public static void main(String[] args) {

		int numeroInverte;
		int numeroInvertido = 0;

		Scanner dados = new Scanner(System.in);

		System.out.println(" Digite o n�mero que deseja inverter!");

		numeroInverte = dados.nextInt();

		// Esta � a condi��o para fazer a invers�o
		while (numeroInverte > 0) {
			numeroInvertido = numeroInvertido * 10;
			numeroInvertido = numeroInvertido + (numeroInverte % 10);
			numeroInverte = numeroInverte / 10;
		}
		System.out.println("Este � o n�mero invertido: " + numeroInvertido);
	}

}
