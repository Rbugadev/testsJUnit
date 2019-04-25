package com.formation;

import java.util.function.BiFunction;

public class Beta {
	
	/*//1.- Forma - Usamos la implementacion para utilzar la funcion
	IAlpha alpha = new AlphaImpl(); */
	
	/*//2.- Forma -  Permite borrar la clase de implementacion porque no la utilizamos
	IAlpha alpha = new IAlpha() {
		
		@Override
		public int add(int num1, int num2) {
			return num1 + num2;
		}
	};*/
	
	
	/*//3.- Forma - Declaramos el metodo en la variable
	IAlpha alpha = (int num1, int num2) -> {
		return num1+num2;
	};*/
	
	/*// 4.- Forma - Eliminamos la palabra return
	IAlpha alpha = (int num1, int num2) -> num1 + num2;*/
	
	// 5.- Forma - Lambda, a partir de Java 8
	BiFunction<Integer, Integer, Integer> alpha = (Integer num1, Integer num2) -> num1 + num2;
	
	public void calculer(int a, int b) {
		System.out.println("La somme est "+ alpha.apply(a, b));
	}
}