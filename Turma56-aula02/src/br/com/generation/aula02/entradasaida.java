package br.com.generation.aula02;

import java.util.Scanner;

public class entradasaida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia=new Scanner(System.in);//Entrada e saida de dados do usuário
		int a,b,soma;
		System.out.println("Escreva o valor de A: ");
		a=leia.nextInt();
		System.out.println("Escreva o valor de B: ");
		b=leia.nextInt();
		soma=a+b;
		
		
		leia.close();
		System.out.println("O resultado da soma é "+soma);
	}

}
