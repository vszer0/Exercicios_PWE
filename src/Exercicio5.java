import java.util.Scanner;

public class Exercicio5 {

	public static void main(String args[]) {
		
		int nl, x = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o numero de testes desejados: ");
		nl = scan.nextInt();
		
		for(int i = x; i <= nl; i++) {
			x = scan.nextInt();
			
			if (x%2 != 0 && x%3 != 0){
                System.out.println(x + " eh primo");
			}
			else {
				System.out.print(x + " nao eh primo");
			}
		}
			
	}
}
		