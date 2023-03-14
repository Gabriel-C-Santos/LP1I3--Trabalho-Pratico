//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
//dólares. Calcular e exibir o valor correspondente em Reais (R$).

import java.util.Scanner;

public class TP01Ex15{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a cotacao do dolar: ");
		double cot;
		cot = ler.nextDouble();

		System.out.println("Digite um valor em dolar: ");
		double vald;
		vald = ler.nextDouble();

		double valr = vald * cot;
		
		System.out.println("Valor em reais: " + valr);

	}
}