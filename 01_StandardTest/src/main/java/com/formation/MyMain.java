package com.formation;

public class MyMain {

	public static void main(String[] args) {
		
		Beta b = new Beta();
		b.calculer((Integer num1, Integer num2) -> num1 + num2);
		b.calculer((Integer num1, Integer num2) -> num1 * num2);
	}

}
