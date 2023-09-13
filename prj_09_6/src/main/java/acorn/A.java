package acorn;

public class A {

	String name;
	String place;
	
	public A() {
		// TODO Auto-generated constructor stub
	}

	public A(String name, String place) {
		super();
		this.name = name;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "a [name=" + name + ", place=" + place + "]";
	}
	
	
}
