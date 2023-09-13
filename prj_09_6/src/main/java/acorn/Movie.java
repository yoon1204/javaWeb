package acorn;

public class Movie {
	
	String name;
	String ranking;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	
public Movie(String name, String ranking) {
		super();
		this.name = name;
		this.ranking = ranking;
	}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getRanking() {
	return ranking;
}


public void setRanking(String ranking) {
	this.ranking = ranking;
}


@Override
public String toString() {
	return "Movie [name=" + name + ", ranking=" + ranking + "]";
}

}
