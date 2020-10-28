package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {}
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
			name = pname;
			height = pheight;
			weight = pweight;
	}
	
	public void showPersonInfo() {
		System.out.println(name + " , " + height + " , " + weight);
	}

}
