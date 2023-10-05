package 추석실습;

public class program {
    private String title;
    private String genre;
    private String time;
    
   public program() {
	// TODO Auto-generated constructor stub
	   
	   
}

public program(String title, String genre, String time) {
	super();
	this.title = title;
	this.genre = genre;
	this.time = time;
}

@Override
public String toString() {
	return "program [title=" + title + ", genre=" + genre + ", time=" + time + "]";
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}
   
}