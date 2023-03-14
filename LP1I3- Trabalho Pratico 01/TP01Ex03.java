//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
//digitado.

import java.util.Scanner;

public class TP01Ex03{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a diagonal do quadrado: ");
		int diag;
		diag = ler.nextInt();

		double lado = diag / Math.pow(2, 0.5);
		
		System.out.println("Lado do quadrado: " + lado);
		System.out.println("Area do quadrado: " + 2 * lado);

	}
}