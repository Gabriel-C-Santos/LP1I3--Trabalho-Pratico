//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
//cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.

import java.util.Scanner;

public class TP01Ex17{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o valor de x: ");
		double x;
		x = ler.nextDouble();

		System.out.println("Digite o valor de y: ");
		double y;
		y = ler.nextDouble();

		double pot = Math.pow(x, y);
		
		System.out.println("XY: " + pot);

	}
}