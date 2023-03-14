//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
//“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
//digitados.

import java.util.Scanner;

	public class TP01Ex14 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("digite a aresta do cubo");
	double aresta = scan.nextDouble();

	System.out.println("digite o raio da esfera");
	double raio = scan.nextDouble();

	 double volcubo = Math.pow(aresta,3);

	double volesfera = (4/3) * Math.PI * Math.pow(raio,3);
	   
	double vollivre = volcubo - volesfera;

	System.out.println("o ambiente livre entre o volume dos 2 objetos é: " + vollivre);

	}
}