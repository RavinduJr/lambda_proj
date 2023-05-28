package com.lambda.main;

import com.lambda.abstracts.Animal;

class Pig extends Animal {

	@Override
	public void animalSounds() {
		System.out.println("Oink");
		
	}

	

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pig pig = new Pig();
		pig.animalName("pig");
		pig.animalSounds();
	}

}
