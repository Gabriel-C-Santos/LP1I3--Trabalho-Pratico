//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
//digitado.

import java.util.Scanner;

public class TP01Ex02{

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("digite a aresta do quadrado: ");

	double aresta = scan.nextDouble();

    double area = aresta * 2;

	System.out.println ("a area do quadrado é " + area);

	}
}