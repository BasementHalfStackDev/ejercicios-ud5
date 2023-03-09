package ejercicios_TA05;

import javax.swing.JOptionPane;

public class Ejercicio10_Main {

	public static void main(String[] args) {

		// Pido numero de ventas realizadas

		String numVentas = JOptionPane.showInputDialog("Introduce el numero de ventas");

		// Convierto a int

		int intVentas = Integer.parseInt(numVentas);

		// Creo un bucle para pedir el numero de unidades vendidas en cada venta

		int i = 1;
		int ventasTotal = 0;
		while (i <= intVentas + 2) {
			String ventaIndividual = JOptionPane
					.showInputDialog("Introduce el numero de unidades vendidas en la venta " + i);
			ventasTotal = ventasTotal + Integer.parseInt(ventaIndividual);
			intVentas--;
			i++;
		}

		// Muestro el total de unidades vendidas

		JOptionPane.showMessageDialog(null, "El numero de ventas total es de " + ventasTotal);

	}

}
