package br.com.generation.aula02;

import java.util.Scanner;

public class galaolivre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double galoes,litros;
		Scanner leia=new Scanner(System.in);
		System.out.println("Escreva a quantidade de galões: ");
		galoes=leia.nextInt();
		leia.close();
		litros=galoes*3.600;
		System.out.println(galoes+" sao "+litros+" litros.");
		
	}

}
