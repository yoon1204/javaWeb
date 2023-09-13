package prj0901;

public class 가변인자 {
	
	public void print(String ... strs){
		for(String s: strs) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		가변인자 s=new 가변인자();
		s.print("one");
		s.print("one", "two");
		s.print("one","two","three");
	}
}
