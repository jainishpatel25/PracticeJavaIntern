package OOPS;

public class ObjectCasting {
	
	
	public static void main(String[] args) {
		
//		Dog d = new Dog();
//		d.bark();
//		d.sound();

		
//		Animal a = new Animal();
//		a.sound();
		
		
//		Animal a1 = new Dog();
//		System.out.println("Up Casting dog -> Animal");
//		a1.sound();
//		System.out.println("-------------------------");
//		
//		System.out.println("Down Casting Animal -> Dog");
//		Dog dog = (Dog) a1;
//		dog.sound();
//		dog.bark();
		
		
//		Dog d2= new Dog();
//		Animal a3 = d2;
//		a3.sound();
//		
		
		Animal a = new Cat() ;
		Animal a1 = new Dog() ;
//		Dog d = (Dog) a;
//		Cat c = (Cat) a;
//		c.meow();
//		((Cat) a).meow();
		
		
		if(a instanceof Cat) {
			Cat c = (Cat) a;
			c.meow();
		}else {
			System.out.println("Not A cat");
		}
		
		if(a1 instanceof Animal) {
			Cat c = (Cat) a1;
			c.meow();
		}else {
			System.out.println("Not A cat");
		}
		
		
	}

}



