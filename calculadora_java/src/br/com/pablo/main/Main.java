package br.com.pablo.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);
	
	//Scanner; Entrada e Saida
	System.out.print("Digite o primeiro n�mero: ");
	int numero1 = input.nextInt();
	
	System.out.print("Digite um operador: ");
	char operador = input.next().charAt(0);
	
	System.out.print("Digite o segundo n�mero: ");
	int numero2 = input.nextInt();
	
	//INTERPOLA��O
	System.out.println(String.format("Voc� quer fazer a opera��o: %d %c %d"
			, numero1, operador, numero2));
	
	int resultado = 0;
	
	//Condi��o do Operador
	if (operador == '+') {
		resultado = numero1 + numero2;
	}
	else if (operador == '-') {
		resultado = numero1 + numero2;
	}
	else if (operador == '*') {
		resultado = numero1 + numero2;
	}
	else if (operador == '/') {
		resultado = numero1 + numero2;
	} else {
		System.out.println("Operetion undefined;");
	}
	
	System.out.println(String.format("A sua opera��o �: %d %c %d = %d", numero1, operador, numero2, resultado));
	
	input.close();

	}
}


