package com.example.springffs;

public class Main {
	public static void main(String[] args) {
		Automovil auto = new Automovil("Subaru", "Impreza");
		auto.setCilindrada(2.);
		auto.setColor("Blanco");

		System.out.println();

		Automovil mazda = new Automovil("Mazda", "Mazda 3", "Rojo", 60);
		Automovil nissan = new Automovil("Sentra", "Sentra 3", "Verde", 2.6, 70);
		Automovil nissan2 = new Automovil("Sentra", "Sentra 3", "Verde", 2.6, 70);


		auto.detalle();
		mazda.detalle();
		nissan.detalle();
		
		System.out.println(auto.acelerar(200));
		System.out.println(auto.franado());

		System.out.println();

		System.out.println(mazda.acelerar(200));
		System.out.println(mazda.franado());

		System.out.println("Kilometros por litro: " + mazda.calcularConsumo(300, 0.6f));
		System.out.println("Kilometros por litro: " + mazda.calcularConsumo(300, 60));

		
		///EQUALS
		System.out.println("Son iguales: " + (nissan == nissan2));
		System.err.println("Son iguales equals: " + nissan.equals(nissan2));
		
		System.out.println("Nissan: "+nissan.hashCode());
		System.out.println("Nissan2: "+nissan2.hashCode());
		System.out.println("Mazda: "+mazda.hashCode());
	}
}