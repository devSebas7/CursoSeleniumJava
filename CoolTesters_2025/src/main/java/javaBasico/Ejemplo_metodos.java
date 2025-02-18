package javaBasico;

public class Ejemplo_metodos {
	
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}	
	
	public static String carro(int a) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		return cars[a];
	}
	
	public static void ejemploVoid() {
		System.out.println("Metodo Void");
	}

	public static void main(String[] args) {
		int resultado = suma(2, 80);
		System.out.println(resultado);
		
		int resultado2 = suma(27, 780, 200);
		System.out.println(resultado2);
		
		System.out.println(carro(2));
		
		ejemploVoid();

	}

}
