//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
//valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de
//percurso (em s) que serão digitados.

import java.util.Scanner;

public class TP01Ex13{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a velocidade inicial: ");
		int v0;
		v0 = ler.nextInt();

		System.out.println("Digite a aceleracao: ");
		int a;
		a = ler.nextInt();
		
		System.out.println("Digite o tempo do percurso: ");
		int t;
		t = ler.nextInt();

		double vf = (v0 + (a * t)) * 3.6;
		
		System.out.println("Velocidade final: " + vf);

	}
}