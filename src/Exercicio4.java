import java.util.Scanner;

public class Exercicio4 {

	public static void main(String args[]) {
		
		int x = 0, gasolina = 0, alcool = 0, diesel = 0 ;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("digite o código dos produtos utilizados: ");
		
		while (x != 4) {
			
			x = scan.nextInt();
			
			if(x == 1) {
				alcool ++;
			}
			if(x == 2) {
				gasolina ++;
			}
			if(x == 3) {
				diesel ++;
			}		
	}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.print("Diesel: " + diesel);
}
}