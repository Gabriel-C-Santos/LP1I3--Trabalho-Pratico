//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
//exibir sua temperatura equivalente em Fahrenheit.

import java.util.Scanner;

public class TP01Ex10{

	public static void main(String[] args){

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