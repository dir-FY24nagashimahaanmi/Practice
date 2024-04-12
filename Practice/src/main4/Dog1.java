package main4;

public class Dog1 {

	private String name;
	private int age;
	
	public void SetName(String nm) {
		name = nm;
	}
	
	public void SetAge(int ag) {
		age = ag;
	}
	
	public void ShowProfile() {
		System.out.println("名前は、" + name + "で," + age + "歳です");
	}
			
	public static void main(String[] args) {
		Dog Dog1 = new Dog();
		Dog Dog2 = new Dog();
		
		Dog1.SetName("pochi");
		Dog1.SetAge(4);
		Dog2.SetName("nino");
		Dog2.SetAge(1);
		Dog1.ShowProfile();
		Dog2.ShowProfile();
	
	}

}
