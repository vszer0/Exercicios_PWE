//exercicio 1

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		int x, y,soma = 0,troca ;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		x = entrada.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		y = entrada.nextInt();
		
		if(x < y) {
			for(int i = x+1 ; i < y ; i++) {
				if(i % 2 == 1) {
					soma += i;
				}
			}
		
		}
		if(x > y){
			troca = x;
			x = y;
			y = troca;
			for(int i = x+1 ; i < y ; i++) {
				if(i % 2 == 1) {
					soma += i;
				}
			}
			
		}
		
		System.out.println(soma);
		
		}
		
		
	}
