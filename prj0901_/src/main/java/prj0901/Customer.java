package prj0901;

// class type 정의 <= 고객정보 (구조가 있는 데이터)를 담을 수 있는 자료형 만드는것 !!!!!!!
// class type로 변수를 만들 때는 반드시new를 통해서 변수가 만들어진다. 변수를 객체라고 부른다.
public class Customer {

	String id;
	String pw;
	String name;

	// 생성자
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public Customer(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
