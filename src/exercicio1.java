import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int[] vet = new int[10];
        
        vet[0] = scan.nextInt();
        
        for (int i=1; i <10; i++) {
            vet[i] = vet[i-1] * 2;
        }
        
        for (int i=0; i <10; i++) {
            System.out.println("N["+ i +"] = " + vet[i]);
        }
    }
}
