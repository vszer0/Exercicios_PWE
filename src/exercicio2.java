import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);

		double[] vet = new double[5];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = scan.nextDouble();
		}
		
		for(int i = 0; i < vet.length; i++) {
			
			if(vet[i] <= 10) {
				System.out.println("A["+i+"] = "+vet[i]);
			}
		}
	}
}