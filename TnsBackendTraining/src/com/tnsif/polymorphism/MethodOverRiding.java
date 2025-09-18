package com.tnsif.polymorphism;


	class Dog{
		public void eat() {
			System.out.println("Eating to be healthy");
		}
		public void sounds() {
			System.out.println("the dog braks");
		}
	}
	class Cow extends Dog{
		public void sounds() {
			System.out.println("the cow says moh moh");

		}
	}
	class Horse extends Dog{
		public void sounds() {
			System.out.println("the horse says neigh neigh");
		}
	}


