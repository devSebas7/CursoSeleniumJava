package javaBasico;

public class Ejemplo_Loop_Do_while {

	public static void main(String[] args) {
		int b = 10;
		
		do {
			// El codigo dentro del Do se ejecuta incluso si la condició n es falsa
			System.out.println("El valor de B es: " + b);
			b++;
		}while(b <= 20);

	}

}
