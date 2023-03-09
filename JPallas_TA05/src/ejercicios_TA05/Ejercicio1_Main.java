package ejercicios_TA05;

public class Ejercicio1_Main {

	public static void main(String[] args) {
		
		int n1 = 15;
		int n2 = 10;
		
		// Comprobar si la primera es mayor. Si no es el caso, comprobar si la segunda es mayor.
		// Si ninguna de las condiciones aplica, la única posibilidad restante es que sean iguales.
		
		if(n1 > n2)
			System.out.println(n1+" es mayor que "+n2+".");
		else if (n2 > n1)
			System.out.println(n2+" es mayor que "+n1+".");
		else
			System.out.println("Los dos valores son iguales.");
		
		
	}

}
