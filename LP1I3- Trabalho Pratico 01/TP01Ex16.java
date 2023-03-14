//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
//seguintes funções trigonométricas: seno, cosseno, tangente e secante deste
//ângulo. Lembre-se que uma função trigonométrica trabalha em radianos.

import java.util.Scanner;

public class TP01Ex16{

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("digite o angulo em graus");
	double graus = scan.nextDouble();

	double radianos = graus * 0.0174533;
	   
	double seno = Math.sin(radianos);
	   
	double cosseno = Math.cos(radianos);

	double tangente = Math.tan(radianos);

	double secante = 1/cosseno;

	System.out.println("o valor das funções, respectivamente, é: " + seno + ", "
	+ cosseno + ", " + tangente + ", " + secante);

	}
}