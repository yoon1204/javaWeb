package acorn;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class AService {

	ADAO dao=new ADAO();
	
	public JSONObject getAInfo() {
		A a=new A("오사이초밥","마포구연희로");
		JSONObject o=new JSONObject();
		o.put("name", a.getName());
		o.put("place", a.getPlace());
		
		return o;
	}
	
	public JSONArray getAList() {
		
		ArrayList<A>list=new ArrayList<>();
		list.add(new A("오사이초밥","마포구연희로"));
		list.add(new A("곱분이곱창","서대문구통일로"));
		list.add(new A("연남동베르데","마포구동교로"));
		list.add(new A("작은스페인","서대문구연희로"));
		
		JSONArray arr=new JSONArray();
		for(int i=0; i<list.size(); i++) {
			A a=list.get(i);
			JSONObject o=new JSONObject();
			o.put("name", a.getName());
			o.put("place", a.getPlace());
			arr.put(o);
		}
		return arr;
	}
	
	public JSONArray getARealList() {
		
		ArrayList<A>list=dao.getAList();
		
		JSONArray arr=new JSONArray();
		for(int i=0; i<list.size(); i++) {
			A a=list.get(i);
			JSONObject o=new JSONObject();
			o.put("name", a.getName());
			o.put("place", a.getPlace());
			arr.put(o);
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		AService a=new AService();
		JSONArray result=a.getAList();
		System.out.println(result);
	}
}
