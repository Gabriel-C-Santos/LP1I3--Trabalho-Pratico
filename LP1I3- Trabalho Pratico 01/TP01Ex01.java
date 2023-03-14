//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir
//sua área.

import java.util.Scanner;

public class TP01Ex01{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a base do retangulo: ");
		int base;
		base = ler.nextInt();
		
		System.out.println("Digite a altura do retangulo: ");
		int alt;
		alt = ler.nextInt();

		int area = base * alt;
		
		System.out.println("Area do retangulo: " + area);

	}
}