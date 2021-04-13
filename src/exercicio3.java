import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int troca;
        
        int[] vet = new int[20];
        
        for (int i=0; i < vet.length; i++) {
            vet[i] = scan.nextInt();
        }
        for (int i=0; i < (vet.length / 2); i++) {
        	troca = vet[i];
        	vet[i] = vet[vet.length - 1 - i];
        	vet[vet.length - 1 -i] = troca;
        }
        for (int i=0; i < vet.length; i++) {
            System.out.println("N["+ i +"] = " + vet[i]);
        }
    }
	
	}

