package ejercicios_TA05;

import java.util.Scanner;

public class Ejercicio5_Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Saludos! Introduce un numero para comprobar si es divisible entre 2: ");

		int numero = input.nextInt();
		input.close();

		if (numero % 2 == 0) {
			System.out.println("El numero si es divisible.");
		} else {
			System.out.println("El numero no es divisible.");
		}

	}

}
