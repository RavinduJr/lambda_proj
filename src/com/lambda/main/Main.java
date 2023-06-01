package com.lambda.main;

import com.lambda.abstracts.Animal;
import com.lambda.interfaces.Calculations;
import com.lambda.interfaces.ICalculateService;

class Pig extends Animal {

	@Override
	public void animalSounds() {
		System.out.println("Oink");

	}

}

class Calculator implements Calculations {

	@Override
	public void calculateTotal() {
		System.out.println("yo");
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c = new Calculator();
		
		c.calculateTotal();
ICalculateService cal = () -> {
	
};
		Pig pig = new Pig();
		pig.animalName("pig");
		pig.animalSounds();
	}

}
