package acorn;

import java.util.ArrayList;


import org.json.JSONArray;
import org.json.JSONObject;

public class MovieService {

	MovieDAO dao=new MovieDAO();
	
	public JSONObject getMovieInfo() {
		Movie movie=new Movie("오펜하이머","1");
		JSONObject o=new JSONObject();
		o.put("name", movie.getName());
		o.put("ranking", movie.getRanking());
	
		return o;
	}
	
	
	public JSONArray getMovieList() {
		
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("오펜하이머","1"));
		list.add(new Movie("타겟","2"));
		list.add(new Movie("달짝지근해:7510","3"));
		list.add(new Movie("밀수","4"));
		list.add(new Movie("엘리멘탈","5"));
		
		JSONArray arr=new JSONArray();
		for(int i=0; i<list.size(); i++) {
			Movie m=list.get(i);
			JSONObject o=new JSONObject();
			o.put("name", m.getName());
			o.put("ranking", m.getRanking());
			arr.put(o);
		}
		
		return arr;
		
	}
	
	public JSONArray getMovieRealList() {
		ArrayList<Movie> list = dao.getMovieList();
		
		JSONArray arr=new JSONArray();
		for(int i=0; i<list.size(); i++) {
			Movie m=list.get(i);
			JSONObject o=new JSONObject();
			o.put("name", m.getName());
			o.put("ranking", m.getRanking());
			arr.put(o);
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		MovieService s = new MovieService();
		JSONArray   result  = s.getMovieList();
		System.out.println( result);
		
	}
	
}
