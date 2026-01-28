package OOPS;


class Animal {
	
	int a=10;
	
	void sound() {
		System.out.println("Animal Sound");
	}
	
}


class Dog extends Animal{
	
	void sound() {
		System.out.println("Dog Sound");
	}
	
	void bark() {
		System.out.println("Barking");
	}
}

class Cat extends Animal{
	void meow() {
		System.out.println("Cat Meowing");
	}
}