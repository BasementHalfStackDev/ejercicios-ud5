package ejercicios_TA05;

import javax.swing.JOptionPane;

public class Ejercicio12_Main {

	public static void main(String[] args) {

		// Defino contraseña

		String pass = "bootcamp2023$$";

		// Inicio loop para comprobar que la contraseña sea correcta. Con 3 intentos
		// para introducirla
		String inputpass = "";
		int i = 0;
		while (!pass.equals(inputpass) && i < 3) {
			if (i == 0) {
				inputpass = JOptionPane.showInputDialog("Introduce tu contraseña: ");
			} else if (inputpass != pass && i < 3) {
				inputpass = JOptionPane.showInputDialog("Contraseña incorrecta! " + (3 - i) + " intentos restantes.");
			}
			i++;
		}

		// Muestra mensaje final confirmando el inicio de sesion o error, dependiendo de
		// si se agotaron los intentos

		if (pass.equals(inputpass)) {
			JOptionPane.showMessageDialog(null, "Contraseña correcta. Iniciando sesion...");
		} else {
			JOptionPane.showMessageDialog(null,
					"Agotados los intentos. Tu cuenta ha sido bloqueada. Contacte con un administrador del sistema.");
		}

	}

}
