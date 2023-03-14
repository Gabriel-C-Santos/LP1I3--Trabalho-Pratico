//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
//base que serão digitados.

import java.util.Scanner;

public class TP01Ex12 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("digite a altura do cone");
	double altura = scan.nextDouble();

	System.out.println("digite o raio do cone");
	double raio = scan.nextDouble();

	double area = Math.PI * Math.pow(raio,2);
	double volume = (area * altura) / 3;

	System.out.println("o volume do cone é: " + volume);

	}
}