package page;

public class Coffee {

	String code;
	String name;
	String price;
	
	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(String code, String name, String price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Coffee [code=" + code + ", name=" + name + ", price=" + price + "]";
	}

}
