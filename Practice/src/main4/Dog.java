package main4;

public class Dog {

	private String name;
	private int age;
	
	public void SetName( String nm ) {
		name = nm;
	}
	
	public void SetAge( int ag) {
		age = ag;
	}
	
	public void ShowProfile() {
		System.out.println("名前は、" + name + "で," + age + "歳です");
	}
			
	public static void main(String[] args) {
		Dog myDog = new Dog();
		
		myDog.SetName("pochi");
		myDog.SetAge(3);
		myDog.ShowProfile();
	}

}
