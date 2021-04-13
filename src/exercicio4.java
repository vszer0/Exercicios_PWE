import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] vet = new double[100];
		
		vet[0] = scan.nextDouble();
		
		for(int i = 1; i <= vet.length; i++) {
			vet[i] = vet[i-1]/2;	
		}
		
		for(int i = 0; i <= vet.length; i++) {
			System.out.println("N["+i+"] = "+ vet[i]);
		}
	}
}
