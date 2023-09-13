package acorn;

public class Food {

	String name;
	String price;
	
	public Food() {
	// TODO Auto-generated constructor stub
	}
	
	public Food(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}
	
}
