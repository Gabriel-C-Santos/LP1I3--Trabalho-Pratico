//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
//digitados.

import java.util.Scanner;

public class TP01Ex07{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int val1;
		val1 = ler.nextInt();

		System.out.println("Digite o segundo valor: ");
		int val2;
		val2 = ler.nextInt();

		double med = Math.pow(val1 * val2, 0.5);
		
		System.out.println("Media geometrica: " + med);

	}
}