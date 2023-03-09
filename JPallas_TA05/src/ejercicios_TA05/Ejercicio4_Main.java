package ejercicios_TA05;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio4_Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Saludos! Introduce el radio del circulo: ");

		String radiostring = input.nextLine();
		input.close();
		double radiouble = Double.parseDouble(radiostring);

		final double PI = 3.14159265358979323846;

		System.out.println("El area del circulo es: " + PI * Math.pow(radiouble, 2));

	}

}
