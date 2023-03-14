//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

import java.util.Scanner;

public class TP01Ex04{

	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.println("digite a base do triangulo: ");
	
	double base = scan.nextDouble();

	System.out.println("digite a altura do triangulo: ");
	
	double altura = scan.nextDouble();

	double area = (base * altura) / 2;

	System.out.println ("a área do triangulo é: " + area);

	}
}