//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
//valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
//que deverá ser devolvido.

import java.util.Scanner;

public class TP01Ex18 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("digite o valor do produto 1");
	double prod1 = scan.nextDouble();

	System.out.println("digite o valor do produto 2");
	double prod2 = scan.nextDouble();

	System.out.println("digite o valor do produto 3");
	double prod3 = scan.nextDouble();

	System.out.println("digite o valor do produto 4");
	double prod4 = scan.nextDouble();

	System.out.println("digite o valor do produto 5");
	double prod5 = scan.nextDouble();

	System.out.println("digite o valor que sera pago");
	double pg = scan.nextDouble();

	double troco = pg - (prod1 + prod2 + prod3 + prod4 + prod5);

	System.out.println("o troco da compra sera de: " + troco + " reais");

	}
}