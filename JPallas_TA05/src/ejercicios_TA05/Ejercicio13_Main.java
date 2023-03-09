package ejercicios_TA05;

import javax.swing.JOptionPane;

public class Ejercicio13_Main {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("Introduce el primer numero");
		String n2 = JOptionPane.showInputDialog("Introduce el segundo numero");
		String operacion = JOptionPane
				.showInputDialog("Introduce el caracter de la operacion a realizar. (+ suma, - resta, * multiplicacion,"
						+ " / division, ^ operando (con primer numero de base y segundo de exponente), % modulo,"
						+ " resto de la division entre el primer y segundo numero");

		double d1 = Double.parseDouble(n1);
		double d2 = Double.parseDouble(n2);

		switch (operacion) {
		case "+":
			JOptionPane.showMessageDialog(null,
					"El resultado de la suma entre " + n1 + " y " + n2 + " es de: " + (d1 + d2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null,
					"El resultado de la resta entre " + n1 + " y " + n2 + " es de: " + (d1 - d2));
			break;
		case "*":
			JOptionPane.showMessageDialog(null,
					"El resultado de la multiplicacion entre " + n1 + " y " + n2 + " es de: " + (d1 * d2));
			break;
		case "/":
			JOptionPane.showMessageDialog(null,
					"El resultado de la division entre " + n1 + " y " + n2 + " es de: " + (d1 / d2));
			break;
		case "^":
			JOptionPane.showMessageDialog(null,
					"El resultado de del numero " + n1 + " elevado a " + n2 + " es de: " + (Math.pow(d1, d2)));
			break;
		case "%":
			JOptionPane.showMessageDialog(null,
					"El resto del numero " + n1 + " dividido por " + n2 + " es de: " + (d1 % d2));
			break;
		default:
			JOptionPane.showMessageDialog(null,
					"Ha ocurrido un error inesperado. Compruebe que ha introducido los datos correctamente");
		}
	}
}
