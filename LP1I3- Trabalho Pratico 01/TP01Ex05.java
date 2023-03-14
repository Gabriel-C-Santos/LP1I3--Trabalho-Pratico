//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
//será digitado.

import java.util.Scanner;

public class TP01Ex05{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o diametro da esfera: ");
		int diam;
		diam = ler.nextInt();

		double vol = 4 * Math.PI * Math.pow(diam / 2, 3) / 3;
		
		System.out.println("Volume da esfera: " + vol);

	}
}