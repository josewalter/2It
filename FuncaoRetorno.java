package br.com.source2it;

import java.util.Scanner;

/* Está classe faz a busca do maior valor no vetor e retorno esse valor para o usuário
 * também retorna -1 se a busca ultrapassar um determinado valor.  
 * 
 */

/*
 * Classe de Avaliação de números primos
 * Data: 01/04/2020  08:40
 * Author: José Walter 
 */

public class FuncaoRetorno {

	public static void main(String[] args) {

		int valor[] = { 1, 2, 10, 213, 321, 553, 100000000, 100000002 }; // Declaraçã o do Array e os dados que ele
																			// contém
		int idx_maior = buscarMaiorValor(valor); // Chamada do métdo buscarMaiorValor

		System.out.println("A posição do valor é: " + idx_maior + ", e o maior valor do vetor é: " + valor[idx_maior]);
	}

//=========================================================================
	// Criação dos métodos usados no projeto
	// Método para buscar o maior valor do vetor
	public static int buscarMaiorValor(int[] valor) {

		int maiorValor = 0;
		int retorno = -1;

		for (int i = 1; i < valor.length; i++) {
			if (valor[i] > valor[maiorValor] && valor[i] > 100000000) { // Condição para fazer a busca do maior valor
				maiorValor = i; // váriavel maior recebe o maior valor que vem da busca pelo vetor usando a
								// váriavel (i)
				System.out.println(" O valor ultrapassou 100.000.000, então o retorno é: " + retorno);
				System.out.println("======================================================");

			}
		}
		return maiorValor;
	}
}
