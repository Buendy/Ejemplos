package Arrays;
import java.util.Scanner;

public class arrayPorTecladoII {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dimensiona el tama�o del array: ");
		int n = teclado.nextInt();


		int[] vector = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Dime un valor para la posici�n " + vector[i] + ":");	
			vector[i] = teclado.nextInt();
		}
		for(int j=0; j<n;j++){
			System.out.print(vector[j]);
		}
	}

}
