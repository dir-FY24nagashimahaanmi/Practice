package main4;

public class Cat extends Animal {
	
	public void Sleep() {
		System.out.println("スースー");
	}

	public static void main(String[] args) {
		Cat myCat = new Cat();
		
		myCat.name = "nino";
		myCat.age = 5;
		myCat.ShowProfile();
		myCat.Sleep();

	}

}
