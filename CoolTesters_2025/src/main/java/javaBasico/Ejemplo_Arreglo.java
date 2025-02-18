package javaBasico;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
		int intArray[];
		int[] intArray2;
		
		short shortArray[];
		char charArray[];
		
		// Declarar un Array de Strings
		String[] arr;
		
		arr = new String[5];
		
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cinco";
		
		// System.out.println("Elemento en la posición 1 es: " + arr[1]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en el indice " + i + " es: " + arr[i]);
		}
		
	}

}
