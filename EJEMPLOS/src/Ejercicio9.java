/**
 * Ejercicio9.java
 * Programa que calcula el factorial de un n�mero positivo introducido
 * @author Daniel
 * 3.11.2017
 */

import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main (String args[]){
		Scanner teclas = new Scanner(System.in);
		//Establecemos variables de tipo entero
		int factorial = 1;
		int NumIntroducido;
		System.out.print("Introduce un n�mero positivo: ");
		//En este primer bucle establecmos que si un n�mero es negativo nos lo indique
		do {	
			NumIntroducido = teclas.nextInt();			
			if (NumIntroducido < 0){
				System.out.print("Introduzca un n�mero positivo:");
			}			
		}
		while (NumIntroducido < 0);

		//Aqui realiza el producto y asignaci�n del n�mero introducido y nos lo muestra
		while(NumIntroducido != 0){
			factorial *= NumIntroducido;
			NumIntroducido--;
		}    
		System.out.print("El factorial del n�mero introducido es: " + factorial); 
	teclas.close();
	}
}

