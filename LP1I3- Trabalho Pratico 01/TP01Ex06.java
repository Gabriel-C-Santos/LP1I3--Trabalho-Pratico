//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
//digitados.

import java.util.Scanner;

public class TP01Ex06 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("digite o 1o valor");
	double v1 = scan.nextDouble();

	System.out.println("digite o 2o valor");
	double v2 = scan.nextDouble();
	
	System.out.println("digite o 3o valor");
	double v3 = scan.nextDouble();

	System.out.println("digite o 4o valor");
	double v4 = scan.nextDouble();
	   
	double media = (v1 + v2 + v3 + v4) / 4;

	System.out.println("a media aritmetica é" + media);

	}
}