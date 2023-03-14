//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.

import java.util.Scanner;

public class TP01Ex11{

	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);

	System.out.println("Digite o diametro do circulo: ");
	int diam;
	diam = ler.nextInt();

	double area = Math.PI * Math.pow(diam / 2, 2);
		
	System.out.println("Valor da area: " + area);

	}
}