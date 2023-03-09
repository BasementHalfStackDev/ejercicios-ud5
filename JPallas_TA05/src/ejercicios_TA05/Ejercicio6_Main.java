package ejercicios_TA05;

import java.util.Scanner;

public class Ejercicio6_Main {

	public static void main(String[] args) {

		final double IVA = 21;

		Scanner input = new Scanner(System.in);

		System.out.print("Introduce el precio del producto: ");

		double precio = input.nextDouble();
		input.close();

		double preciofinal = precio + ((precio * IVA) / 100);

		System.out.println("El precio con iva es de: " + preciofinal);

	}

}
