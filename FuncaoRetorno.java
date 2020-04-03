package br.com.source2it;

import java.util.Scanner;

/* Est� classe faz a busca do maior valor no vetor e retorno esse valor para o usu�rio
 * tamb�m retorna -1 se a busca ultrapassar um determinado valor.  
 * 
 */

/*
 * Classe de Avalia��o de n�meros primos
 * Data: 01/04/2020  08:40
 * Author: Jos� Walter 
 */

public class FuncaoRetorno {

	public static void main(String[] args) {

		int valor[] = { 1, 2, 10, 213, 321, 553, 100000000, 100000002 }; // Declara�� o do Array e os dados que ele
																			// cont�m
		int idx_maior = buscarMaiorValor(valor); // Chamada do m�tdo buscarMaiorValor

		System.out.println("A posi��o do valor �: " + idx_maior + ", e o maior valor do vetor �: " + valor[idx_maior]);
	}

//=========================================================================
	// Cria��o dos m�todos usados no projeto
	// M�todo para buscar o maior valor do vetor
	public static int buscarMaiorValor(int[] valor) {

		int maiorValor = 0;
		int retorno = -1;

		for (int i = 1; i < valor.length; i++) {
			if (valor[i] > valor[maiorValor] && valor[i] > 100000000) { // Condi��o para fazer a busca do maior valor
				maiorValor = i; // v�riavel maior recebe o maior valor que vem da busca pelo vetor usando a
								// v�riavel (i)
				System.out.println(" O valor ultrapassou 100.000.000, ent�o o retorno �: " + retorno);
				System.out.println("======================================================");

			}
		}
		return maiorValor;
	}
}
