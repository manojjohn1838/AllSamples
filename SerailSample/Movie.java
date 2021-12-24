package SerailSample;

import java.io.Serializable;

public class Movie implements Serializable
{
	
	int id;
	String name;
	String language;
	
	transient double rating;

	public Movie(int id, String name, String language, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.rating = rating;
	}
	
	
	
	
	

}
