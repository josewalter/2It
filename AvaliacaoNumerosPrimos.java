package br.com.source2it;

import java.util.Scanner;

/* Está classe analisa  o parentesco entre números primos  
 * 
 */

/*
 * Classe de comparação de números primos
 * Data: 02/04/2020  10:51
 * Author: José Walter 
 */

public class AvaliacaoNumerosPrimos {

	public static void main(String[] args) {

		int numeroInverte;
		int numeroInvertido = 0;

		Scanner dados = new Scanner(System.in);

		System.out.println(" Digite o nímero que deseja inverter!");

		numeroInverte = dados.nextInt();

		// Esta é a condição para fazer a inversão
		while (numeroInverte > 0) {
			numeroInvertido = numeroInvertido * 10;
			numeroInvertido = numeroInvertido + (numeroInverte % 10);
			numeroInverte = numeroInverte / 10;
		}
		System.out.println("Este é o número invertido: " + numeroInvertido);
	}

}
