import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
	    String result ;
		int x, y, z ;
		
		//y ao quadrado
		//z ao cubo 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero entre 1 e 1000: ");
		x = entrada.nextInt();
		
		if( x <= 1000 && x >= 1 ) {
			for(int i = 1; i <= x; i++) {
				y = i * i;
				z = y * i;
				
				result = i + " " + y + " " +  z;
				
				System.out.println(result);
			}
		}
		else {
			System.out.print("o valor de entrada deve ser entre 1 e 1000");
		}
		
	}
}