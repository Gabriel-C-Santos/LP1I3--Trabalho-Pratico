//Gabriel Coutinho dos Santos e Leonardo Pinto Teixeira

//8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
//dois metros e que um quilômetro possui mil metros, fazer um programa para
//converter milhas marítimas em quilômetros.
 
 import java.util.Scanner;

	public class TP01Ex08 {

	   public static void main(String[] args) {

	   Scanner scan = new Scanner(System.in);

	   System.out.println("digite o valor da milha maritima");
	   double milha = scan.nextDouble();
	   
	   double metros = 1852 * milha;

	   double km = 1000 * metros ;

	   System.out.println("o valor da milha em quilometros é: " + km);

	}
   }