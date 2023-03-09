package ejercicios_TA05;

import java.util.Scanner;

public class Ejercicio3_Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hola! Como te llamas?: ");
		
		String nombre = input.nextLine();
		input.close();
		
		System.out.println("Un placer "+nombre+"! Bienvenido!");

	}

}
