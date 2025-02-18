package ejemploClasesObjectos;

public class DemoVehiculo {
	public static void main(String[] args) {
		// Creción de minivan
		Vehiculo minivan = new Vehiculo();
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		int rango;
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango);
		
		// Creción de carro
		Vehiculo carro = new Vehiculo();
		carro.pasajeros = 4;
		System.out.println("Numero de pasajeros en carro es: " + carro.pasajeros);
		
	}
	
}
