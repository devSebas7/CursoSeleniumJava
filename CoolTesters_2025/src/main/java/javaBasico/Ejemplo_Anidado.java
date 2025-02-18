package javaBasico;

public class Ejemplo_Anidado {
	public static void main(String[] args) {
		int temperatura = 25;
		
		if (temperatura > 15) {
			if (temperatura > 25) {
				System.out.println("A la playa!");
			} else {
				System.out.println("A la montaña!");
			}
		} else {
			System.out.println("A descansar... zzz");
		}
		
	}
}
