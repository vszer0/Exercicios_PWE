import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int x,y,soma = 0,troca ;
		
		Scanner entrada = new Scanner(System.in);
	
		do {
		
			System.out.print("Digite o primeiro número: ");
			x = entrada.nextInt();
			
			System.out.print("Digite o segundo numero: ");
			y = entrada.nextInt();
			
			if(x < y) {
				for(int i = x; i <= y; i++) {
					System.out.print(i + " ");
					soma += i;
				}
					
			}
			if(x > y){
				
				troca = x;
				x = y;
				y = troca;
				
				for(int i = x; i <= y; i++) {
					System.out.print(i + " ");
					soma += i;
				}
			}
			else {
				System.out.println(" ");
			}
					
			System.out.println("sum=" + soma);  
		} 
		while(x != 0 && y != 0);
			
		}
	}
	
