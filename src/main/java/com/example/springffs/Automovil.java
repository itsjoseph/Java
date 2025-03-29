package com.example.springffs;

import java.util.Objects;

public class Automovil {
	private String fabricante;
	private String modelo;
	private String color;
	private double cilindrada;
	private int capacidadTanque = 40;

	public Automovil() {

	}

	public Automovil(String fabricante, String modelo) {
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public Automovil(String fabricante, String modelo, String color, double cilindrada) {
		this(fabricante, modelo);
		this.color = color;
		this.cilindrada = cilindrada;
	}

	public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
		this(fabricante, modelo, color, cilindrada);
		this.capacidadTanque = capacidadTanque;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCapacidadTanque() {
		return capacidadTanque;
	}

	public void setCapacidadTanque(int capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	public void detalle() {
		System.out.println("fabricante: " + this.fabricante);
		System.out.println("modelo: " + this.modelo);
		System.out.println("color: " + this.color);
		System.out.println("cilindrada: " + this.cilindrada);
	}

	public String acelerar(int rpm) {
		return this.modelo + " acelerando a: " + rpm + " rpm";
	}

	public String franado() {
		return this.modelo + " frenando";
	}

	public float calcularConsumo(int km, float gasolina) {
		return km / (gasolina * capacidadTanque);
	}

	public float calcularConsumo(int km, int gasolina) {
		return km / (gasolina * (capacidadTanque / 100f));
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacidadTanque, cilindrada, color, fabricante, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		Automovil other = (Automovil) obj;
		return this.modelo.equals(other.getModelo()) && this.fabricante.equals(other.getFabricante());
	}
	
	

}
