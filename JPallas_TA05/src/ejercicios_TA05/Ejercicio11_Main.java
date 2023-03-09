package ejercicios_TA05;

import javax.swing.JOptionPane;

public class Ejercicio11_Main {

	public static void main(String[] args) {

		// Pido dia de la semana

		String dia = JOptionPane.showInputDialog("Introduce el dia de la semana");

		// Convierto a mayusculas para que funcione sin importar capitalizacion
		// y compruebo si es laborable. Mostrando un error si el dia introducido es
		// incorrecto

		switch (dia.toUpperCase()) {
		case "LUNES":
			JOptionPane.showMessageDialog(null, "Es un dia laborable");
			break;
		case "MARTES":
			JOptionPane.showMessageDialog(null, "Es un dia laborable");
			break;
		case "MIERCOLES":
			JOptionPane.showMessageDialog(null, "Es un dia laborable");
			break;
		case "JUEVES:":
			JOptionPane.showMessageDialog(null, "Es un dia laborable");
			break;
		case "VIERNES":
			JOptionPane.showMessageDialog(null, "Es un dia laborable");
			break;
		case "SABADO":
			JOptionPane.showMessageDialog(null, "No es un dia laborable");
			break;
		case "DOMINGO":
			JOptionPane.showMessageDialog(null, "No es un dia laborable");
			break;
		default:
			JOptionPane.showMessageDialog(null, "El dia introducido es invalido.");
		}

	}

}
