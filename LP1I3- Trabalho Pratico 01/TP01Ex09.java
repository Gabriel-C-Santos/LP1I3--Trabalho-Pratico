//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
//valores da resistência e corrente elétrica que serão digitados. Utilize a lei de
//Ohm.

import java.util.Scanner;

public class TP01Ex09{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a resistencia: ");
		int res;
		res = ler.nextInt();

		System.out.println("Digite a corrente: ");
		int cor;
		cor = ler.nextInt();

		int ten = res * cor;
		
		System.out.println("Valor da tensao: " + ten);

	}
}